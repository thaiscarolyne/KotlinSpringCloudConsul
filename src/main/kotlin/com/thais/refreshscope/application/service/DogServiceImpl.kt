package com.thais.refreshscope.application.service

import com.thais.refreshscope.application.config.Configuration
import com.thais.refreshscope.application.port.DogService
import org.springframework.stereotype.Service

@Service
class DogServiceImpl(var configuration: Configuration): DogService {

    override fun getName(): String {
        return configuration.getName()
    }

    override fun getAge(): Int {
        return  configuration.getAge()
    }
}