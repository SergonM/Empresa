package co.edu.unbosque.model;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import co.edu.unbosque.dao.EmpleadoDAO;
import co.edu.unbosque.dto.EmpleadoDTO;
import co.edu.unbosque.dto.NovedadesDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManagedBean
@SessionScoped
public class EmpleadoBean {
	private int codigo;
	private String nombre_empleado;
	private String dependencia;
	private String cargo;
	private String fecha_ingreso;
	private String eps;
	private String arl;
	private String pension,resultado;
	private double sueldo;
	private String linea;
	private List<EmpleadoDTO> listaEmpleados = new ArrayList<>();
	private String orden;
	private List<EmpleadoDTO> listaEmpleadosOrdenada;
	
	/**
	 * @return the listaEmpleadosOrdenada
	 */
	public List<EmpleadoDTO> getListaEmpleadosOrdenada() {
		return listaEmpleadosOrdenada;
	}
	/**
	 * @param listaEmpleadosOrdenada the listaEmpleadosOrdenada to set
	 */
	public void setListaEmpleadosOrdenada(List<EmpleadoDTO> listaEmpleadosOrdenada) {
		this.listaEmpleadosOrdenada = listaEmpleadosOrdenada;
	}
	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}
	/**
	 * @return the orden
	 */
	public String getOrden() {
		return orden;
	}
	/**
	 * @param orden the orden to set
	 */
	public void setOrden(String orden) {
		this.orden = orden;
	}
	/**
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}
	/**
	 * @return the listaEmpleados
	 */
	public List<EmpleadoDTO> getListaEmpleados() {
		return listaEmpleados;
	}
	/**
	 * @param listaEmpleados the listaEmpleados to set
	 */
	public void setListaEmpleados(List<EmpleadoDTO> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
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
	 * @return the cargo
	 */
	public String eps() {
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
	
	public String agregar() {
		 EmpleadoDAO ED = new EmpleadoDAO();
	        EmpleadoDTO nuevoEmpleado = new EmpleadoDTO(this.codigo, this.nombre_empleado, this.dependencia, this.cargo, this.fecha_ingreso, this.eps, this.arl, this.pension, this.sueldo);
	        this.resultado = ED.agregar(nuevoEmpleado);
		if(this.resultado.equals("OK")) {
			return "confirmacion.xhtml";
		}
		else {
			return "error.xhtml";
		}
	}
	public String eliminar() {
        EmpleadoDAO ED = new EmpleadoDAO();
        this.resultado = ED.eliminar(this.codigo);

        if (this.resultado.equals("OK")) {
            listaEmpleados.removeIf(empleado -> empleado.getCodigo() == this.codigo);
            return "confirmacion.xhtml";
        } else {
            return "error.xhtml";
        }
    }
	 public String actualizar() {
	        EmpleadoDAO ED = new EmpleadoDAO();
	        this.resultado = ED.actualizar(this.codigo, new EmpleadoDTO(this.codigo, this.nombre_empleado, this.dependencia, this.cargo, this.fecha_ingreso, this.eps, this.arl, this.pension, this.sueldo));

	        if (this.resultado.equals("OK")) {
	            for (EmpleadoDTO empleado : listaEmpleados) {
	                if (empleado.getCodigo() == this.codigo) {
	                    empleado.setNombre_empleado(this.nombre_empleado);
	                    empleado.setDependencia(this.dependencia);
	                    empleado.setCargo(this.cargo);
	                    empleado.setFecha_ingreso(this.fecha_ingreso);
	                    empleado.setEps(this.eps);
	                    empleado.setArl(this.arl);
	                    empleado.setPension(this.pension);
	                    empleado.setSueldo(this.sueldo);
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
			EmpleadoDAO ED = new  EmpleadoDAO();
			String projectPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
			String filePath = projectPath + "data/Nomina.csv";

			BufferedReader br = new BufferedReader(new FileReader(filePath));

			linea = br.readLine();
			while(linea!= null) {
				  String datos[] = linea.split(",");
				    codigo = Integer.parseInt(datos[0]);
				    nombre_empleado = datos[1];
				    dependencia = datos[2];
				    cargo = datos[3];
				    fecha_ingreso = datos[4];
				    eps = datos[5];
				    arl = datos[6];
				    pension = datos[7];
				    
				    String sueldoString = datos[8].replace(".", "");
				    sueldo = Double.parseDouble(sueldoString);

				    EmpleadoDTO empleado = new EmpleadoDTO(codigo, nombre_empleado, dependencia, cargo, fecha_ingreso, eps, arl, pension, sueldo);
	                listaEmpleados.add(empleado);
				    linea = br.readLine();
				    ED.agregar(new EmpleadoDTO(codigo, nombre_empleado, dependencia, cargo, fecha_ingreso, eps, arl, pension, sueldo));
				    
			}
//			imprimirListaEmpleados();
//			generarReporteEmpleados("ascendente");
//			generarReporteEmpleadosPorDependencia("ascendente");
//			generarReporteEmpleadosPorCargoYDependencia("ascendente");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "confirmacion.xhtml";
	}
	 public void imprimirListaEmpleados() {
	        System.out.println("Lista de Empleados:");
	        for (EmpleadoDTO empleado : listaEmpleados) {
	            System.out.println("Código: " + empleado.getCodigo());
	            System.out.println("Nombre: " + empleado.getNombre_empleado());
	            System.out.println("Dependencia: " + empleado.getDependencia());
	            System.out.println("Cargo: " + empleado.getCargo());
	            System.out.println("Fecha de Ingreso: " + empleado.getFecha_ingreso());
	            System.out.println("EPS: " + empleado.getEps());
	            System.out.println("ARL: " + empleado.getArl());
	            System.out.println("Pensión: " + empleado.getPension());
	            System.out.println("Sueldo: " + empleado.getSueldo());
	            System.out.println("------------------------------");
	        }
	    }
	 
//	 public void generarReporteEmpleados(String orden) {
//		    if (orden.equals("ascendente")) {
//		        listaEmpleados.sort(Comparator.comparing(EmpleadoDTO::getNombre_empleado));
//		    } else if (orden.equals("descendente")) {
//		        listaEmpleados.sort(Comparator.comparing(EmpleadoDTO::getNombre_empleado).reversed());
//		    }
//		    System.out.println("Cantidad de empleados: " + listaEmpleados.size());
//		    System.out.println("Lista de empleados:");
//		    for (EmpleadoDTO empleado : listaEmpleados) {
//		        System.out.println(empleado.getNombre_empleado());
//		    }
//		}
	 public void generarReporteEmpleados(String orden) {
		    if (orden.equals("ascendente")) {
		        listaEmpleadosOrdenada = new ArrayList<>(listaEmpleados);
		        listaEmpleadosOrdenada.sort(Comparator.comparing(EmpleadoDTO::getNombre_empleado));
		    } else if (orden.equals("descendente")) {
		        listaEmpleadosOrdenada = new ArrayList<>(listaEmpleados);
		        listaEmpleadosOrdenada.sort(Comparator.comparing(EmpleadoDTO::getNombre_empleado).reversed());
		    } else {
		        // Si el orden no es válido, devolver la lista sin cambios
		        listaEmpleadosOrdenada = new ArrayList<>(listaEmpleados);
		    }
		}
	 public void generarReporteEmpleadosPorDependencia(String orden) {
		    Map<String, List<EmpleadoDTO>> empleadosPorDependencia = new HashMap<>();

		    for (EmpleadoDTO empleado : listaEmpleados) {
		        String dependencia = empleado.getDependencia();
		        empleadosPorDependencia.computeIfAbsent(dependencia, k -> new ArrayList<>()).add(empleado);
		    }

		    List<String> dependenciasOrdenadas = new ArrayList<>(empleadosPorDependencia.keySet());
		    if (orden.equals("ascendente")) {
		        dependenciasOrdenadas.sort(Comparator.naturalOrder());
		    } else if (orden.equals("descendente")) {
		        dependenciasOrdenadas.sort(Comparator.reverseOrder());
		    }

		    System.out.println("Cantidad de dependencias: " + dependenciasOrdenadas.size());
		    for (String dependencia : dependenciasOrdenadas) {
		        System.out.println("Dependencia: " + dependencia);
		        List<EmpleadoDTO> empleadosEnDependencia = empleadosPorDependencia.get(dependencia);
		        System.out.println("Cantidad de empleados: " + empleadosEnDependencia.size());
		        System.out.println("Lista de empleados:");
		        for (EmpleadoDTO empleado : empleadosEnDependencia) {
		            System.out.println(empleado.getNombre_empleado());
		        }
		        System.out.println("------------------------------");
		    }
		}
	 
	 public void generarReporteEmpleadosPorCargoYDependencia(String orden) {
		    Map<String, Map<String, List<EmpleadoDTO>>> empleadosPorDependenciaYCargo = new HashMap<>();

		    for (EmpleadoDTO empleado : listaEmpleados) {
		        String dependencia = empleado.getDependencia();
		        String cargo = empleado.getCargo();

		        empleadosPorDependenciaYCargo
		            .computeIfAbsent(dependencia, k -> new HashMap<>())
		            .computeIfAbsent(cargo, k -> new ArrayList<>())
		            .add(empleado);
		    }

		    List<String> dependenciasOrdenadas = new ArrayList<>(empleadosPorDependenciaYCargo.keySet());
		    if (orden.equals("ascendente")) {
		        dependenciasOrdenadas.sort(Comparator.naturalOrder());
		    } else if (orden.equals("descendente")) {
		        dependenciasOrdenadas.sort(Comparator.reverseOrder());
		    }

		    System.out.println("Cantidad de dependencias: " + dependenciasOrdenadas.size());
		    for (String dependencia : dependenciasOrdenadas) {
		        System.out.println("Dependencia: " + dependencia);
		        Map<String, List<EmpleadoDTO>> empleadosPorCargo = empleadosPorDependenciaYCargo.get(dependencia);

		        List<String> cargosOrdenados = new ArrayList<>(empleadosPorCargo.keySet());
		        if (orden.equals("ascendente")) {
		            cargosOrdenados.sort(Comparator.naturalOrder());
		        } else if (orden.equals("descendente")) {
		            cargosOrdenados.sort(Comparator.reverseOrder());
		        }

		        for (String cargo : cargosOrdenados) {
		            System.out.println("Cargo: " + cargo);
		            List<EmpleadoDTO> empleadosEnCargo = empleadosPorCargo.get(cargo);
		            System.out.println("Cantidad de empleados: " + empleadosEnCargo.size());
		            System.out.println("Lista de empleados:");
		            for (EmpleadoDTO empleado : empleadosEnCargo) {
		                System.out.println(empleado.getNombre_empleado());
		            }
		            System.out.println("------------------------------");
		        }
		    }
		}
	 public String reportePersonal() {
		 generarReporteInformacionPersonal(this.codigo);
		 return "infoPersonall.xhtml";
	 }

	 public void generarReporteInformacionPersonal(int codigoPersonal) {
		 EmpleadoDTO empleado = buscarEmpleadoPorCodigoPersonal(codigoPersonal);

	     if (empleado != null) {
	    	this.codigo = codigoPersonal;
	    	this.nombre_empleado = empleado.getNombre_empleado();
	    	this.dependencia = empleado.getDependencia();
	    	this.cargo=empleado.getCargo();
	    	this.fecha_ingreso=empleado.getFecha_ingreso();
	    	this.eps=empleado.getEps();
	    	this.pension = empleado.getPension();
	    	this.sueldo = empleado.getSueldo();
	         System.out.println("Nombre completo: " + empleado.getNombre_empleado());
	         System.out.println("Código Personal: " + empleado.getCodigo());
	         System.out.println("Dependencia: " + empleado.getDependencia());
	         System.out.println("Cargo: " + empleado.getCargo());
	         System.out.println("Fecha de ingreso: " + empleado.getFecha_ingreso()); 
	         System.out.println("EPS: " + empleado.getEps());
	         System.out.println("Aporte Pensión: " + empleado.getPension());
	         System.out.println("Salario: " + empleado.getSueldo());
	         System.out.println("Discriminación de Novedades:");
	         imprimirNovedadesEmpleado(empleado);
	     } else {
	         System.out.println("No se encontró un empleado con el código personal proporcionado.");
	     }
	 }

	 private EmpleadoDTO buscarEmpleadoPorCodigoPersonal(int codigoPersonal) {
	     for (EmpleadoDTO empleado : listaEmpleados) {
	         if (empleado.getCodigo() == codigoPersonal) {
	             return empleado;
	         }
	     }
	     return null;
	 }

	 private void imprimirNovedadesEmpleado(EmpleadoDTO empleado) {
		    NovedadesBean NB = new NovedadesBean();
		    List<NovedadesDTO> listaNovedades = NB.getListaNovedades();

		    System.out.println("Novedades del empleado:");
		    for (NovedadesDTO novedad : listaNovedades) {
		        if (novedad.getCodigo() == empleado.getCodigo()) {
		            System.out.println("Novedad: " + novedad.getNovedad_incapacidad()); 
		            System.out.println("Novedad: " + novedad.getNovedad_vacaciones());
		        }
		    }
		}
       

	
}
