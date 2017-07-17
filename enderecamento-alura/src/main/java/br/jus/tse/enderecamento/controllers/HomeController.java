package br.jus.tse.enderecamento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView index(){
		System.out.println("Entrando na home de Endereçamento");
		return new ModelAndView("redirect:/uf/");
	}
}
