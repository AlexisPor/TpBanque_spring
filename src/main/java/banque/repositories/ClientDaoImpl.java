package banque.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import banque.persistance.entities.TClient;

@Repository
public class ClientDaoImpl implements ClientDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public void add(TClient client) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(client);
	}

	@Override
	public List<TClient> findAll() {
		// TODO Auto-generated method stub
		List<TClient> listeClient = sessionFactory.getCurrentSession().createQuery("from TClient").list();
		return listeClient;
	}

	@Override
	public void update(TClient client) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(client);
	}

	@Override
	public void delete(TClient client) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(client);
	}

	@Override
	public TClient findById(int idclient) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(TClient.class, idclient);
	}

}
