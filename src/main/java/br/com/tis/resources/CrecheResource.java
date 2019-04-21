package br.com.tis.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tis.domain.Creche;
import br.com.tis.services.CrecheService;

@Controller
@RequestMapping(value="/creche")
public class CrecheResource {
	
	@Autowired
	private CrecheService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String trabalhos() {
		return "RETORNAR PAGINA PRINCIPAL DOS TRABALHOS OFERECIDOS PELA CRECHE";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find (@PathVariable Integer id){
		Creche creche = service.buscar(id);
		return ResponseEntity.ok(creche);
	}
}
