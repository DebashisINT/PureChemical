package com.vookiretailfsm.features.dashboard.presentation.api.dayStartEnd

import com.vookiretailfsm.app.Pref
import com.vookiretailfsm.base.BaseResponse
import com.vookiretailfsm.features.dashboard.presentation.model.DaystartDayendRequest
import com.vookiretailfsm.features.dashboard.presentation.model.StatusDayStartEnd
import com.vookiretailfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.vookiretailfsm.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}