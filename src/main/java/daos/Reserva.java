package daos;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="reservas", schema="esqExaDos")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_reserva", nullable=false)
	private long idReserva;
	
	@Column(name="fecha_reserva")
	private Date fchReserva;

	@ManyToMany(mappedBy = "reservas")
	@JoinTable(name="Rel_Res_Vaj", schema = "esqExaDos", 
	joinColumns = @JoinColumn(name="reserva_id"), 
	inverseJoinColumns = @JoinColumn(name="vajilla_id"))
	List<Vajilla> vajillas;
	
	public Reserva() {
		super();
	}

}
