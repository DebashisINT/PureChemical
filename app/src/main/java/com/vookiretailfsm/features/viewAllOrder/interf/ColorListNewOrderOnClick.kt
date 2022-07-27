package com.vookiretailfsm.features.viewAllOrder.interf

import com.vookiretailfsm.app.domain.NewOrderColorEntity
import com.vookiretailfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}