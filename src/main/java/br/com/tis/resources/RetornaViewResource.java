package br.com.tis.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RetornaViewResource{

	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/atividades", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/agenda", method = RequestMethod.GET)
	public String store() {
		return "store";
	}
}
 	