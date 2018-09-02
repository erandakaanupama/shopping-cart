package com.eab.shopingcart.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

import com.eab.shopingcart.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/")
	public String mainPage() {
		return "welcome";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "add-customer";
	}
	
	/*@RequestMapping("/showCustomer")
	public String showCustomer(@RequestParam("customerName") String name, @RequestParam("age") int age,  Model model) {
		String myName ="Hello, " +  name.toUpperCase();
		int myAge = age;
		model.addAttribute("age", myAge);
		model.addAttribute("name", myName);
		
		return "show-customer";
	}*/
	
	@RequestMapping("/showCustomer")
	public String showCustomer(@ModelAttribute("customer") Customer customer) {
		
		return "show-customer";
	}
	
	

}
