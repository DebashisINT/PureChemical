package com.vookiretailfsm.features.stockAddCurrentStock.api

import com.vookiretailfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.vookiretailfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}