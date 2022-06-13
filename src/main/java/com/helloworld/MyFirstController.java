package com.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/firstpage")
public class MyFirstController {
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView firstpage() {
		 
	String message = "<br><div style='text-align:center;'>" + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
	System.out.println("inside firstpage method.. Saidas Munchify");
	 return new ModelAndView("welcome", "message", message);
			}
}
