package servicios;

import daos.Reserva;
import daos.Vajilla;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Insertar {

	public boolean insertarVajilla(Vajilla vajilla, EntityManagerFactory emf) {
		
		EntityManager em = emf.createEntityManager();
		
		boolean exito = false;
		try {
			em.getTransaction().begin();
			em.persist(vajilla);
			em.getTransaction().commit();
			
			exito = true;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			em.close();
		}
		return exito;
	}

	public boolean insertarReserva(Reserva reserva, EntityManagerFactory emf) {
		
		EntityManager em = emf.createEntityManager();
		
		boolean exito = false;
		try {
			em.getTransaction().begin();
			em.persist(reserva);
			em.getTransaction().commit();
			
			exito = true;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			em.close();
		}
		return exito;
	}
}
