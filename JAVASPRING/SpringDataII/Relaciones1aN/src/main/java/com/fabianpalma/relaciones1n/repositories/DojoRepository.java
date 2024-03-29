package com.fabianpalma.relaciones1n.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fabianpalma.relaciones1.models.Dojo;
@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
	
	List<Dojo> findAll();
	
	Optional<Dojo> findDojoById(Long id);
}
