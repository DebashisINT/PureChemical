package com.vookiretailfsm.features.weather.api

import com.vookiretailfsm.base.BaseResponse
import com.vookiretailfsm.features.task.api.TaskApi
import com.vookiretailfsm.features.task.model.AddTaskInputModel
import com.vookiretailfsm.features.weather.model.ForeCastAPIResponse
import com.vookiretailfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}