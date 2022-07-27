package com.vookiretailfsm.features.viewAllOrder.model

import com.vookiretailfsm.app.domain.NewOrderColorEntity
import com.vookiretailfsm.app.domain.NewOrderGenderEntity
import com.vookiretailfsm.app.domain.NewOrderProductEntity
import com.vookiretailfsm.app.domain.NewOrderSizeEntity
import com.vookiretailfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

