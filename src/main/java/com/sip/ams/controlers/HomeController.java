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
		
		ArrayList names = new ArrayList<String>(Arrays.asList(liste));
		
		String formation ="fullstack";
	System.out.println("méthode info");
	model.addAttribute("workshop", formation);
	
	model.addAttribute("name",names);
	   return "home/info" ; // le nom de la template
   }
	@RequestMapping("/affichage")
	   public String affichage()
	   {
		   return "home/affichage" ;
	   }
}
