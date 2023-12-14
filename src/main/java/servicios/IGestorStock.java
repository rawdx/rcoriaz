package servicios;

import java.util.ArrayList;

import dtos.ReservaDto;
import dtos.VajillaDto;

public interface IGestorStock {
	void altaVajilla(ArrayList<VajillaDto> vajillas);
	void eliminarVajilla(ArrayList<VajillaDto> vajillas);
	void modificarCantidad(ArrayList<VajillaDto> vajillas);
	void mostrarStock(ArrayList<VajillaDto> vajillas);
	void crearReserva(ArrayList<ReservaDto> reservas);
}
