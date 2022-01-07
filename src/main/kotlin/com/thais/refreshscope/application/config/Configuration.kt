package com.thais.refreshscope.application.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties
open class Configuration
{
    private var name = ""
    private var age = 0

    fun getName(): String {
        return name;
    }

    fun setName(value: String){
        name = value
    }

    fun getAge(): Int {
        return age;
    }

    fun setAge(value: Int){
        age = value
    }
}