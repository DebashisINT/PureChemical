package com.vookiretailfsm.features.weather.api

import com.vookiretailfsm.features.task.api.TaskApi
import com.vookiretailfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}