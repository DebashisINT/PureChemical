package com.vookiretailfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.vookiretailfsm.app.FileUtils
import com.vookiretailfsm.base.BaseResponse
import com.vookiretailfsm.features.NewQuotation.model.*
import com.vookiretailfsm.features.addshop.model.AddShopRequestData
import com.vookiretailfsm.features.addshop.model.AddShopResponse
import com.vookiretailfsm.features.damageProduct.model.DamageProductResponseModel
import com.vookiretailfsm.features.damageProduct.model.delBreakageReq
import com.vookiretailfsm.features.damageProduct.model.viewAllBreakageReq
import com.vookiretailfsm.features.login.model.userconfig.UserConfigResponseModel
import com.vookiretailfsm.features.myjobs.model.WIPImageSubmit
import com.vookiretailfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}