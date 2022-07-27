package com.vookiretailfsm.features.viewAllOrder.interf

import com.vookiretailfsm.app.domain.NewOrderGenderEntity
import com.vookiretailfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}