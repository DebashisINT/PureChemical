package com.vookiretailfsm.features.addshop.model.assigntopplist

import com.vookiretailfsm.base.BaseResponse

/**
 * Created by Saikat on 03-10-2018.
 */
class AssignToPPListResponseModel : BaseResponse() {
    var assigned_to_pp_list: List<AssignToPPListDataModel>? = null
}