package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVoiture;
	
	@NotNull
	private String marque;
	
	@NotNull
	private String modele;
	
	@NotNull
	private String immatriculation;

	
	public Voiture(int idVoiture, String marque, String modele, String immatriculation) {
		super();
		this.idVoiture = idVoiture;
		this.marque = marque;
		this.modele = modele;
		this.immatriculation = immatriculation;
	}

	public Voiture() {
		super();
	}

	public int getIdVoiture() {
		return idVoiture;
	}

	public String getMarque() {
		return marque;
	}

	public String getModele() {
		return modele;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

}
