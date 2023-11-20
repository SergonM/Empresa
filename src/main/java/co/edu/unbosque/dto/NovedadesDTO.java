package co.edu.unbosque.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="novedades_beneficios")
public class NovedadesDTO {
	@Id
	@Column(name="codigo")
	private int codigo;
	@Column(name="novedad_incapacidad")
	private String novedad_incapacidad;
	@Column(name="novedad_vacaciones")
	private String novedad_vacaciones;
	@Column(name="numero_dias_trabajados_en_el_mes")
	private int numero_dias_trabajados_en_el_mes;
	@Column(name="numero_dias_incapacidades_en_el_mes")
	private int numero_dias_incapacidades_en_el_mes;
	@Column(name="numero_de_dias_vacaciones")
	private int numero_de_dias_vacaciones;
	@Column(name="fecha_inicio_de_vacaciones")
	private String fecha_inicio_de_vacaciones;
	@Column(name="fecha_terminacion_de_vacaciones")
	private String fecha_terminacion_de_vacaciones;
	@Column(name="fecha_inicio_incapacidad")
	private String fecha_inicio_incapacidad;
	@Column(name="fecha_terminacion_incapacidad")
	private String fecha_terminacion_incapacidad;
	@Column(name="bonificacion")
	private double bonificacion;
	@Column(name="transporte")
	private double transporte;
	/**
	 * @param codigo
	 * @param novedad_incapacidad
	 * @param novedad_vacaciones
	 * @param numero_dias_trabajados_en_el_mes
	 * @param numero_dias_incapacidades_en_el_mes
	 * @param numero_de_dias_vacaciones
	 * @param fecha_inicio_de_vacaciones
	 * @param fecha_terminacion_de_vacaciones
	 * @param fecha_inicio_incapacidad
	 * @param fecha_terminacion_incapacidad
	 * @param bonificacion
	 * @param transporte
	 */
	public NovedadesDTO(int codigo, String novedad_incapacidad, String novedad_vacaciones,
			int numero_dias_trabajados_en_el_mes, int numero_dias_incapacidades_en_el_mes,
			int numero_de_dias_vacaciones, String fecha_inicio_de_vacaciones, String fecha_terminacion_de_vacaciones,
			String fecha_inicio_incapacidad, String fecha_terminacion_incapacidad, double bonificacion,
			double transporte) {
		this.codigo = codigo;
		this.novedad_incapacidad = novedad_incapacidad;
		this.novedad_vacaciones = novedad_vacaciones;
		this.numero_dias_trabajados_en_el_mes = numero_dias_trabajados_en_el_mes;
		this.numero_dias_incapacidades_en_el_mes = numero_dias_incapacidades_en_el_mes;
		this.numero_de_dias_vacaciones = numero_de_dias_vacaciones;
		this.fecha_inicio_de_vacaciones = fecha_inicio_de_vacaciones;
		this.fecha_terminacion_de_vacaciones = fecha_terminacion_de_vacaciones;
		this.fecha_inicio_incapacidad = fecha_inicio_incapacidad;
		this.fecha_terminacion_incapacidad = fecha_terminacion_incapacidad;
		this.bonificacion = bonificacion;
		this.transporte = transporte;
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
	 * @return the novedad_incapacidad
	 */
	public String getNovedad_incapacidad() {
		return novedad_incapacidad;
	}
	/**
	 * @param novedad_incapacidad the novedad_incapacidad to set
	 */
	public void setNovedad_incapacidad(String novedad_incapacidad) {
		this.novedad_incapacidad = novedad_incapacidad;
	}
	/**
	 * @return the novedad_vacaciones
	 */
	public String getNovedad_vacaciones() {
		return novedad_vacaciones;
	}
	/**
	 * @param novedad_vacaciones the novedad_vacaciones to set
	 */
	public void setNovedad_vacaciones(String novedad_vacaciones) {
		this.novedad_vacaciones = novedad_vacaciones;
	}
	/**
	 * @return the numero_dias_trabajados_en_el_mes
	 */
	public int getNumero_dias_trabajados_en_el_mes() {
		return numero_dias_trabajados_en_el_mes;
	}
	/**
	 * @param numero_dias_trabajados_en_el_mes the numero_dias_trabajados_en_el_mes to set
	 */
	public void setNumero_dias_trabajados_en_el_mes(int numero_dias_trabajados_en_el_mes) {
		this.numero_dias_trabajados_en_el_mes = numero_dias_trabajados_en_el_mes;
	}
	/**
	 * @return the numero_dias_incapacidades_en_el_mes
	 */
	public int getNumero_dias_incapacidades_en_el_mes() {
		return numero_dias_incapacidades_en_el_mes;
	}
	/**
	 * @param numero_dias_incapacidades_en_el_mes the numero_dias_incapacidades_en_el_mes to set
	 */
	public void setNumero_dias_incapacidades_en_el_mes(int numero_dias_incapacidades_en_el_mes) {
		this.numero_dias_incapacidades_en_el_mes = numero_dias_incapacidades_en_el_mes;
	}
	/**
	 * @return the numero_de_dias_vacaciones
	 */
	public int getNumero_de_dias_vacaciones() {
		return numero_de_dias_vacaciones;
	}
	/**
	 * @param numero_de_dias_vacaciones the numero_de_dias_vacaciones to set
	 */
	public void setNumero_de_dias_vacaciones(int numero_de_dias_vacaciones) {
		this.numero_de_dias_vacaciones = numero_de_dias_vacaciones;
	}
	/**
	 * @return the fecha_inicio_de_vacaciones
	 */
	public String getFecha_inicio_de_vacaciones() {
		return fecha_inicio_de_vacaciones;
	}
	/**
	 * @param fecha_inicio_de_vacaciones the fecha_inicio_de_vacaciones to set
	 */
	public void setFecha_inicio_de_vacaciones(String fecha_inicio_de_vacaciones) {
		this.fecha_inicio_de_vacaciones = fecha_inicio_de_vacaciones;
	}
	/**
	 * @return the fecha_terminacion_de_vacaciones
	 */
	public String getFecha_terminacion_de_vacaciones() {
		return fecha_terminacion_de_vacaciones;
	}
	/**
	 * @param fecha_terminacion_de_vacaciones the fecha_terminacion_de_vacaciones to set
	 */
	public void setFecha_terminacion_de_vacaciones(String fecha_terminacion_de_vacaciones) {
		this.fecha_terminacion_de_vacaciones = fecha_terminacion_de_vacaciones;
	}
	/**
	 * @return the fecha_inicio_incapacidad
	 */
	public String getFecha_inicio_incapacidad() {
		return fecha_inicio_incapacidad;
	}
	/**
	 * @param fecha_inicio_incapacidad the fecha_inicio_incapacidad to set
	 */
	public void setFecha_inicio_incapacidad(String fecha_inicio_incapacidad) {
		this.fecha_inicio_incapacidad = fecha_inicio_incapacidad;
	}
	/**
	 * @return the fecha_terminacion_incapacidad
	 */
	public String getFecha_terminacion_incapacidad() {
		return fecha_terminacion_incapacidad;
	}
	/**
	 * @param fecha_terminacion_incapacidad the fecha_terminacion_incapacidad to set
	 */
	public void setFecha_terminacion_incapacidad(String fecha_terminacion_incapacidad) {
		this.fecha_terminacion_incapacidad = fecha_terminacion_incapacidad;
	}
	/**
	 * @return the bonificacion
	 */
	public double getBonificacion() {
		return bonificacion;
	}
	/**
	 * @param bonificacion the bonificacion to set
	 */
	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}
	/**
	 * @return the transporte
	 */
	public double getTransporte() {
		return transporte;
	}
	/**
	 * @param transporte the transporte to set
	 */
	public void setTransporte(double transporte) {
		this.transporte = transporte;
	}
	
	
	
}
