package com.vookiretailfsm.features.nearbyuserlist.api

import com.vookiretailfsm.app.Pref
import com.vookiretailfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.vookiretailfsm.features.newcollection.model.NewCollectionListResponseModel
import com.vookiretailfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}