package com.recipe.search.utils

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.recipe.search.R
import com.recipe.search.base.MvpBaseActivity
import com.recipe.search.data.prefs.PrefKeys
import com.recipe.search.data.prefs.PreferenceManager
import com.recipe.search.ui.view.auth.login.LoginActivity
import com.recipe.search.ui.view.dashboard.DashBoardActivity
import com.recipe.search.ui.dialog.DialogError
import com.recipe.search.ui.dialog.DialogSuccess
import com.recipe.search.ui.view.auth.login.LoginPresenter
import io.appwrite.Client
import io.appwrite.ID
import io.appwrite.exceptions.AppwriteException
import io.appwrite.services.Account
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.withTimeout
import java.net.SocketException


class AppwriteInit(myContext: Context) {

    var loader: AlertDialog? = null
    var dialogError: DialogError? = null
    var dialogSuccess: DialogSuccess? = null


    private lateinit var mPrefManager: PreferenceManager

    lateinit var myContext: Context



    init {
        this.myContext = myContext;
    }



    val client = Client(myContext)
        .setEndpoint("http://penciltech001.penciltech.xyz:9080/v1") // Your Appwrite Endpoint
        .setProject("65489eefaa3bd07f3d1a")                // Your project ID
        .setSelfSigned(true)
        .addHeader("Timeout","30000")

    var account = Account(client)

    suspend fun login(email: String, password: String) {

        try {

            val user = account.createEmailSession(
                email = email,
                password = password

            )

            mPrefManager = PreferenceManager(myContext)
            mPrefManager.put(PrefKeys.LOGGED_IN, true)
            mPrefManager.put(PrefKeys.TOKEN, user.providerAccessToken)

            Navigator.sharedInstance.navigate(myContext, DashBoardActivity::class.java)

            Thread {
                Looper.prepare()
                val handler = Handler()

                handler.post {
                    Toast.makeText(myContext, "Login Successfully", Toast.LENGTH_SHORT).show()
                    loader?.cancel()
                }
                Looper.loop()
            }.start()


        } catch (exception: AppwriteException) {

            loader?.cancel()

            Log.d("exception", exception.toString())
            val errorMessage = exception.message

            Thread {

                Looper.prepare()
                val handler = Handler()
                handler.post {

                    showErrorDialog(errorMessage.toString())

                }

                Looper.loop()
            }.start()


        }

    }

    suspend fun register(name: String, email: String, password: String) {
        try {
            val user = account.create(
                userId = ID.unique(),
                name = name,
                email = email,
                password = password
            )

            mPrefManager = PreferenceManager(myContext)
            mPrefManager.put(PrefKeys.LOGGED_IN, true)

            Navigator.sharedInstance.navigate(myContext, DashBoardActivity::class.java)

            Log.d("user email :", user.email)

            Thread {

                Looper.prepare()
                val handler = Handler()

                handler.post {

                    Toast.makeText(myContext, "Create Account Successfully", Toast.LENGTH_SHORT)
                        .show()

                    loader?.cancel()
                }

                Looper.loop()
            }.start()

        } catch (exception: AppwriteException) {



            Log.d("exception", exception.toString())

            val errorMessage = exception.message

            Thread {
                Looper.prepare()
                val handler = Handler()
                handler.post {
                    showErrorDialog(errorMessage.toString())
                    loader?.cancel()
                }

                Looper.loop()
            }.start()
        }

    }

    suspend fun logout() {
        try {
            val log_out = account.deleteSessions()

            Navigator.sharedInstance.navigate(myContext, LoginActivity::class.java)


        } catch (e: AppwriteException) {
            Log.d("exception", e.toString())

        }
    }


    fun showErrorDialog(msz: String) {

        var dialogBuilder = AlertDialog.Builder(myContext)
        var layoutView = LayoutInflater.from(myContext).inflate(R.layout.dialog_error, null)
        var dialogButton = layoutView.findViewById(R.id.btn_positive) as Button
        var dialogMessage = layoutView.findViewById<TextView>(R.id.tv_message)
        dialogBuilder.setView(layoutView)
        var alertDialog = dialogBuilder.create()
        alertDialog.show()
        alertDialog.setCancelable(false)

        dialogMessage.text = msz
        dialogButton.setOnClickListener {
            loader?.cancel()

            alertDialog.dismiss()
        }


    }


}



