package com.souhail.personnes.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.souhail.personnes.entities.Departement;
import com.souhail.personnes.entities.Personne;
@RepositoryRestResource(path = "rest")
public interface PersonneRepository extends JpaRepository<Personne, Long> {
	List<Personne> findByNomPersonne(String nom);
List<Personne> findByNomPersonneContains(String nom);
@Query("select p from Personne p where p.nomPersonne like %:nom and p.taillePersonne > :taille")
List<Personne> findByNomTaille (@Param("nom") String nom,@Param("taille") Double taille);
	@Query("select p from Personne p where p.departement = ?1")
	List<Personne> findByDepartement (Departement departement);
	List<Personne> findByDepartementIdDep(Long id);
	List<Personne> findByOrderByNomPersonneAsc();
}
