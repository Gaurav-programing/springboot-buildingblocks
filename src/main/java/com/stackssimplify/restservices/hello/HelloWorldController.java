package com.stackssimplify.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//Simple Method
	//URI
   //GET	
	
  //@RequestMapping (method = RequestMethod.GET, path = "/helloWorld")
  @GetMapping("/helloWorld1")
 public String helloWorld() {
	 return "HelloWorld1";
 }
  
  @GetMapping("/helloWorld-bean")
  public UserDetails helloWorldBean() {
	  return new UserDetails("Mahesh", "Babu", "Kota");
  }
	
}
