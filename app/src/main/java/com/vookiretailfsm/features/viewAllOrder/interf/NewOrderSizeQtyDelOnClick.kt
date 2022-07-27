package com.vookiretailfsm.features.viewAllOrder.interf

import com.vookiretailfsm.app.domain.NewOrderGenderEntity
import com.vookiretailfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}