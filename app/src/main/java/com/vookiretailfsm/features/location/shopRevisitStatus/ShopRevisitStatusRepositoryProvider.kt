package com.vookiretailfsm.features.location.shopRevisitStatus

import com.vookiretailfsm.features.location.shopdurationapi.ShopDurationApi
import com.vookiretailfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}