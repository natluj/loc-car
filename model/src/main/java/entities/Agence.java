package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Agence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAgence;
	
	@NotNull
	private String nom;
	
	@OneToMany
	private List<Location> contrats;
	
	@OneToMany
	private List<Voiture> voitures;
	
	

	public Agence(int idAgence, @NotNull String nom, List<Location> contrats, List<Voiture> voitures) {
		super();
		this.idAgence = idAgence;
		this.nom = nom;
		this.contrats = contrats;
		this.voitures = voitures;
	}


	public Agence() {
		super();
	}
	
	public Agence(@NotNull String nom) {
		super();
		this.nom = nom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public List<Location> getContrats() {
		return contrats;
	}


	public void setContrats(List<Location> contrats) {
		this.contrats = contrats;
	}


	public int getIdAgence() {
		return idAgence;
	}


	public List<Voiture> getVoitures() {
		return voitures;
	}


	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	
	
}
