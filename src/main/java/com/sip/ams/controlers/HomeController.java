package com.sip.ams.controlers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/result")
	@ResponseBody
	public String resultat(@RequestParam("nom") String n,@RequestParam("email") String e)
	{
		return "Vous avez tapé un nom :"+n+" et un email :"+e ;
	}
	
	
	@RequestMapping("/information") //ce que je tappe dans l'url
   public String info(Model model)
   
   {
	
	ArrayList<String>  names = new ArrayList<>();
	names.add("OCA");
	names.add("OCP");
	names.add("Spring");
	names.add("Angular");
	model.addAttribute("names", names);
	
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
