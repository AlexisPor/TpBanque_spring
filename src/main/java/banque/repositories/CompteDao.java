package banque.repositories;

import java.util.List;

import banque.persistance.entities.TCompte;

public interface CompteDao {
	
	public void add(TCompte comp);
	
	public List<TCompte> findAll();
	
	public void update(TCompte comp);
	
	public void delete(TCompte compte);
	
	public TCompte findById(int idclient);
}
