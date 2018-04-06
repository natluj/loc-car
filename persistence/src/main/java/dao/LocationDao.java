package dao;

import entities.Location;

public interface LocationDao {
	
	public void addContrat(Location contrat);
	
	public Location getContratById(int id);
	
	public void updateContrat(Location contrat);
	
	public void removeContrat(int id);
}
