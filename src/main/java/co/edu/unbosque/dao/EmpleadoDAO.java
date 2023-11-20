package co.edu.unbosque.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edu.unbosque.dto.EmpleadoDTO;

public class EmpleadoDAO {
	public String agregar(Object registro) {
		String resultado;
		SessionFactory miFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(EmpleadoDTO.class)
				.buildSessionFactory();

		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			miSession.save((EmpleadoDTO)registro);
			miSession.getTransaction().commit();
			resultado ="OK";
			miSession.close();
		} catch (Exception e) {
			resultado = e.toString();
		} finally {
			miFactory.close();
		}
		return resultado;
	}
	public String eliminar(int codigo  ) {
		String resultado;
		SessionFactory miFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(EmpleadoDTO.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();

		try {
			miSession.beginTransaction();
			EmpleadoDTO persona = (EmpleadoDTO) miSession.createQuery("from EmpleadoDTO where codigo  =:codigo  ")
					.setParameter("codigo  ", codigo  )
					.uniqueResult();
			if (persona != null) {
				miSession.delete(persona);
				miSession.getTransaction().commit();
				resultado = "OK";
			} else {
				resultado = "No se encontró una persona con la id especificada.";
			}
		} catch (Exception e) {
			resultado = e.toString();
		} finally {
			miSession.close();
			miFactory.close();
		}       
		return resultado;
	}


	public String actualizar(int codigo , Object registro) {
		 String resultado;
		    SessionFactory miFactory = new Configuration()
		            .configure("hibernate.cfg.xml")
		            .addAnnotatedClass(EmpleadoDTO.class)
		            .buildSessionFactory();
		    Session miSession = miFactory.openSession();

		    try {
		        miSession.beginTransaction();
		        EmpleadoDTO Empleado = miSession.get(EmpleadoDTO.class, codigo );
		        if (Empleado != null) {
		        	EmpleadoDTO nuevoEmpleado = (EmpleadoDTO) registro;
		        	Empleado.setCodigo(codigo );
		        	Empleado.setNombre_empleado(nuevoEmpleado.getNombre_empleado());
		        	Empleado.setDependencia(nuevoEmpleado.getDependencia());
		        	Empleado.setCargo(nuevoEmpleado.getCargo());
		        	Empleado.setFecha_ingreso(nuevoEmpleado.getFecha_ingreso());
		        	Empleado.setEps(nuevoEmpleado.getEps());
		        	Empleado.setArl(nuevoEmpleado.getArl());
		        	Empleado.setPension(nuevoEmpleado.getPension());
		        	Empleado.setSueldo(nuevoEmpleado.getSueldo());
		            miSession.update(Empleado);
		            miSession.getTransaction().commit();
		            resultado = "OK";
		        } else {
		            resultado = "No se encontró una persona con el codigo especifico.";
		        }
		    } catch (Exception e) {
		        resultado = e.toString();
		    } finally {
		        miSession.close();
		        miFactory.close();
		    }       
		    return resultado;
	}

}
