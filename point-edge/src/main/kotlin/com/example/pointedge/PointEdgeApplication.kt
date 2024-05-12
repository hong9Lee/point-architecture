package com.example.pointedge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.pointedge", "service"])
class PointEdgeApplication

fun main(args: Array<String>) {
    runApplication<PointEdgeApplication>(*args)
}
