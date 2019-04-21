package br.com.tis.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tis.domain.Trabalho;
import br.com.tis.services.TrabalhoService;

@RestController
@RequestMapping(value="/trabalhos")
public class TrabalhoResource {
	
	@Autowired
	private TrabalhoService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String trabalhos() {
		return "RETORNAR PAGINA PRINCIPAL DOS TRABALHOS OFERECIDOS PELA CRECHE";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find (@PathVariable Integer id){
		Trabalho trabalho = service.buscar(id);
		return ResponseEntity.ok(trabalho);
	}
}
