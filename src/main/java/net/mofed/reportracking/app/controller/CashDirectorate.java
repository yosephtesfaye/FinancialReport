package net.mofed.reportracking.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.mofed.reportracking.app.model.Organization;
import net.mofed.reportracking.app.service.OrganizationService;


@Controller

public class CashDirectorate {
	
	
	
	
	@GetMapping("/cashdirectorates")
	
	public String GetCashDirectorate() {
		
		
		  return "emcp/cashdirectorate";
	}
	
	
   
}

