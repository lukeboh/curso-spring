package br.jus.tse.enderecamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.jus.tse.enderecamento.daos.UFDAO;
import br.jus.tse.enderecamento.models.UF;
import br.jus.tse.enderecamento.models.SituacaoUF;

@Controller
@RequestMapping("uf")
public class UFController {

	@Autowired
	private UFDAO ufDao;

	@RequestMapping("form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("/uf/form");
		modelAndView.addObject("situacoesUF", SituacaoUF.values());
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView gravar(UF uf, RedirectAttributes redirectAttributes) {
		System.out.println(uf);
		ufDao.gravar(uf);
		ModelAndView modelAndView = new ModelAndView("redirect:uf");
		redirectAttributes.addFlashAttribute("sucesso", "UF cadastrado com Sucesso!");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar() {
		List<UF> ufs = ufDao.listar();
		ModelAndView modelAndView = new ModelAndView("/uf/lista");
		modelAndView.addObject("ufs", ufs);
		return modelAndView;
	}
}
