package com.thais.refreshscope.application.service

import com.thais.refreshscope.application.config.Configuration
import com.thais.refreshscope.application.port.DogService
import org.springframework.stereotype.Service

@Service
class DogServiceImpl(private val configuration: Configuration): DogService {

    override fun getName(): String {
        return configuration.name
    }

    override fun getAge(): Int {
        return configuration.age
    }
}