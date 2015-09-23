package dai.llew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daiLlew on 22/09/2015.
 */
@Controller
public class HomeController {

	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String viewHome(Model model) {
		model.addAttribute("name", "Rand Al'Thor");
		model.addAttribute("description", "The Dragon Reborn!");
		return "home";
	}
}