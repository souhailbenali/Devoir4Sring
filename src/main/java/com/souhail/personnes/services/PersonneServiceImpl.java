
package com.souhail.personnes.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.souhail.personnes.entities.Personne;
import com.souhail.personnes.repos.PersonneRepository;

@Service
public class PersonneServiceImpl implements PersonneService {
@Autowired
PersonneRepository personneRepository;
@Override
public Personne savePersonne(Personne p) {
return personneRepository.save(p);
}
@Override
public Personne updatePersonne (Personne p) {
return personneRepository.save(p);
}
@Override
public void deletePersonne(Personne p) {
	personneRepository.delete(p);
}
 @Override
public void deletePersonneById(Long id) {
	 personneRepository.deleteById(id);
}
@Override
public Personne getPersonne(Long id) {
return personneRepository.findById(id).get();
}
@Override
public List<Personne> getAllPersonnes() {
return personneRepository.findAll();
}
@Override
public Page<Personne> getAllPersonnesParPage(int page, int size) {
return personneRepository.findAll(PageRequest.of(page, size));
}

@Override
public  void getPersonnesByDepId(Long id) {
	 personneRepository.findByDepartementIdDep(id);


}
@Override
public List<Personne> findByDepartementIdDep(Long id) {
	// TODO Auto-generated method stub
	return personneRepository.findByDepartementIdDep(id);
}
}