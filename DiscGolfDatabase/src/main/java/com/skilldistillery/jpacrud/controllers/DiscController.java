package com.skilldistillery.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.jpacrud.data.DiscDAO;
import com.skilldistillery.jpacrud.entities.Disc;

@Controller
public class DiscController {
	
	@Autowired
	private DiscDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("manufacturers", dao.allManufacturers());
		return "index";
	}
	
	@RequestMapping(path="singleId.do", method = RequestMethod.GET, params = "discId")
	public String singleId(@RequestParam int discId, Model model) {
//		System.out.println("Disc ID Received: " + discId);
		model.addAttribute("disc", dao.findById(discId));
		return "discById";
	}
	
	@RequestMapping(path="manufacturer.do", method = RequestMethod.GET, params = "manufacturerName")
	public String discsByManufacturer(@RequestParam String manufacturerName, Model model) {
		model.addAttribute("discs", dao.discsByManufacturer(manufacturerName));
		return "bymanufacturer";
	}
	
	//Update will come from the singleId page and will populate the forms to change the disc
	//Update will then allow you to submit or go back
	//If submitted, the application will attempt a Post-Get redirect passing the new information to
		//The singleId.do
	
	//Delete will be accessible from the discById.jsp.
	//Clicking the button/href will direct the users to success screen if deleted or an unsuccessful message
	//On that page will be a return home button.
	@RequestMapping(path="deleteDisc.do", params = "discId", method=RequestMethod.POST)
	public ModelAndView deleteDisc(@RequestParam int discId, RedirectAttributes redir, Model model) {
		ModelAndView mv = new ModelAndView();
		redir.addFlashAttribute("booleanDestroyed", dao.destroyDisc(discId));
		mv.setViewName("redirect:deletedRedirect.do");
		return mv;
	}
	
	@RequestMapping(path="deletedRedirect.do")
	public String deletedResponse() {
		return "deleteddisc";
	}
	
	//Create will be accessible from the index.jsp.
	//This page will be pre-populated with values that can be changed.
	//Once the user hits submit, the page will be redirected to the singleId.do and the new disc will be displayed.
	@RequestMapping(path="/creatediscform")
	public String createForm(Model model) {
		Disc disc = new Disc();
		model.addAttribute("disc", disc);
		return "createdisclanding";
	}
	
	@RequestMapping(path="/createDisc", method=RequestMethod.POST)
	public ModelAndView creatDisc(@ModelAttribute("disc") Disc disc, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();
		disc = dao.createDisc(disc);
		int discId = disc.getId();
		mv.setViewName("redirect:singleId.do?discId="+discId);
		return mv;
	}
	
	@RequestMapping(path="updatedisc.do", method=RequestMethod.POST, params="discId")
	public String updateDiscById(@RequestParam int discId, Model model) {
		model.addAttribute("disc", dao.findById(discId));
		
		
		return "updatedisc";
	}
	
	@RequestMapping(path="/updatedInformation", method=RequestMethod.POST)
	public ModelAndView updatedDiscInfo(@ModelAttribute("disc") Disc disc, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();
		disc = dao.updateDisc(disc);
		int discId = disc.getId();
		mv.setViewName("redirect:singleId.do?discId="+discId);
		return mv;
	}
	
	
	
}
