package dtos;

import java.util.Date;


public class ReservaDto {
	
	private long idReserva;
	private Date fchReserva;
	
	
	public ReservaDto(Date fchReserva) {
		super();
		this.fchReserva = fchReserva;
	}

	
	public Date getFchReserva() {
		return fchReserva;
	}

	public void setFchReserva(Date fchReserva) {
		this.fchReserva = fchReserva;
	}
	
	
}
