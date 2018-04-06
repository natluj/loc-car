package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idLocation;
	
	@NotNull
	private int prix;
	
	@NotNull
	private int kilometres;
	
	@ManyToOne
	private Agence agence;
	
	@OneToOne
	private Loueur loueur;
	
	

	public Location(int idLocation, int prix, int kilometres, Agence agence, Loueur loueur) {
		super();
		this.idLocation = idLocation;
		this.prix = prix;
		this.kilometres = kilometres;
		this.agence = agence;
		this.loueur = loueur;
	}

	public Location() {
		super();
	}

	public int getIdLocation() {
		return idLocation;
	}

	public int getPrix() {
		return prix;
	}

	public int getKilometres() {
		return kilometres;
	}

	public Agence getAgence() {    
		return agence;
	}

	public Loueur getLoueur() {
		return loueur;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void setKilometres(int kilometres) {
		this.kilometres = kilometres;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public void setLoueur(Loueur loueur) {
		this.loueur = loueur;
	}

	
}
