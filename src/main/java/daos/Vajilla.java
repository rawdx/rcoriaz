package daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="vajillas", schema="esqExaDos")
public class Vajilla {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_vajilla", nullable=false)
	private long idVajilla;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="cantidad")
	private int cantidad;

	@ManyToMany
	List<Reserva> reservas;
	
	public Vajilla() {
		super();
	}


	public Vajilla(String codigo, String nombre, String descripcion, int cantidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
	
}
