package banque.repositories;

import java.util.List;

import banque.persistance.entities.TClient;



public interface ClientDao {

	public void add(TClient client);
	
	public List<TClient> findAll();
	
	public void update(TClient client);
	
	public void delete(TClient client);
	
	public TClient findById(int idclient);
}
