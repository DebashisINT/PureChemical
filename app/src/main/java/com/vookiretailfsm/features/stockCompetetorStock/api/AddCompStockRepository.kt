package com.vookiretailfsm.features.stockCompetetorStock.api

import com.vookiretailfsm.base.BaseResponse
import com.vookiretailfsm.features.orderList.model.NewOrderListResponseModel
import com.vookiretailfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.vookiretailfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}