package com.thais.refreshscope.application.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.cloud.context.config.annotation.RefreshScope

@RefreshScope
@ConstructorBinding
@ConfigurationProperties(prefix = "config")
class Configuration(
    val name: String,
    val age: Int
) {
}