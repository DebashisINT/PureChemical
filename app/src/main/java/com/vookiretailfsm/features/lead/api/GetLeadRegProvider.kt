package com.vookiretailfsm.features.lead.api

import com.vookiretailfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.vookiretailfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}