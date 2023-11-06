package com.recipe.search.ui.view.auth.signUp

import com.recipe.search.base.BasePresenter
import javax.inject.Inject

class SignUpPresenter
@Inject constructor(view: SignUpContract.View) : BasePresenter<SignUpContract.View>(view), SignUpContract.Presenter{
}