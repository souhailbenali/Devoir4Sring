package com.souhail.personnes.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.souhail.personnes.entities.Personne;

public interface PersonneService {
	Personne savePersonne(	Personne p);
	Personne updatePersonne(	Personne p);
	void deletePersonne(Personne p);
	 void deletePersonneById(Long id);
	 Personne getPersonne(Long id);
	List<Personne> getAllPersonnes();
	Page<Personne> getAllPersonnesParPage(int page, int size);
	List<Personne> findByDepartementIdDep(Long id);
	void getPersonnesByDepId(Long id);
	

}
