package dao;

import entities.Voiture;

public interface VoitureDao {

	public void addVoiture(Voiture voiture);
	
	public Voiture getVoitureById(int id);
	
	public void updateVoiture(Voiture voiture);
	
	public void removeVoiture(int id);

}
