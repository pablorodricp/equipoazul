import java.util.*;

public class main {

	/*-----------------------------------------------------------------------------------------------*/

	// METODOS ESTATICOS

	// Metodo darAlta (Hecho por Francisco Cervilla)

	public static void darAlta(ArrayList<Alumno> alumno) {
<<<<<<< HEAD

		Scanner entrada = new Scanner(System.in);

=======
		
		Scanner entrada = new Scanner (System.in);
		
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
		Alumno alumnoNuevo = new Alumno();

		System.out.println("Introduzca su nombre.");
<<<<<<< HEAD

		alumno.setNombre(entrada.nextLine());

		System.out.println("Introduzca sus apellidos.");

		alumno.setApellidos(entrada.nextLine());

		System.out.println("Introduzca su DNI.");

		alumno.setDni(entrada.nextLine());

		System.out.println("Introduzca su tel�fono.");

		alumno.setTelefono(entrada.nextLine());

		System.out.println("Introduzca su e-mail.");

		alumno.setEmail(entrada.nextLine());

=======
		
			alumnoNuevo.setNombre(entrada.nextLine());
		
		System.out.println("Introduzca sus apellidos.");
		
			alumnoNuevo.setApellidos(entrada.nextLine());
		
		System.out.println("Introduzca su DNI.");
		
			alumnoNuevo.setDni(entrada.nextLine());
		
		System.out.println("Introduzca su tel�fono.");
			
			alumnoNuevo.setTelefono(entrada.nextLine());
		
		System.out.println("Introduzca su e-mail.");
		
			alumnoNuevo.setEmail(entrada.nextLine());
		
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
		alumno.add(alumnoNuevo);

	}

	// Metodo darBaja (Hecho por Francisco Cervilla)

	public static void darBaja(ArrayList<Alumno> alumno) {

		Scanner entrada = new Scanner(System.in);

		boolean correcto;

		int seleccionar = Integer.MIN_VALUE;

		System.out.println("Introduzca la posici�n del alumno que desea dar de baja.");

		// Bucle para la excepcion en caso de que no exista el alumno en dicha posicion

		do {

			try {

				seleccionar = entrada.nextInt();

				correcto = true;

			} catch (InputMismatchException ex) {

				System.out.println("Error. Introduzca una posici�n v�lida.");

				correcto = false;

			}

		} while (correcto == false);

		// Bucle para la excepcion en caso de que la posicion este fuera de los limites

		do {

			try {

				alumno.remove(seleccionar);

			} catch (IndexOutOfBoundsException ex2) {

				System.out.println("Error. Introduzca una posici�n v�lida.");
			}

		} while (seleccionar < 0 || seleccionar > alumno.size());

	}

	// M�todo calificacionTrimestral(Hecho por Iv�n L�pez P�rez).

	public static void calificacionTrimestral(ArrayList<Alumno> alumno) {

		Scanner entrada = new Scanner(System.in);

		// Variables.

		boolean correcto;
		int seleccionar = Integer.MIN_VALUE;

		// Solicitamos el alumno sobre el que queremos introducir las notas del
		// trimestre.

		System.out.println("Introduzca la posici�n del alumno sobre el que desea introducir su nota.");

		// Bucle para la excepci�n en caso de que no exista el alumno en dicha posicion.

		do {

			try {

				seleccionar = entrada.nextInt();

				correcto = true;

			} catch (InputMismatchException ex) {

				System.out.println("Error. Introduzca una posici�n v�lida.");

				correcto = false;

			}

		} while (correcto = false);

		// Bucle para la excepci�n en caso de que la posici�n est� fuera de los l�mites.

		do {

			try {

				System.out.println("Diga la asignatura sobre la que quiere introducir la nota.");
				alumno.setAsignatura(entrada.nextLine());

				System.out.println("Diga la nota obtenida en dicha asignatura.");
				alumno.setNota(entrada.nextLine());

			} catch (IndexOutOfBoundsException ex2) {

				System.out.println("Error. Introduzca una posici�n v�lida.");
			}

		} while (seleccionar < 0 || seleccionar > alumno.size());

	}
	
<<<<<<< HEAD
	// M�todo listarCalificaciones(Hecho por Iv�n L�pez P�rez).
=======
	// Metodo listar (Hecho por Pablo Rodriguez-Contreras)
	
	public static void listar(ArrayList<Alumno> alumno) throws Exception {
		
		if (alumno.size() == 0) {
			throw new Exception("La lista de alumnos esta vacia"); // Si la lista est� vacia lanza una excepcion
		}
		
		for (int i = 0;i<alumno.size();i++) {
			System.out.println("DNI: "+alumno.get(i).getDni());
			System.out.println("Nombre: "+alumno.get(i).getNombre());
			System.out.println("Apellidos: "+alumno.get(i).getApellidos());
			System.out.println("Telefono: "+alumno.get(i).getTelefono());
			System.out.println("Email: "+alumno.get(i).getEmail());
			System.out.println("Faltas: "+alumno.get(i).getFaltas());
			System.out.println("Notas: "+alumno.get(i).getNotas());
			System.out.println("------------------");
		}
		System.out.println("------------------");
	}
	
	// Metodo modificarAlumnos (Hecho por Pablo Rodriguez-Contreras)
	
	public static void modificarAlumnos(ArrayList<Alumno> alumno) {
		Scanner entrada = new Scanner(System.in);
		int m = 0;
		int pos = 0;
		Alumno aux = null;
		try { // Excepcion para controlar que el programa no termine en caso de no existir un alumno en esa posicion
		System.out.println("Introduzca la posicion del alumno que desee modificar");
		pos = entrada.nextInt(); // almacenamos la posicion del alumno
		aux = alumno.get(pos); // almacenamos toda la informacion del alumno en una variable auxiliar
								// para trabajar con ella
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		do {
			
			System.out.println("�Que desea modificar?\n"
					+"1. DNI"
					+"2. Nombre"
					+"3. Apellidos"
					+"4. Telefono"
					+"5. Email"
					+"6. Faltas"
					+"7. Salir");
			
			m = entrada.nextInt();
			
			switch (m) {
			case 1:
				System.out.println("Introduzca el nuevo DNI");
				aux.setDni(entrada.nextLine());
				break;
			case 2:
				System.out.println("Introduzca el nuevo nombre");
				aux.setNombre(entrada.nextLine());
				break;
			case 3:
				System.out.println("Introduzca los nuevos apellidos");
				aux.setApellidos(entrada.nextLine());
				break;
			case 4:
				System.out.println("Introduzca el nuevo telefono");
				aux.setTelefono(entrada.nextLine());
				break;
			case 5:
				System.out.println("Introduzca el nuevo email");
				aux.setEmail(entrada.nextLine());
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("La opcion introducida es erronea");
				break;
			}
		}while (m != 6);
		
		alumno.add(pos, aux); // se a�ade al arraylist de nuevo
	}
	
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
	
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

<<<<<<< HEAD
		Scanner entrada = new Scanner(System.in);

		// CREAMOS EL ARRAY LIST

		ArrayList<Alumno> alumnos = new ArrayList();

		// VARIABLES PARA EL MENU

		int opcion;

=======
		Scanner entrada = new Scanner (System.in);
		
		//CREAMOS EL ARRAY LIST
		
		ArrayList<Alumno> alumnos = new ArrayList(5);
		
		//VARIABLES PARA EL MENU
		
		int opcion;
		boolean sal = false;
		
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
		boolean salir = true;

		// MENU

		while (salir) {

			System.out.println("--------------------------------------\n" + "Introduzca una opci�n para el men�.\n"
					+ "1. Dar de alta alumnos.\n" + "2. Dar de baja alumnos.\n" + "3. Listar los alumnos\n"
					+ "4. Modificar alumnos.\n" + "5. Matricular alumnos.\n" + "6. Dar de baja de una asignatura.\n"
					+ "7. Introducir calificaci�n trimestral.\n" + "8. Listar calificaciones de alumnos.\n"
					+ "9. Poner una falta (d�a completo).\n" + "10. Poner una falta (en una sesi�n).\n"
					+ "11. Pasar lista.\n" + "12. Listar faltas.\n" + "13. Salir.\n"
					+ "--------------------------------------\n");

			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
<<<<<<< HEAD

				main.darAlta(alumnos);

				break;

			case 2:

				main.darBaja(alumnos);

				break;

			case 3:

=======
				sal = false;
				int n = 0;
				
				do {
					
				main.darAlta(alumnos);

				
				System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
						+". En caso negativo introduzca 0");
				
				int r = entrada.nextInt();

				if (r == 0)
				sal = true;
				} while (sal == false);
				break;
			case 2:
				sal = false;
				do {
					
				main.darBaja(alumnos);
				
				System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
						+". En caso negativo introduzca 0");
				
				int r = entrada.nextInt();

				if (r == 0)
				sal = true;
				} while (sal == false);
				break;
				
			case 3:				
				try {
					main.listar(alumnos);
				} catch (Exception ex) {
					System.out.println("Error: "+ex.getMessage());
				}
				
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
				break;

			case 4:
<<<<<<< HEAD

=======
				sal = false;
				do {
				main.modificarAlumnos(alumnos);
				System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
						+". En caso negativo introduzca 0");
				
				int r = entrada.nextInt();

				if (r == 0)
				sal = true;
				} while (sal == false);
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
				break;

			case 5:
<<<<<<< HEAD

=======
				sal = false;
				do {
					// INTRODUCIR AQUI EL CODIGO
					
					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+". En caso negativo introduzca 0");
					
					int r = entrada.nextInt();

					if (r == 0)
					sal = true;
					} while (sal == false);
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
				break;

			case 6:
<<<<<<< HEAD

=======
				sal = false;
				do {
					// INTRODUCIR AQUI EL CODIGO
					
					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+". En caso negativo introduzca 0");
					
					int r = entrada.nextInt();

					if (r == 0)
					sal = true;
					} while (sal == false);
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
				break;

			case 7:
<<<<<<< HEAD

=======
				sal = false;
				do {
					// INTRODUCIR AQUI EL CODIGO
					
					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+". En caso negativo introduzca 0");
					
					int r = entrada.nextInt();

					if (r == 0)
					sal = true;
					} while (sal == false);
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
				break;

			case 8:
<<<<<<< HEAD

				break;

			case 9:

=======
				sal = false;
				do {
					// INTRODUCIR AQUI EL CODIGO
					
					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+". En caso negativo introduzca 0");
					
					int r = entrada.nextInt();

					if (r == 0)
					sal = true;
					} while (sal == false);
				break;
				
			case 9: 
				sal = false;
				do {
					// INTRODUCIR AQUI EL CODIGO
					
					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+". En caso negativo introduzca 0");
					
					int r = entrada.nextInt();

					if (r == 0)
					sal = true;
					} while (sal == false);
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
				break;

			case 10:
<<<<<<< HEAD

=======
				sal = false;
				do {
					// INTRODUCIR AQUI EL CODIGO
					
					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+". En caso negativo introduzca 0");
					
					int r = entrada.nextInt();

					if (r == 0)
					sal = true;
					} while (sal == false);
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
				break;

			case 11:

				break;

			case 12:
<<<<<<< HEAD

=======
				sal = false;
				do {
					// INTRODUCIR AQUI EL CODIGO
					
					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+". En caso negativo introduzca 0");
					
					int r = entrada.nextInt();

					if (r == 0)
					sal = true;
					} while (sal == false);
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
				break;

			case 13:
<<<<<<< HEAD

				salir = false;

=======
				
>>>>>>> 1173399274a20e77cfdddb2a02847cfce6320d37
				System.out.println("Programa finalizado.");

				break;

			default:

				System.out.println("Opci�n incorrecta, introduzca otra.");

				break;

			}

		}

	}

}
