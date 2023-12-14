package servicios;

import java.util.Scanner;

public class Menu implements IMenu {

	@Override
	public int mostrarMenu() {
		System.out.println("Gestor de Vajillas");
		System.out.println("------------------------");
		System.out.println("1. Crear vajilla");
		System.out.println("2. Eliminar vajilla");
		System.out.println("3. Modificar cantidad de un stock");
		System.out.println("4. Mostrar stock");
		System.out.println("5. Crear Reserva");
		System.out.println("6. Salir");
		System.out.println("\nIntroduce una opción: ");
		Scanner sc = new Scanner(System.in);
		
		int opcion = sc.nextInt();
		
		while(opcion < 0 || opcion > 6) {
			System.out.print("Introduce un número dentro del rango: ");
			opcion = sc.nextInt();
		}
		return opcion;
	}

}
