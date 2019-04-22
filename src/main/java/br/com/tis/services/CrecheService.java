package br.com.tis.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tis.domain.Creche;
import br.com.tis.exceptions.ObjectNotFoundException;
import br.com.tis.repositories.CrecheRepository;

@Service
public class CrecheService {
	
	@Autowired
	private CrecheRepository repo;
	
	public Creche buscar(Integer id) {
		Optional<Creche> creche = repo.findById(id);
		return creche.orElseThrow(() -> new ObjectNotFoundException(
				"Página não encontrada! "));
	}
}
