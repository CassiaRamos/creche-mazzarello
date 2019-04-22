package br.com.tis.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tis.domain.Trabalho;
import br.com.tis.repositories.TrabalhoRepository;

@Service
public class TrabalhoService {

	@Autowired
	private TrabalhoRepository repo;
	
	public Trabalho buscar(Integer id) {
		Optional<Trabalho> trabalho = repo.findById(id);
		return trabalho.orElse(null);
	}
	
}
