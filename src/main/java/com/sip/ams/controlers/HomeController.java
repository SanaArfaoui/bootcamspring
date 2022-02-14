package com.sip.ams.controlers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/information") //ce que je tappe dans l'url
   public String info(Model model)
   
   {
		String formation ="Fullstack";
	 System.out.println("methode info");
	 model.addAttribute("workshop",formation);
	   return "home/info" ; // le nom de la template
   }
	@RequestMapping("/affichage")
	   public String affichage()
	   {
		 System.out.println("methode affichage");
		   return "home/affichage" ;
	   }
}
