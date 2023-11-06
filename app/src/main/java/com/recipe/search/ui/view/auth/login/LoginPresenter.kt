package com.recipe.search.ui.view.auth.login

import com.recipe.search.base.BasePresenter
import javax.inject.Inject

class LoginPresenter  @Inject
constructor(view: LoginContract.View) :

    BasePresenter<LoginContract.View>(view),
    LoginContract.Presenter{


}