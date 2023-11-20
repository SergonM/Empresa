package co.edu.unbosque.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import co.edu.unbosque.dao.NovedadesDAO;
import co.edu.unbosque.dto.NovedadesDTO;

@ManagedBean
public class NovedadesBean {
	private int codigo;
	private String novedad_incapacidad;
	private String novedad_vacaciones;
	private int numero_dias_trabajados_en_el_mes;
	private int numero_dias_incapacidades_en_el_mes;
	private int numero_de_dias_vacaciones;
	private String fecha_inicio_de_vacaciones;
	private String fecha_terminacion_de_vacaciones;
	private String fecha_inicio_incapacidad;
	private String fecha_terminacion_incapacidad,resultado,linea;
	private double bonificacion;
	private double transporte;
	private List<NovedadesDTO> listaNovedades = new ArrayList<>();
	
	
	
	/**
	 * @return the listaNovedades
	 */
	public List<NovedadesDTO> getListaNovedades() {
		return listaNovedades;
	}
	/**
	 * @param listaNovedades the listaNovedades to set
	 */
	public void setListaNovedades(List<NovedadesDTO> listaNovedades) {
		this.listaNovedades = listaNovedades;
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
	 * @return the resultado
	 */
	public String getResultado() {
		return resultado;
	}
	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}
	/**
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
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
	  public String agregar() {
	        NovedadesDAO ND = new NovedadesDAO();
	        NovedadesDTO nuevaNovedad = new NovedadesDTO(this.codigo, this.novedad_incapacidad, this.novedad_vacaciones,
	                this.numero_dias_trabajados_en_el_mes, this.numero_dias_incapacidades_en_el_mes,
	                this.numero_de_dias_vacaciones, this.fecha_inicio_de_vacaciones, this.fecha_terminacion_de_vacaciones,
	                this.fecha_inicio_incapacidad, this.fecha_terminacion_incapacidad, this.bonificacion, this.transporte);
	        this.resultado = ND.agregar(nuevaNovedad);

	        if (this.resultado.equals("OK")) {
	            listaNovedades.add(nuevaNovedad);
	            return "confirmacion.xhtml";
	        } else {
	            return "error.xhtml";
	        }
	    }

	    public String eliminar() {
	        NovedadesDAO ND = new NovedadesDAO();
	        this.resultado = ND.eliminar(this.codigo);

	        if (this.resultado.equals("OK")) {
	            listaNovedades.removeIf(novedad -> novedad.getCodigo() == this.codigo);
	            return "confirmacion.xhtml";
	        } else {
	            return "error.xhtml";
	        }
	    }

	    public String actualizar() {
	        NovedadesDAO ND = new NovedadesDAO();
	        this.resultado = ND.actualizar(this.codigo, new NovedadesDTO(this.codigo, this.novedad_incapacidad,
	                this.novedad_vacaciones, this.numero_dias_trabajados_en_el_mes,
	                this.numero_dias_incapacidades_en_el_mes, this.numero_de_dias_vacaciones,
	                this.fecha_inicio_de_vacaciones, this.fecha_terminacion_de_vacaciones,
	                this.fecha_inicio_incapacidad, this.fecha_terminacion_incapacidad, this.bonificacion, this.transporte));

	        if (this.resultado.equals("OK")) {
	            for (NovedadesDTO novedad : listaNovedades) {
	                if (novedad.getCodigo() == this.codigo) {
	                    novedad.setNovedad_incapacidad(this.novedad_incapacidad);
	                    novedad.setNovedad_vacaciones(this.novedad_vacaciones);
	                    novedad.setNumero_dias_trabajados_en_el_mes(this.numero_dias_trabajados_en_el_mes);
	                    novedad.setNumero_dias_incapacidades_en_el_mes(this.numero_dias_incapacidades_en_el_mes);
	                    novedad.setNumero_de_dias_vacaciones(this.numero_de_dias_vacaciones);
	                    novedad.setFecha_inicio_de_vacaciones(this.fecha_inicio_de_vacaciones);
	                    novedad.setFecha_terminacion_de_vacaciones(this.fecha_terminacion_de_vacaciones);
	                    novedad.setFecha_inicio_incapacidad(this.fecha_inicio_incapacidad);
	                    novedad.setFecha_terminacion_incapacidad(this.fecha_terminacion_incapacidad);
	                    novedad.setBonificacion(this.bonificacion);
	                    novedad.setTransporte(this.transporte);
	                    break;
	                }
	            }
	            return "confirmacion.xhtml";
	        } else {
	            return "error.xhtml";
	        }
	    }

	    public String cargarExcel() {
	        try {
	            NovedadesDAO ND = new NovedadesDAO();
	            String projectPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
	            String filePath = projectPath + "data/ExcelNomina2.csv";

	            BufferedReader br = new BufferedReader(new FileReader(filePath));

	            linea = br.readLine();
	            while (linea != null) {
	                String datos[] = linea.split(",");
	                codigo = Integer.parseInt(datos[0]);
				    novedad_incapacidad = datos[1];
				    novedad_vacaciones = datos[2];
				    numero_dias_trabajados_en_el_mes =Integer.parseInt( datos[3]);
				    numero_dias_incapacidades_en_el_mes = Integer.parseInt(datos[4]);
				    numero_de_dias_vacaciones = Integer.parseInt(datos[5]);
				    fecha_inicio_de_vacaciones = datos[6];
				    fecha_terminacion_de_vacaciones = datos[7];
				    fecha_inicio_incapacidad =datos[8];
				    fecha_terminacion_incapacidad=datos[9];
				    String bonificacionString=datos[10].replace(".", "");
				    String transporteString=datos[11].replace(".", "");
				    bonificacion = Double.parseDouble(bonificacionString);
				    transporte = Double.parseDouble(transporteString);

				   
				    linea = br.readLine();

	                NovedadesDTO novedad = new NovedadesDTO(codigo, novedad_incapacidad, novedad_vacaciones,
	                        numero_dias_trabajados_en_el_mes, numero_dias_incapacidades_en_el_mes, numero_de_dias_vacaciones,
	                        fecha_inicio_de_vacaciones, fecha_terminacion_de_vacaciones, fecha_inicio_incapacidad,
	                        fecha_terminacion_incapacidad, bonificacion, transporte);
	                listaNovedades.add(novedad);

	                linea = br.readLine();
	                ND.agregar(novedad);
	            }
	            imprimirListaNovedades();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return "confirmacion.xhtml";
	    }
	    public void imprimirListaNovedades() {
	        System.out.println("Lista de Novedades:");
	        for (NovedadesDTO novedad : listaNovedades) {
	            System.out.println("Código: " + novedad.getCodigo());
	            System.out.println("Incapacidad: " + novedad.getNovedad_incapacidad());
	            System.out.println("Vacaciones: " + novedad.getNovedad_vacaciones());
	            System.out.println("Días trabajados en el mes: " + novedad.getNumero_dias_trabajados_en_el_mes());
	            System.out.println("Días de incapacidades en el mes: " + novedad.getNumero_dias_incapacidades_en_el_mes());
	            System.out.println("Días de vacaciones: " + novedad.getNumero_de_dias_vacaciones());
	            System.out.println("Fecha inicio de vacaciones: " + novedad.getFecha_inicio_de_vacaciones());
	            System.out.println("Fecha término de vacaciones: " + novedad.getFecha_terminacion_de_vacaciones());
	            System.out.println("Fecha inicio de incapacidad: " + novedad.getFecha_inicio_incapacidad());
	            System.out.println("Fecha término de incapacidad: " + novedad.getFecha_terminacion_incapacidad());
	            System.out.println("Bonificación: " + novedad.getBonificacion());
	            System.out.println("Transporte: " + novedad.getTransporte());
	            System.out.println("------------------------------");
	        }
	    }

}
