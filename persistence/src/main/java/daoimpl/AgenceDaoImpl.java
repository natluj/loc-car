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

	public Agence addAgence(Agence agence) {
		em.getTransaction().begin();
		em.persist(agence);
		em.getTransaction().commit();
		return agence;
	}

	public Agence getAgenceById(int id) {
		em.getTransaction().begin();
		Agence agence = em.find(Agence.class, id);
		em.getTransaction().commit();
		return agence;
	}

	public Agence updateAgence(Agence agence) {
		em.getTransaction().begin();
		agence = em.merge(agence);
		em.getTransaction().commit();
		return agence;
	}

	public void removeAgence(Agence agence) {
		em.getTransaction().begin();
		em.remove(agence);
	}


}
