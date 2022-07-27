package com.vookiretailfsm.features.location.shopRevisitStatus

import com.vookiretailfsm.base.BaseResponse
import com.vookiretailfsm.features.location.model.ShopDurationRequest
import com.vookiretailfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}