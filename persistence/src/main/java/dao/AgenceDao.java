package dao;

import entities.Agence;

public interface AgenceDao {

//	public Agence addAgence(String nom);
//
//	public Agence getAgenceById(int id);
//
//	public void removeAgence(int id);
//	
//	public void updateAgence(int id, String nom);
	
	public Agence addAgence(Agence agence);

	public Agence getAgenceById(int id);

	public Agence updateAgence(Agence agence);
	
	public void removeAgence(Agence agence);
}
