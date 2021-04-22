package banque.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import banque.persistance.entities.TClient;
import banque.persistance.entities.TCompte;
import banque.services.ClientService;
import banque.services.CompteService;

public class Test {
	
	public static void main(String[] args) {
	
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
        ClientService clientDao = ctx.getBean("clientServiceImpl",ClientService.class);
        CompteService compteDao = ctx.getBean("compteServiceImpl",CompteService.class);

        TClient client = new TClient();
        client.setCNom("Alex");
        TCompte compte = new TCompte();
        compte.setCoNom("courant");
        compte.setTClient(client);

        clientDao.add(client);
        compteDao.add(compte);

        ctx.close();
		
	}
	
}
