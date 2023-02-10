package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/contact")
public class ContactController {

	@RequestMapping("/detatils") 
	//@ResponseBody
	
	public String details() {
	
		return "details.html";
		
		
		/*String name="Aloui Med Lassaad";
		String email="Aloui Med Lassaad";
		String whatsapp="21693375678";
		String adresse="Lyon";
		
		return "Détails  Contact : "
			    + "Name:"+email +"  "
			    + "Email:"+name +"  "
			    + "Whatsapp:"+whatsapp +"  "
			    + "Adresse:"+adresse ;
			    
			    */
	}
}