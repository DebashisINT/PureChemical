package com.vookiretailfsm.features.orderList.model

import com.vookiretailfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}