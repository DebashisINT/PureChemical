package com.vookiretailfsm.features.dashboard.presentation.api.dayStartEnd

import com.vookiretailfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.vookiretailfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}