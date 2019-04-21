package br.com.tis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tis.domain.Creche;

@Repository
public interface CrecheRepository extends JpaRepository<Creche, Integer>{

}
