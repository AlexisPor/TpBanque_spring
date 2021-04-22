package banque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import banque.persistance.entities.TClient;
import banque.repositories.ClientDaoImpl;

@Service
@Transactional
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientDaoImpl cDaoImpl;

	public ClientDaoImpl getcDaoImpl() {
		return cDaoImpl;
	}

	public void setcDaoImpl(ClientDaoImpl cDaoImpl) {
		this.cDaoImpl = cDaoImpl;
	}

	@Override
	public void add(TClient client) {
		// TODO Auto-generated method stub
		cDaoImpl.add(client);
	}

	@Override
	public void delete(TClient client) {
		// TODO Auto-generated method stub
		cDaoImpl.delete(client);
	}

	@Override
	public void update(TClient client) {
		// TODO Auto-generated method stub
		cDaoImpl.update(client);
	}

	@Override
	public TClient findById(int idclient) {
		// TODO Auto-generated method stub
		TClient cli = cDaoImpl.findById(idclient);
		return cli;
	}

	@Override
	public List<TClient> findAll() {
		// TODO Auto-generated method stub
		List<TClient> listC = cDaoImpl.findAll();
		return listC;
	}
}
