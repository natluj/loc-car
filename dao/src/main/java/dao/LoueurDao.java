package dao;

import entities.Loueur;

public interface LoueurDao {
	
	public void addLoueur(Loueur loueur);
	
	public Loueur getloueurById(int id);
	
	public void updateLoueur(Loueur loueur);
	
	public void removeLoueur(int id);

}
