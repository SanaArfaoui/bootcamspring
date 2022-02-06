package com.sip.ams.controlers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/info") //ce que  je tape dans l'url
   public String info(Model model)
   
   
   {
		
		String liste[] = new String[]{"OCP","oca","Spring","Angular"};
		
		ArrayList arlist = new ArrayList(Arrays.asList(liste));
		
		String formation ="fullstack";
	System.out.println("méthode info");
	model.addAttribute("workshop", formation);
	
	model.addAttribute("tableau",arlist);
	   return "home/info" ; // le nom de la template
   }
	@RequestMapping("/affichage")
	   public String affichage()
	   {
		   return "home/affichage" ;
	   }
}
