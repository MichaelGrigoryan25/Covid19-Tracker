package com.michaelgrigoryan.covidtracker.model

data class Response(
    val cases: Cases,
    val continent: String,
    var country: String,
    val day: String,
    val deaths: Deaths,
    val population: Int,
    val tests: Tests,
    val time: String
)