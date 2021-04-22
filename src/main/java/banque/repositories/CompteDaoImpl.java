package banque.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import banque.persistance.entities.TCompte;

@Repository
public class CompteDaoImpl implements CompteDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(TCompte comp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(comp);
	}

	@Override
	public List<TCompte> findAll() {
		// TODO Auto-generated method stub
		List<TCompte> listeComp = sessionFactory.getCurrentSession().createQuery("from TCompte").list();
		return listeComp;
	}

	@Override
	public void update(TCompte comp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(comp);
	}

	@Override
	public void delete(TCompte comp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(comp);
	}

	@Override
	public TCompte findById(int idcomp) {
		// TODO Auto-generated method stub
		TCompte comp = sessionFactory.getCurrentSession().get(TCompte.class, idcomp);
		return comp;
	}

}
