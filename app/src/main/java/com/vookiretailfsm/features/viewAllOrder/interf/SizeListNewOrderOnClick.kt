package com.vookiretailfsm.features.viewAllOrder.interf

import com.vookiretailfsm.app.domain.NewOrderProductEntity
import com.vookiretailfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}