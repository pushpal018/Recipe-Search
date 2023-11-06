package com.recipe.search.ui.view.dashboard

import com.recipe.search.base.BasePresenter
import javax.inject.Inject

class DashBoardPresenter  @Inject constructor(view: DashBoardContract.View) :

    BasePresenter<DashBoardContract.View>(view),
    DashBoardContract.Presenter
    {


    }
