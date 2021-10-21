package com.thais.refreshscope

import com.thais.refreshscope.application.config.Configuration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(Configuration::class)
class SpringRefreshScopeApplication

fun main(args: Array<String>) {
	runApplication<SpringRefreshScopeApplication>(*args)
}
