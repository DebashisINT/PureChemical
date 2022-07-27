package com.vookiretailfsm.features.login.model.productlistmodel

import com.vookiretailfsm.app.domain.ModelEntity
import com.vookiretailfsm.app.domain.ProductListEntity
import com.vookiretailfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}