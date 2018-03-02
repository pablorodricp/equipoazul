import java.util.*; 

public class main {

	/*-----------------------------------------------------------------------------------------------*/

	// METODOS ESTATICOS
	
	// METODO Comprobar (Hecho por Pablo Rodriguez-Contreras)
	// Metodo para comprobar si el alumno introducido existe. Se introduce un dni
	// y recorre el ArrayList alumno. Gracias al metodo equals, podemos saber si el dni
	// introducido ya se encuentra en el ArrayList.
	
	public static int Comprobar(ArrayList<Alumno> alumno) {
		
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduzca el DNI del alumno");
			String dni = entrada.next();
		
			Alumno aBuscar = new Alumno(dni);
			int posicion = alumno.indexOf(aBuscar);
		
			return posicion;
	}

	// Metodo1 darAlta (Hecho por Francisco Cervilla)

	public static void darAlta(ArrayList<Alumno> alumno) {

		Scanner entrada = new Scanner(System.in);

		Alumno aux = new Alumno();

		System.out.println("Introduzca su nombre.");

			aux.setNombre(entrada.nextLine());

		System.out.println("Introduzca sus apellidos.");

			aux.setApellidos(entrada.nextLine());

		System.out.println("Introduzca su DNI.");

			aux.setDni(entrada.nextLine());

		System.out.println("Introduzca su tel�fono.");

			aux.setTelefono(entrada.nextLine());

		System.out.println("Introduzca su e-mail.");

			aux.setEmail(entrada.nextLine());

		alumno.add(aux);

	}

	// Metodo2 darBaja (Hecho por Francisco Cervilla)

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

				alumno.remove(seleccionar-1);

			} catch (IndexOutOfBoundsException ex2) {

				System.out.println("Error. Introduzca una posici�n v�lida.");
			}

		} while (seleccionar < 0 || seleccionar > alumno.size());

	}

	// Metodo3 listar (Hecho por Pablo Rodriguez-Contreras)

	public static void listar(ArrayList<Alumno> alumno) throws Exception {

		
		
		if (alumno.size() == 0) {
			throw new Exception("La lista de alumnos esta vacia"); // Si la lista est� vacia lanza una excepcion
		}

		for (int i = 0; i < alumno.size(); i++) {
			System.out.println("DNI: " + alumno.get(i).getDni());
			
			System.out.println("Nombre: " + alumno.get(i).getNombre());
			
			System.out.println("Apellidos: " + alumno.get(i).getApellidos());
			
			System.out.println("Telefono: " + alumno.get(i).getTelefono());
			
			System.out.println("Email: " + alumno.get(i).getEmail());
			
			for (int j= 0;j<alumno.get(i).getFaltas().size(); j++) {
				
			ArrayList<DiaClase> dias2 = new ArrayList<DiaClase>();
			
			dias2 = alumno.get(i).getFaltas();
			
			System.out.println("\nDia: "+dias2.get(j).getDia().getDia()+"/"+dias2.get(j).getDia().getMes()+"/"+dias2.get(j).getDia().getAnio()+"\n"+"Faltas: ");
			
			
			char[] o = dias2.get(j).getSesiones().getSesiones();
			
			
			System.out.println("|"+String.valueOf(o)+"|");
			}
			System.out.println("\nNotas: " + alumno.get(i).getNotas());
			System.out.println("------------------");
		}
		System.out.println("------------------");
	}

	// Metodo4 modificarAlumnos (Hecho por Pablo Rodriguez-Contreras)

	public static void modificarAlumnos(ArrayList<Alumno> alumno) {
		Scanner entrada = new Scanner(System.in);
		int m = 0;
		int pos = 0;
		Alumno aux = null;
		try { // Excepcion para controlar que el programa no termine en caso de no existir un
				// alumno en esa posicion
			System.out.println("Introduzca la posicion del alumno que desee modificar");
			pos = entrada.nextInt(); // almacenamos la posicion del alumno
			aux = alumno.get(pos); // almacenamos toda la informacion del alumno en una variable auxiliar
									// para trabajar con ella
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		do {

			System.out.println("�Que desea modificar?\n" + "1. DNI\n" + "2. Nombre\n" + "3. Apellidos\n" + "4. Telefono\n"
					+ "5. Email\n" + "6. Faltas\n" + "7. Salir\n");

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
		} while (m != 6);

		alumno.add(pos, aux); // se a�ade al arraylist de nuevo
	}
	
	//M�todo5: matricularAlumno (Hecho por David Ram�rez)
	public static void matricularAlumno (ArrayList<Alumno> alumno ,ArrayList<Calificacion> matriculado) throws Exception {
		Scanner entrada = new Scanner(System.in);
		 
		
		
		//Entradas
			//N�mero de Alumno
		 	
				int c = 0;
				
				c = Comprobar(alumno);
				
				if (c>=0) {
			//Asignatura	
					
				Calificacion notas = null;
					
				System.out.println("Introduce la asignatura");
				
				String asignatura1 = entrada.next();
				
				for (int i = 0;i<alumno.get(c).getNotas().size();i++) {
					
				if (alumno.get(c).getNotas().get(i).getAsignatura() == asignatura1) {
					throw new Exception ("Error: El alumno ya esta matriculado en esta asignatura");
				}else {
					alumno.get(c).getNotas().add(notas);
				}
			}
				
				
				
		//Proceso: se realiza una comprobaci�n en el if por la cual si se cumple la condici�n estipulada (alumno.get(numeroAlumno).getAsignatura() == asignatura) se manda el mensaje de error, y en caso de que no se cumpla al ArrayList matriculado se le a�ade la asignatura introducida, indicando asi que al alumno se le ha matriculado asignatura
				
				matriculado.get(c).setAsignatura(asignatura1);	
				}else {
					
					throw new Exception ("Error: No existe el alumno");
				}
	}
	
	
	//M�todo6: bajaAsignatura (Hecho por David Ram�rez)
	public static void bajaAsignatura (ArrayList<Calificacion>matriculado, int numeroAlumno, String asignatura) throws Exception {
		Scanner entrada = new Scanner(System.in);
		//Entradas
			//N�mero de Alumno
				System.out.println("Introduce el n�mero del alumno que deseas matricular");
				numeroAlumno= entrada.nextInt();
			//Asignatura	
				System.out.println("Introduce la asignatura");
				asignatura= entrada.nextLine();
		//Proceso: se realiza una comprobaci�n en el if por la cual si se cumple la condici�n estipulada (alumno.get(numeroAlumno).getAsignatura() != asignatura) se manda el mensaje de error, y en caso de que no se cumpla al ArrayList matriculado se le cambia una asignatura introducida por un "", indicando asi que al alumno ya no esta matriculado en la asignatura
			if (matriculado.get(numeroAlumno).getAsignatura() != asignatura) {
				throw new Exception ("Error: El alumno no esta matriculado en esta asignatura");
			}
			matriculado.get(numeroAlumno).setAsignatura("");
	}

	// M�todo7 calificacionTrimestral(Hecho por Iv�n L�pez P�rez).

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

		System.out.println("Introduzca la posici�n del alumno sobre el que desea introducir su nota.");

		// Bucle para la excepci�n en caso de que no exista el alumno en dicha posicion.

		do {

			try {

				seleccionar = entrada.nextInt();
				
				alumno.get(seleccionar -1);

				correcto = true;

			} catch (InputMismatchException ex) {

				System.out.println("Error. Introduzca una posici�n v�lida.");

				correcto = false;

			}catch(IndexOutOfBoundsException ex2) {
			
				System.out.println("Error. Introduzca una posici�n v�lida.");

				correcto = false;
				
			}

		} while (correcto = false);

		// A�adimos los datos al ArrayList de calificaciones

				System.out.println("Diga la asignatura sobre la que quiere introducir la nota.");
				calificacion.setAsignatura(entrada.nextLine());

				System.out.println("Diga la nota obtenida en dicha asignatura.");
				calificacion.setNota(entrada.nextLine());
			
			calificaciones.add(calificacion);
			
		

		}

	// M�todo8 listarCalificaciones(Hecho por Iv�n L�pez P�rez).

	public static void listarCalificaciones(ArrayList<Alumno> alumno) {

		Scanner entrada = new Scanner(System.in);

		// Variables.

		int i;
		boolean correcto;
		int seleccionar = Integer.MIN_VALUE;

		// Solicitamos el alumno sobre el que queremos conocer las calificaciones.

		System.out.println("Introduzca la posici�n del alumno sobre el que desea conocer su nota.");

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

				for (i = 0; i < alumno.size(); i++) {
					if (i == seleccionar) {
						System.out.println(
								"Nombre: " + alumno.get(i).getNombre() + ". Nota: " + alumno.get(i).getNotas());
					}
				}

			} catch (IndexOutOfBoundsException ex2) {

				System.out.println("Error. Introduzca una posici�n v�lida.");
			}

		} while (seleccionar < 0 || seleccionar > alumno.size());

	}
	
	
	// Metodo 9 Poner una falta dia completo ( Hecho por Francisco Cervilla y Pablo Rodriguez-Contreras)
	public static void ponerFaltaDia(ArrayList<Alumno> alumno) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		int c;
		
		System.out.print("Introduzca el dia: ");
		int dia = entrada.nextInt();
		
		System.out.println("\n");
		
		System.out.print("Introduzca el mes: ");
		int mes = entrada.nextInt();
		
		System.out.println("\n");
		
		System.out.print("Introduzca el a�o: ");
		int anio = entrada.nextInt();
	
		ArrayList<DiaClase> dias2 = new ArrayList<DiaClase>();
		
	try {
		Fecha dias = new Fecha(dia, mes, anio);
	
		
		DiaClase diaClase = new DiaClase(dias);
		
		
		
		c = main.Comprobar(alumno);
		
		if (c >= 0) {
			
				diaClase.getSesiones().faltaDiaEntero();
				alumno.get(c).getFaltas().add(diaClase);
				dias2.add(diaClase);
			}
		} catch (Exception ex) {
				System.out.println("Error: "+ex.getMessage());
			}
		
	
}
	
	// Metodo 10 ponerFaltaHora autor:Diego Maestra Martinez , Pablo Rodriguez-Contreras y Francisco Cervilla
	
		public static void faltaHora(ArrayList<Alumno> alumno )throws Exception{
			Scanner entrada= new Scanner(System.in);
			// Declaramos las variables
			int c = 0;
			
			System.out.print("Introduzca el dia: ");
			int dia = entrada.nextInt();
			
			System.out.println("\n");
			
			System.out.print("Introduzca el mes: ");
			int mes = entrada.nextInt();
			
			System.out.println("\n");
			
			System.out.print("Introduzca el a�o: ");
			int anio = entrada.nextInt();
				
				try { // Comprobar que la fecha es correcta
					
					Fecha fecha = new Fecha(dia,mes,anio);
					
					DiaClase falta = new DiaClase(fecha);
	
				
				// Ponemos la falta
				
			c = Comprobar(alumno);
			
			if (c >= 0) {
							
				System.out.println("Introduzca la sesion en la que falta el alumno ");
					
				falta.getSesiones().faltaHora(entrada.nextInt());
				alumno.get(c).getFaltas().add(falta);
							
			}
			}catch(Exception ex) {
							System.out.println("Sesion entre 1 y 6:"+ex.getMessage());
						}
				
			System.out.println("Falta puesta correctamente");
		}

	

	
	//Metodo 11 pasarLista Autores: Francisco Cervilla y Pablo Rodriguez-Contreras
	
	public static void pasarLista(ArrayList<Alumno> alumno, Fecha dias) throws Exception {
		
		Scanner entrada = new Scanner(System.in);
		
		
		//Variables
		
		int dd, mm, aa;
		
		boolean existe = false;
		
		int contestacion = 0;
		
		//Pedimos el dia
		
		System.out.println("Introduzca el d�a.");
		
			dd = entrada.nextInt();
		
		System.out.println("Introduzca el mes.");
		
			mm = entrada.nextInt();
		
		System.out.println("Introduzca el a�o.");
		
			aa = entrada.nextInt();
		
		//Creamos la instancia fecha
		
		Fecha fecha = new Fecha(dd,mm,aa);
		
		for(int n = 0; n< alumno.size() ; n++) {
			
			//Recorremos el ArrayList de alumno y preguntamos si ha faltado
			
			System.out.println("�El alumno ha faltado el d�a de hoy?: "+alumno.get(n).getNombre() + " " + alumno.get(n).getApellidos() );
			
			do {
			
				System.out.println("Introduzca si el alumno ha faltado o no (1 = Si y cualquier otro numero para No).");
				
				try {
					
					contestacion = entrada.nextInt();
					
					existe = true;
					
				}catch(InputMismatchException exist) {
					
					System.out.println("Error. Opcion incorrecta.");
					
					existe = false;
					
				}

			}while(existe == false);
			
			if(contestacion == 1) {
				
				do {//Comprobamos si ha faltado el dia completo o solo una sesion
					
					System.out.println("�Ha faltado el dia completo? (1 = Si y cualquier otro numero para No).");
					
					try {
						
						contestacion = entrada.nextInt();
						
						existe = true;
						
					}catch(InputMismatchException exist) {
						
						System.out.println("Error. Opcion incorrecta.");
						
						existe = false;
						
					}

				}while(existe == false);
				
				if(contestacion == 1) {//Se aplica el metodo de falta diaCompleto
				//	main.ponerFaltaDia(alumno, "77553965N", fecha);
					
				}else {//Se aplica el metodo de falta de sesion
					
					
				}
				
			}
			
			
		}
		
		
	}

	/*-----------------------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// CREAMOS EL ARRAY LIST

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<DiaClase> dias = new ArrayList<DiaClase>();
		ArrayList<Calificacion> matriculado = new ArrayList<Calificacion>();
		
		// VARIABLES PARA EL MENU

		int opcion;

		boolean sal = false;

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
				sal = false;
				int n = 0;

				do {

					main.darAlta(alumnos);

					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+ ". En caso negativo introduzca 0");

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
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 3:
				try {
					main.listar(alumnos);
				} catch (Exception ex) {
					System.out.println("Error: " + ex.getMessage());
				}

				break;

			case 4:

				sal = false;
				do {
					main.modificarAlumnos(alumnos);
					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 5:

				sal = false;
				do {
					
					try {
						main.matricularAlumno(alumnos,matriculado);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}

					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 6:

				sal = false;
				do {
					// INTRODUCIR AQUI EL CODIGO

					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 7:

				sal = false;
				do {
					main.calificacionTrimestral(alumnos);

					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 8:

				sal = false;
				do {
					main.listarCalificaciones(alumnos);

					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);
				break;

			case 9:
							
				sal = false;
				do {
					
					try {
						main.ponerFaltaDia(alumnos);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}

					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 10:

				sal = false;
				do {
					try {
						main.faltaHora(alumnos);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}

					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 11:
				try {
					// main.pasarLista(alumnos, dias);
				} catch (Exception ex) {
					
					System.out.println("Error: "+ex.getMessage());
				}
				break;

			case 12:

				sal = false;
				do {
					// INTRODUCIR AQUI EL CODIGO

					System.out.println("�Desea repetir la opci�n?. En caso afirmativo introduzca 1"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 13:
				salir = false;

				System.out.println("Programa finalizado.");

				break;

			default:

				System.out.println("Opci�n incorrecta, introduzca otra.");

				break;

			}

		}

	}

}
