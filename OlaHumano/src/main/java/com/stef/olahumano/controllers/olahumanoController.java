package com.stef.olahumano.controllers;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class olahumanoController {

	public static void main(String[] args) {
		SpringApplication.run(olahumanoController.class, args);
	}
	
    @RequestMapping("")
    public String hello() {
    	return "oi tudo bem ";
    }
    
    @RequestMapping("/{name}")
    public String helloName(@PathVariable("name")String name) {
    	return "oi, tudo bem  " + name + " que legal te ver";
    }
    
    @RequestMapping("/{name}/{sobrenome}")
    public String hellofullname(@PathVariable("name")String name, @PathVariable("sobrenome")String sobrenome) {
    	return "oi, tudo bem  " + name + "  " + sobrenome +"   que legal te ver";
    }
    
    @RequestMapping("/times/{input}/{number}")
    public String inputTimesNumber(@PathVariable("input")String input, @PathVariable("number")int num) {
    	String list = "";
    	for (int i = 1; i<=num; i++) {
    		list += input + " ";
    	}
    	return list;
    }
}