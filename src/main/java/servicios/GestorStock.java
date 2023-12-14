package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import daos.Vajilla;
import dtos.ReservaDto;
import dtos.VajillaDto;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import utils.ConversionDaoDto;

public class GestorStock implements IGestorStock {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
	
	ConversionDaoDto gestorConversion = new ConversionDaoDto();
	Insertar insertar = new Insertar();
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void altaVajilla(ArrayList<VajillaDto> vajillas) {
		
		System.out.print("Introduce el nombre de la vajilla: ");
		String nombre = sc.nextLine();
		
		System.out.print("Introduce su descripción: ");
		String descripcion = sc.nextLine();
		
		System.out.print("Introduce la cantidad: ");
		int cantidad = sc.nextInt();
		
		VajillaDto vajillaDto = new VajillaDto(nombre + descripcion, nombre, descripcion, cantidad);
		
		Vajilla vajillaDao = gestorConversion.convertirVajillaDtoADao(vajillaDto);
		
		if(insertar.insertarVajilla(vajillaDao, emf)) {
			vajillas.add(vajillaDto);
		}
	}

	@Override
	public void eliminarVajilla(ArrayList<VajillaDto> vajillas) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mostrarStock(ArrayList<VajillaDto> vajillas) {
		for (VajillaDto vajilla : vajillas) {
			System.out.println(vajilla.toString());
		}
	}
	
	@Override
	public void modificarCantidad(ArrayList<VajillaDto> vajillas) {
		System.out.println("Introduce el código de la vajilla que deseas modificar");
		String codigo;
	}

	@Override
	public void crearReserva(ArrayList<ReservaDto> reservas) {
		// TODO Auto-generated method stub
		
	}

}
