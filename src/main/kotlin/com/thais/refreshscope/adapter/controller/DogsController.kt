package com.thais.refreshscope.adapter.controller

import com.thais.refreshscope.application.port.DogService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DogsController(private val dogService: DogService) {

    @GetMapping("/name")
    fun getName(): String{
        return dogService.getName()
    }

    @GetMapping("/age")
    fun getAge(): Int{
        return dogService.getAge()
    }
}