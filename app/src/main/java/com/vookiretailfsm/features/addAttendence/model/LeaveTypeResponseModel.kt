package com.vookiretailfsm.features.addAttendence.model

import com.vookiretailfsm.base.BaseResponse

/**
 * Created by Saikat on 22-11-2018.
 */
class LeaveTypeResponseModel : BaseResponse() {
    var leave_type_list: ArrayList<LeaveTypeDataModel>? = null
}