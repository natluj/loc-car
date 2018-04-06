package dao;

import entities.Agence;

public interface AgenceDao {

	public void addAgence(String nom);

	public Agence getAgenceById(int id);

	public void removeAgence(int id);
	
	public void updateAgence(int id, String nom);

}
