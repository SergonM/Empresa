package co.edu.unbosque.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class EmpleadoDTO {
	@Id
	@Column(name="codigo")
	private int codigo;
	@Column(name="nombre_empleado")
	private String nombre_empleado;
	@Column(name="dependencia")
	private String dependencia;
	@Column(name="cargo")
	private String cargo;
	@Column(name="fecha_ingreso")
	private String fecha_ingreso;
	@Column(name="eps")
	private String eps;
	@Column(name="arl")
	private String arl;
	@Column(name="pension")
	private String pension;
	@Column(name="sueldo")
	private double sueldo;
	/**
	 * @param codigo
	 * @param nombre_empleado
	 * @param dependencia
	 * @param cargo
	 * @param fecha_ingreso
	 * @param eps
	 * @param arl
	 * @param pension
	 * @param sueldo
	 */
	public EmpleadoDTO(int codigo, String nombre_empleado, String dependencia, String cargo, String fecha_ingreso,
			String eps, String arl, String pension, double sueldo) {
		this.codigo = codigo;
		this.nombre_empleado = nombre_empleado;
		this.dependencia = dependencia;
		this.cargo = cargo;
		this.fecha_ingreso = fecha_ingreso;
		this.eps = eps;
		this.arl = arl;
		this.pension = pension;
		this.sueldo = sueldo;

	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre_empleado
	 */
	public String getNombre_empleado() {
		return nombre_empleado;
	}
	/**
	 * @param nombre_empleado the nombre_empleado to set
	 */
	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}
	/**
	 * @return the dependencia
	 */
	public String getDependencia() {
		return dependencia;
	}
	/**
	 * @param dependencia the dependencia to set
	 */
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}
	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	/**
	 * @return the fecha_ingreso
	 */
	public String getFecha_ingreso() {
		return fecha_ingreso;
	}
	/**
	 * @param fecha_ingreso the fecha_ingreso to set
	 */
	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	/**
	 * @return the eps
	 */
	public String getEps() {
		return eps;
	}
	/**
	 * @param eps the eps to set
	 */
	public void setEps(String eps) {
		this.eps = eps;
	}
	/**
	 * @return the arl
	 */
	public String getArl() {
		return arl;
	}
	/**
	 * @param arl the arl to set
	 */
	public void setArl(String arl) {
		this.arl = arl;
	}
	/**
	 * @return the pension
	 */
	public String getPension() {
		return pension;
	}
	/**
	 * @param pension the pension to set
	 */
	public void setPension(String pension) {
		this.pension = pension;
	}
	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}
	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	
	
	
	
}
