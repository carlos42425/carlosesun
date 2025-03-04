package com.example.demo.modelo;
import jakarta.persistence.*;


@Entity

@Table(name="nominas")

public class nominas {
	@Id
	@Column(name="nomina")
	private long nomina;
	
	@Column(name="id_empleado", length=50, nullable=false)
	private long id_empleado;
	
	@Column(name="salario", length=50, nullable=false)
	private long salario;
	
	@Column(name="deducidos", length=50, nullable=false)
	private long deducidos;
	
	@Column(name="ingresos", length=50, nullable=false)
	private long ingresos;
	
	@Column(name="total_salario", length=50, nullable=false)
	private long total_salario;
	
	@Column(name="fecha", length=100, nullable=false)
	private String fecha;
	
	@ManyToOne()
	@JoinColumn(name = "identificador", referencedColumnName="identificador")
	private empleado empleado ;

	public nominas() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public nominas(long nomina, long id_empleado, long salario, long deducidos, long ingresos, long total_salario,
			String fecha, empleado empleado) {
		super();
		this.nomina = nomina;
		this.id_empleado = id_empleado;
		this.salario = salario;
		this.deducidos = deducidos;
		this.ingresos = ingresos;
		this.total_salario = total_salario;
		this.fecha = fecha;
		this.empleado = empleado;
		
	}

	public long getNomina() {
		return nomina;
	}

	public void setNomina(long nomina) {
		this.nomina = nomina;
	}

	public long getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(long id_empleado) {
		this.id_empleado = id_empleado;
	}

	public long getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}

	public long getDeducidos() {
		return deducidos;
	}

	public void setDeducidos(long deducidos) {
		this.deducidos = deducidos;
	}

	public long getIngresos() {
		return ingresos;
	}

	public void setIngresos(long ingresos) {
		this.ingresos = ingresos;
	}

	public long getTotal_salario() {
		return total_salario;
	}

	public void setTotal_salario(long total_salario) {
		this.total_salario = total_salario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(empleado empleado) {
		this.empleado = empleado;
	}
}

	