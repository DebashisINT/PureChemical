package com.vookiretailfsm.features.viewAllOrder.interf

import com.vookiretailfsm.app.domain.NewOrderGenderEntity
import com.vookiretailfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}