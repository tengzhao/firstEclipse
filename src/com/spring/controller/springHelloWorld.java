package com.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class springHelloWorld {

  @RequestMapping(value = "/welcome", method = RequestMethod.GET)
  public ModelAndView helloWorld() {
  System.out.println("WelcomeHome Page Requested "); 
  String message =
  "<br><div style='text-align:center;'>" +
  "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>"; 
  return new ModelAndView("welcome", "message", message); }
 

  /*public String home(Locale locale, Model model) {
  System.out.println("WelcomeHome Page Requested, locale = " + locale); Date
  date = new Date(); DateFormat dateFormat =
  DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
  
  String formattedDate = dateFormat.format(date);
  
  model.addAttribute("serverTime", formattedDate);
  
  return "home"; }*/
 
}

/*
 * @Controller public class springHelloWorld {
 * 
 *//**
	 * Simply selects the home view to render by returning its name.
	 *//*
		 * @RequestMapping(value = "/", method = RequestMethod.GET) public String
		 * home(Locale locale, Model model) {
		 * System.out.println("Home Page Requested, locale = " + locale); String message
		 * = "<br><div style='text-align:center;'>" +
		 * "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>"
		 * ; model.addAttribute("message", message); return "welcome"; } }
		 */
