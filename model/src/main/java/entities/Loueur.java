package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Loueur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idClient;
	
	@NotNull
	private String nom;
	
	@NotNull
	private int age;
	
	@NotNull
	private String adresse;
	
	@NotNull
	private String paiement;
	
	@OneToOne
	private Location location;


	public Loueur(int idClient, String nom, int age, String adresse, String paiement, Location location) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
		this.paiement = paiement;
		this.location = location;
	}

	public Loueur() {
		super();
	}

	public int getIdClient() {
		return idClient;
	}

	public String getNom() {
		return nom;
	}

	public int getAge() {
		return age;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getPaiement() {
		return paiement;
	}

	public Location getLocation() {
		return location;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setPaiement(String paiement) {
		this.paiement = paiement;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
	
}
