import java.util.*;

public class Prueba {
	// Método calificacionTrimestral(Hecho por Iván López Pérez).

	public static void calificacionTrimestral(ArrayList<Alumno> alumno) {

		Scanner entrada = new Scanner(System.in);

		// Variables.

		boolean correcto;
		int seleccionar = Integer.MIN_VALUE;
		
		//Declaramos el objeto calificacion
		
		Calificacion calificacion = new Calificacion();
		
		// Declaramos un ArrayList para introducir las calificaciones.
		
		ArrayList<Calificacion> calificaciones = new ArrayList <Calificacion>();

		// Solicitamos el alumno sobre el que queremos introducir las notas del
		// trimestre.

		System.out.println("Introduzca la posición del alumno sobre el que desea introducir su nota.");

		// Bucle para la excepción en caso de que no exista el alumno en dicha posicion.

		do {

			try {

				seleccionar = entrada.nextInt();
				
				alumno.get(seleccionar -1);

				correcto = true;

			} catch (InputMismatchException ex) {

				System.out.println("Error. Introduzca una posición válida.");

				correcto = false;

			}catch(IndexOutOfBoundsException ex2) {
			
				System.out.println("Error. Introduzca una posición válida.");

				correcto = false;
				
			}

		} while (correcto = false);

		// Añadimos los datos al ArrayList de calificaciones

				System.out.println("Diga la asignatura sobre la que quiere introducir la nota.");
				calificacion.setAsignatura(entrada.nextLine());

				System.out.println("Diga la nota obtenida en dicha asignatura.");
				calificacion.setNota(entrada.nextLine());
			
			calificaciones.add(calificacion);
			
		

		}
}

