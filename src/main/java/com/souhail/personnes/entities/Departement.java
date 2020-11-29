package com.souhail.personnes.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Departement {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDep;
	private String nomDep;
	private String descriptionDep;
	
	@JsonIgnore
	@OneToMany(mappedBy = "departement")
	private List<Personne> personnes;
	
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(String nomDep, String descriptionDep, List<Personne> personnes) {
		super();
		this.nomDep = nomDep;
		this.descriptionDep = descriptionDep;
		this.personnes = personnes;
	}
	public Long getIdDep() {
		return idDep;
	}
	public void setIdDep(Long idDep) {
		this.idDep = idDep;
	}
	public String getNomDep() {
		return nomDep;
	}
	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}
	public String getDescriptionDep() {
		return descriptionDep;
	}
	public void setDescriptionDep(String descriptionDep) {
		this.descriptionDep = descriptionDep;
	}
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	
	

}
