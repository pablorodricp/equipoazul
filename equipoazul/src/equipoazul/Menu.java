package equipoazul;
import java.util.*;

public class Menu {
	

	// Metodo listarAlumnos (Autor: Pablo Rodriguez-Contreras)
	public static Alumno listarAlumnos(ArrayList<Alumno> alumno) {
		
		Alumno lista = null;
		
		Iterator<Alumno> iterador = alumno.iterator();
		while(iterador.hasNext()) {
			Alumno elemento = iterador.next();
			lista = elemento;
		}
		return lista;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		ArrayList<Alumno> alumnos = new ArrayList();
		Alumno alumnoNuevo = new Alumno("77553965N");
		
		alumnos.add(alumnoNuevo);
		
		System.out.println(alumnos.size());
		
		System.out.println(Menu.listarAlumnos(alumnos));
		
		
		}
	}


