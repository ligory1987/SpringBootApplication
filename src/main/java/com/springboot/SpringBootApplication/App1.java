package com.springboot.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/app")
public class App1{
	@RequestMapping(value="/{hello}",method=RequestMethod.GET,produces="application/json")
	String hello(@PathVariable("hello") String hello) {
		return hello;
	}
	
    public static void main( String[] args ) throws Exception{
        SpringApplication.run(App1.class, args);
    }
}
