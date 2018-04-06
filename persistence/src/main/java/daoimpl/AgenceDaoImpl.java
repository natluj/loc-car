package daoimpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import dao.AgenceDao;
import entities.Agence;
import entities.Location;
import entities.Voiture;

public class AgenceDaoImpl implements AgenceDao{

	@Autowired
	EntityManager em;
	
	@Autowired
	List<Voiture> voitures;
	
	@Autowired
	List<Location> contrats;
	
	public List<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	public List<Location> getContrats() {
		return contrats;
	}

	public void setContrats(List<Location> contrats) {
		this.contrats = contrats;
	}

	public AgenceDaoImpl(List<Voiture> voitures, List<Location> contrats) {
		super();
		this.voitures = voitures;
		this.contrats = contrats;
	}

	public void addAgence(String nom) {
//		em.is
		
	}

	public Agence getAgenceById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeAgence(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateAgence(int id, String nom) {
		// TODO Auto-generated method stub
		
	}


}
