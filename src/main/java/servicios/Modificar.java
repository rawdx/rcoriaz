package servicios;

import daos.Vajilla;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Modificar {
	
	public void modificarVajilla(Vajilla vajilla, EntityManagerFactory emf) {
		
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(vajilla);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			em.close();
		}
	}

}
