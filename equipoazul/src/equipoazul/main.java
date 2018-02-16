import java.util.*;

public class main {

	/*-----------------------------------------------------------------------------------------------*/

	// METODOS ESTATICOS

	// Metodo darAlta (Hecho por Francisco Cervilla)

	public static void darAlta(ArrayList<Alumno> alumno) {

		Scanner entrada = new Scanner(System.in);

		Alumno alumnoNuevo = new Alumno();

		System.out.println("Introduzca su nombre.");

		alumno.setNombre(entrada.nextLine());

		System.out.println("Introduzca sus apellidos.");

		alumno.setApellidos(entrada.nextLine());

		System.out.println("Introduzca su DNI.");

		alumno.setDni(entrada.nextLine());

		System.out.println("Introduzca su teléfono.");

		alumno.setTelefono(entrada.nextLine());

		System.out.println("Introduzca su e-mail.");

		alumno.setEmail(entrada.nextLine());

		alumno.add(alumnoNuevo);

	}

	// Metodo darBaja (Hecho por Francisco Cervilla)

	public static void darBaja(ArrayList<Alumno> alumno) {

		Scanner entrada = new Scanner(System.in);

		boolean correcto;

		int seleccionar = Integer.MIN_VALUE;

		System.out.println("Introduzca la posición del alumno que desea dar de baja.");

		// Bucle para la excepcion en caso de que no exista el alumno en dicha posicion

		do {

			try {

				seleccionar = entrada.nextInt();

				correcto = true;

			} catch (InputMismatchException ex) {

				System.out.println("Error. Introduzca una posición válida.");

				correcto = false;

			}

		} while (correcto == false);

		// Bucle para la excepcion en caso de que la posicion este fuera de los limites

		do {

			try {

				alumno.remove(seleccionar);

			} catch (IndexOutOfBoundsException ex2) {

				System.out.println("Error. Introduzca una posición válida.");
			}

		} while (seleccionar < 0 || seleccionar > alumno.size());

	}

	// Método calificacionTrimestral(Hecho por Iván López Pérez).

	public static void calificacionTrimestral(ArrayList<Alumno> alumno) {

		Scanner entrada = new Scanner(System.in);

		// Variables.

		boolean correcto;
		int seleccionar = Integer.MIN_VALUE;

		// Solicitamos el alumno sobre el que queremos introducir las notas del
		// trimestre.

		System.out.println("Introduzca la posición del alumno sobre el que desea introducir su nota.");

		// Bucle para la excepción en caso de que no exista el alumno en dicha posicion.

		do {

			try {

				seleccionar = entrada.nextInt();

				correcto = true;

			} catch (InputMismatchException ex) {

				System.out.println("Error. Introduzca una posición válida.");

				correcto = false;

			}

		} while (correcto = false);

		// Bucle para la excepción en caso de que la posición esté fuera de los límites.

		do {

			try {

				System.out.println("Diga la asignatura sobre la que quiere introducir la nota.");
				alumno.setAsignatura(entrada.nextLine());

				System.out.println("Diga la nota obtenida en dicha asignatura.");
				alumno.setNota(entrada.nextLine());

			} catch (IndexOutOfBoundsException ex2) {

				System.out.println("Error. Introduzca una posición válida.");
			}

		} while (seleccionar < 0 || seleccionar > alumno.size());

	}
	
	// Método listarCalificaciones(Hecho por Iván López Pérez).
	
	public static void listarCalificaciones(ArrayList<Alumno> alumno) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Variables.
		
		int i;
		boolean correcto;
		int seleccionar = Integer.MIN_VALUE;
		
		// Solicitamos el alumno sobre el que queremos conocer las calificaciones.
		
		/* if (Alumnos.get(1).getNotas().get(i).getAsignatura) */
		
	}

	/*-----------------------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// CREAMOS EL ARRAY LIST

		ArrayList<Alumno> alumnos = new ArrayList();

		// VARIABLES PARA EL MENU

		int opcion;

		boolean salir = true;

		// MENU

		while (salir) {

			System.out.println("--------------------------------------\n" + "Introduzca una opción para el menú.\n"
					+ "1. Dar de alta alumnos.\n" + "2. Dar de baja alumnos.\n" + "3. Listar los alumnos\n"
					+ "4. Modificar alumnos.\n" + "5. Matricular alumnos.\n" + "6. Dar de baja de una asignatura.\n"
					+ "7. Introducir calificación trimestral.\n" + "8. Listar calificaciones de alumnos.\n"
					+ "9. Poner una falta (día completo).\n" + "10. Poner una falta (en una sesión).\n"
					+ "11. Pasar lista.\n" + "12. Listar faltas.\n" + "13. Salir.\n"
					+ "--------------------------------------\n");

			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:

				main.darAlta(alumnos);

				break;

			case 2:

				main.darBaja(alumnos);

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:

				break;

			case 9:

				break;

			case 10:

				break;

			case 11:

				break;

			case 12:

				break;

			case 13:

				salir = false;

				System.out.println("Programa finalizado.");

				break;

			default:

				System.out.println("Opción incorrecta, introduzca otra.");

				break;

			}

		}

	}

}
