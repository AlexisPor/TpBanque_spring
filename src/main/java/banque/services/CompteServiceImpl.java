package banque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import banque.persistance.entities.TCompte;
import banque.repositories.CompteDaoImpl;

@Service
@Transactional
public class CompteServiceImpl implements CompteService{

	@Autowired
	private CompteDaoImpl cDaoImpl;
	
	public CompteDaoImpl getcDaoImpl() {
		return cDaoImpl;
	}

	public void setcDaoImpl(CompteDaoImpl cDaoImpl) {
		this.cDaoImpl = cDaoImpl;
	}

	@Override
	public void add(TCompte comp) {
		// TODO Auto-generated method stub
		cDaoImpl.add(comp);
	}

	@Override
	public void delete(TCompte comp) {
		// TODO Auto-generated method stub
		cDaoImpl.delete(comp);
	}

	@Override
	public void update(TCompte comp) {
		// TODO Auto-generated method stub
		cDaoImpl.update(comp);
	}

	@Override
	public TCompte findById(int idcomp) {
		// TODO Auto-generated method stub
		TCompte comp = cDaoImpl.findById(idcomp);
		return comp;
	}

	@Override
	public List<TCompte> findAll() {
		List<TCompte> listeC = cDaoImpl.findAll();
		return listeC;
	}

}
