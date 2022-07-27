package com.vookiretailfsm.features.document.api

import com.vookiretailfsm.features.dymanicSection.api.DynamicApi
import com.vookiretailfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}