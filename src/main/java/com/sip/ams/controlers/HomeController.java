package com.sip.ams.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/info") //ce que  je tape dans l'url
   public String info()
   {
	System.out.println("méthode info");
	   return "home/info" ; // le nom de la template
   }
	@RequestMapping("/affichage")
	   public String affichage()
	   {
		   return "home/affichage" ;
	   }
}
