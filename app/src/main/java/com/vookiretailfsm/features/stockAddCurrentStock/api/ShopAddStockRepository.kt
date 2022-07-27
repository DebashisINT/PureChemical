package com.vookiretailfsm.features.stockAddCurrentStock.api

import com.vookiretailfsm.base.BaseResponse
import com.vookiretailfsm.features.location.model.ShopRevisitStatusRequest
import com.vookiretailfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.vookiretailfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.vookiretailfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.vookiretailfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}