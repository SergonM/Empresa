package co.edu.unbosque.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edu.unbosque.dto.NovedadesDTO;

public class NovedadesDAO {
	public String agregar(Object registro) {
		String resultado;
		SessionFactory miFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(NovedadesDTO.class)
				.buildSessionFactory();

		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			miSession.save((NovedadesDTO)registro);
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
				.addAnnotatedClass(NovedadesDTO.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();

		try {
			miSession.beginTransaction();
			NovedadesDTO novedades = (NovedadesDTO) miSession.createQuery("from NovedadesDTO where codigo  =:codigo  ")
					.setParameter("codigo  ", codigo  )
					.uniqueResult();
			if (novedades != null) {
				miSession.delete(novedades);
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
		            .addAnnotatedClass(NovedadesDTO.class)
		            .buildSessionFactory();
		    Session miSession = miFactory.openSession();

		    try {
		        miSession.beginTransaction();
		        NovedadesDTO novedad = miSession.get(NovedadesDTO.class, codigo );
		        if (novedad != null) {
		        	NovedadesDTO  nuevaNOvedad= (NovedadesDTO) registro;
		        	nuevaNOvedad.setCodigo(codigo );
		        	nuevaNOvedad.setNovedad_incapacidad(nuevaNOvedad.getNovedad_incapacidad());
		        	nuevaNOvedad.setNovedad_vacaciones(nuevaNOvedad.getNovedad_vacaciones());
		        	nuevaNOvedad.setNumero_dias_trabajados_en_el_mes(nuevaNOvedad.getNumero_dias_trabajados_en_el_mes());
		        	nuevaNOvedad.setNumero_dias_incapacidades_en_el_mes(nuevaNOvedad.getNumero_dias_incapacidades_en_el_mes());
		        	nuevaNOvedad.setNumero_de_dias_vacaciones(nuevaNOvedad.getNumero_de_dias_vacaciones());
		        	nuevaNOvedad.setFecha_inicio_de_vacaciones(nuevaNOvedad.getFecha_inicio_de_vacaciones());
		        	nuevaNOvedad.setFecha_terminacion_de_vacaciones(nuevaNOvedad.getFecha_terminacion_de_vacaciones());
		        	nuevaNOvedad.setFecha_inicio_incapacidad(nuevaNOvedad.getFecha_inicio_incapacidad());
		        	nuevaNOvedad.setFecha_terminacion_incapacidad(nuevaNOvedad.getFecha_terminacion_incapacidad());
		        	nuevaNOvedad.setBonificacion(nuevaNOvedad.getBonificacion());
		        	nuevaNOvedad.setTransporte(nuevaNOvedad.getTransporte());
		            miSession.update(nuevaNOvedad);
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
