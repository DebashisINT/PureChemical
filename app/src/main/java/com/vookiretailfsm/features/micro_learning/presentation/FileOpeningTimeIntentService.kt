package com.vookiretailfsm.features.micro_learning.presentation

import android.app.IntentService
import android.content.Intent
import com.vookiretailfsm.R
import com.vookiretailfsm.app.NetworkConstant
import com.vookiretailfsm.app.Pref
import com.vookiretailfsm.app.utils.AppUtils
import com.vookiretailfsm.app.utils.Toaster
import com.vookiretailfsm.base.BaseResponse
import com.vookiretailfsm.base.presentation.BaseActivity
import com.vookiretailfsm.features.dashboard.presentation.DashboardActivity
import com.vookiretailfsm.features.micro_learning.api.MicroLearningRepoProvider
import com.elvishew.xlog.XLog
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class FileOpeningTimeIntentService : IntentService("") {

    override fun onHandleIntent(p0: Intent?) {

        val id = p0?.getStringExtra("id")
        val startTime = p0?.getStringExtra("start_time")

        val repository = MicroLearningRepoProvider.microLearningRepoProvider()
        BaseActivity.compositeDisposable.add(
                repository.updateFileOpeningTime(id!!, startTime!!)
                        .subscribe({ result ->
                            val response = result as BaseResponse
                            XLog.d("UPDATE FILE OPENING TIME: " + "RESPONSE : " + response.status + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + response.message)
                        }, { error ->
                            XLog.d("UPDATE FILE OPENING TIME: " + "ERROR : " + "\n" + "Time : " + AppUtils.getCurrentDateTime() + ", USER :" + Pref.user_name + ",MESSAGE : " + error.localizedMessage)
                            error.printStackTrace()
                        })
        )
    }
}