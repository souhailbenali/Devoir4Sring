package com.souhail.personnes.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.souhail.personnes.entities.Personne;
import com.souhail.personnes.services.PersonneService;

@RestController
	@RequestMapping("/api")
	@CrossOrigin
	public class PersonneRESTController {
	@Autowired
	PersonneService personneService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Personne> getAllPersonnes() {
	return personneService.getAllPersonnes();

	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Personne getPersonneById(@PathVariable("id") Long id) {
	return personneService.getPersonne(id);

	}
	@RequestMapping(method = RequestMethod.POST)
	public Personne createPersonne(@RequestBody Personne personne) {
	return personneService.savePersonne(personne);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Personne updatePersonne(@RequestBody Personne personne) {
	return personneService.updatePersonne(personne);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deletePersonne(@PathVariable("id") Long id)
	{
	personneService.deletePersonneById(id);
	}
	@RequestMapping(value="/persDep/{idDep}",method = RequestMethod.GET)
	public List<Personne> getPersonnesByDepId(@PathVariable("idDep") Long idDep) {
	return personneService.findByDepartementIdDep(idDep);
	}


}
