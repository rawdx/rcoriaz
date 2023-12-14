package servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Eliminar {

	public void eliminarVajilla(String codigo, EntityManagerFactory emf) {
		
		EntityManager em = emf.createEntityManager();
		
	}

}
