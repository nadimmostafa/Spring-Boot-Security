package org.nadim.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankApplicationController {
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/offers")
	public String showOffers() {
		return "offers";
	}

	@GetMapping("/balance")
	public String showBalance(Model model) {
		Integer myBalance = new Random().nextInt(10000000);
		model.addAttribute("balance", myBalance);
		return "balance";
	}

	@GetMapping("/approveLoan")
	public String loans() {
		return "loan";
	}

	@GetMapping("/denied")
	public String accessDenied() {
		return "accessDenied";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
