package servicios;

import java.util.ArrayList;

import daos.Vajilla;
import dtos.VajillaDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import utils.ConversionDaoDto;

public class Obtener {
	
	public void obtenerRegistros(ArrayList<VajillaDto> vajillas, EntityManagerFactory emf) {
		
		EntityManager em = emf.createEntityManager();
		vajillas = null;
		ConversionDaoDto gestorConversion = new ConversionDaoDto();
		
		try {
			String jpql = "SELECT a FROM Vajilla a";
			
			TypedQuery<Vajilla> consulta = em.createQuery(jpql, Vajilla.class);
			
			//Incompleto
			vajillas = gestorConversion.convertirVajillaDaoADto(consulta.getResultList());
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			em.close();
		}
	}
}
