package com.vookiretailfsm.features.newcollectionreport

import com.vookiretailfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}