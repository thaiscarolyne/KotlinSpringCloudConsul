package com.thais.refreshscope

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringRefreshScopeApplication

fun main(args: Array<String>) {
	runApplication<SpringRefreshScopeApplication>(*args)
}
