package com.sip.ams.controlers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/info") //ce que je tappe dans l'url
   public String info(Model model)
   
   {
	 system.out.println("methode info");
	   return "home/info" ; // le nom de la template
   }
	@RequestMapping("/affichage")
	   public String affichage()
	   {
		   return "home/affichage" ;
	   }
}
