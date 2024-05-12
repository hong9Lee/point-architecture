package com.example.pointedge.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import service.CalcPointService

@RestController
class CalcPointController(private val calcPointService: CalcPointService) {

    @GetMapping("/hello")
    fun hello(): String {
        calcPointService.createPointEvent()
        return "Hello";
    }
}
