package banque.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import banque.persistance.entities.TCompte;

public interface CompteService {

	public void add(TCompte comp);
	
	public void delete(TCompte comp);
	
	public void update(TCompte comp);
	
	public TCompte findById(int idcomp);
	
	public List<TCompte> findAll();
}
