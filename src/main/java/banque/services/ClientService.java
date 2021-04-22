package banque.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import banque.persistance.entities.TClient;

public interface ClientService {

	public void add(TClient client);
	
	public void delete(TClient client);
	
	public void update(TClient client);
	
	public TClient findById(int idclient);
	
	public List<TClient> findAll();
}
