package controladores;

import servicios.Menu;

import java.util.ArrayList;

import dtos.ReservaDto;
import dtos.VajillaDto;
import servicios.GestorStock;
import servicios.IGestorStock;
import servicios.IMenu;

public class Principal {

	public static void main(String[] args) {
		try {
			IMenu menu = new Menu();
			IGestorStock gestor = new GestorStock();
			
			ArrayList<VajillaDto> vajillas = new ArrayList<VajillaDto>();
			ArrayList<ReservaDto> reservas = new ArrayList<ReservaDto>();
			
			int opcion = 0;
			do {		
				switch(menu.mostrarMenu()) {
				case 1:
					gestor.altaVajilla(vajillas);
					break;
				case 2:
					gestor.eliminarVajilla(vajillas);
					break;
				case 3:
					gestor.modificarCantidad(vajillas);
					break;
				case 4:
					gestor.mostrarStock(vajillas);
					break;
				case 5:
					gestor.crearReserva(reservas);
					break;
				}
			}while(opcion != 6);
			
		}catch(Exception e) {
			System.err.println("Ha ocurrido un error: " + e);
		}
	}

}
