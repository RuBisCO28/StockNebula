package com.rubisco.stocknebula

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StockNebulaApplication

fun main(args: Array<String>) {
	runApplication<StockNebulaApplication>(*args)
}
