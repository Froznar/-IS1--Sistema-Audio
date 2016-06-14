package com.Hertzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@Controller
public class HertzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(HertzzApplication.class, args);
	}
	
		
	@RequestMapping("/Hertzz")
	@ResponseBody
	public void login(String opcion){
		
	}
}
