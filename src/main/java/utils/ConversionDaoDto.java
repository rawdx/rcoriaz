package utils;

import java.util.ArrayList;
import java.util.List;

import daos.Vajilla;
import dtos.VajillaDto;

public class ConversionDaoDto {
	
	public Vajilla convertirVajillaDtoADao(VajillaDto vajillaDto) {
		return new Vajilla(vajillaDto.getCodigo(), vajillaDto.getNombre(), vajillaDto.getDescripcion(),
				vajillaDto.getCantidad());
	}
	
	//Incompleto
	public ArrayList<VajillaDto> convertirVajillaDaoADto (List<Vajilla> vajillas) {
		ArrayList<VajillaDto> listaDto = new ArrayList<VajillaDto>();
		for (int i = 0; i < vajillas.size(); i++) {
//			vajillas.get(i).get
		}
		return listaDto;
	}
	
}
