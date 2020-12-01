package net.skizmflop.electoral.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skizmflop.electoral.map.model.AddCounty;

@Controller
@RequestMapping(path="/v1/electoral-map")
public class ElectoralMapUIControllerV1 {

	@GetMapping
	public String getMap() {
		return "map";
	}
	
	@GetMapping("/ga")
	public String getGaMap() {
		return "ga-map";
	}
	
	@GetMapping("/addCounties")
	public String addCountiesForm(Model model) {
		model.addAttribute("county", new AddCounty());
		return "add-counties";
	}
	
	@PostMapping
	public String addCountiesSubmission(@ModelAttribute AddCounty submission) {
		
		return "add-counties";
	}
	
}
