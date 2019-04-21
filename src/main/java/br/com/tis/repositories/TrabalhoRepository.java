package br.com.tis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tis.domain.Trabalho;

@Repository
public interface TrabalhoRepository extends JpaRepository<Trabalho, Integer>{

}
