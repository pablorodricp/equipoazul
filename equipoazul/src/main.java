import java.util.*; 

public class main {

	/*-----------------------------------------------------------------------------------------------*/

	// METODOS ESTATICOS
	
	// Metodo comprobar Hecho por Pablo Rodríguez-Contreras Puertas
	
	public static int comprobar(ArrayList<Alumno> alumno) {
		
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduzca el DNI del alumno");
			String dni = entrada.next();
		
			Alumno aBuscar = new Alumno(dni);
			int posicion = alumno.indexOf(aBuscar);
		
			return posicion;
	}
	
	// Metodo comprobarMatricula Hecho por Pablo Rodríguez-Contreras Puertas
	
	public static int comprobarMatricula(ArrayList<Alumno> alumno, String asignatura1, int posicionalumno) {
		
		int posicion = -1;
		
		for (int i = 0;i<alumno.get(posicionalumno).getNotas().size();i++) {
			if (alumno.get(posicionalumno).getNotas().get(i).getAsignatura().equals(asignatura1)) {
				posicion = i;
			}
		}
		
		return posicion;
		
	}
	

	// Metodo1 darAlta (Hecho por Francisco Cervilla)

	public static void darAlta(ArrayList<Alumno> alumno) throws Exception {

		Scanner entrada = new Scanner(System.in);

		Alumno aux = new Alumno();
		
		//Setters

		System.out.println("Introduzca su nombre.");

			aux.setNombre(entrada.nextLine());

		System.out.println("Introduzca sus apellidos.");

			aux.setApellidos(entrada.nextLine());

		System.out.println("Introduzca su DNI.");
		
		String dni = entrada.nextLine();
		Alumno aBuscar = new Alumno(dni);
		int posicion = alumno.indexOf(aBuscar);
		
		if (posicion >= 0) {
			throw new Exception ("Ya existe un alumno con el DNI introducido");
		}else {
			aux.setDni(dni);
		}
			
		System.out.println("Introduzca su teléfono.");

			aux.setTelefono(entrada.nextLine());

		System.out.println("Introduzca su e-mail.");

			aux.setEmail(entrada.nextLine());
			
		

		alumno.add(aux);

	}

	// Metodo2 darBaja (Hecho por Francisco Cervilla)

	public static void darBaja(ArrayList<Alumno> alumno) {

		Scanner entrada = new Scanner(System.in);

		int c = comprobar(alumno);
		
			try {

				alumno.remove(c);

			} catch (Exception ex) {

				System.out.println("Error. El alumno introducido no existe.");
			}


	}

	// Metodo3 listar (Hecho por Pablo Rodriguez-Contreras)

	public static void listar(ArrayList<Alumno> alumno) throws Exception {

		
		
		if (alumno.size() == 0) {
			throw new Exception("La lista de alumnos esta vacia"); // Si la lista está vacia lanza una excepcion
		}

		for (int i = 0; i < alumno.size(); i++)  {// Recorremos el ArrayList<Alumno> y obtenemos los datos
			
			int numero = i+1;
			
			System.out.println("Numero: "+numero);
			
			System.out.println("DNI: " + alumno.get(i).getDni());
			
			System.out.println("Nombre: " + alumno.get(i).getNombre());
			
			System.out.println("Apellidos: " + alumno.get(i).getApellidos());
			
			System.out.println("Telefono: " + alumno.get(i).getTelefono());
			
			System.out.println("Email: " + alumno.get(i).getEmail());
			
			System.out.println("------------------");
		}
		
		System.out.println("------------------");
	}

	// Metodo4 modificarAlumnos (Hecho por Pablo Rodriguez-Contreras)

	public static void modificarAlumnos(ArrayList<Alumno> alumno) throws Exception {
		
		Scanner entrada = new Scanner(System.in);
		
		int m = 0;
		int c = 0;
		c = comprobar(alumno);
		
		if (c == -1) {	//Comprobamos que el alumno introducido existe y mas tarde obtenemos los datos
			throw new Exception ("El alumno introducido no existe");
		}
		
		do {

			System.out.println("¿Que desea modificar?\n" + "1. DNI\n" + "2. Nombre\n" + "3. Apellidos\n" + "4. Telefono\n"
					+ "5. Email\n"+ "6. Salir\n");

			m = entrada.nextInt();

			switch (m) {
			case 1:
				System.out.println("Introduzca el nuevo DNI");
				String dni = entrada.next();
				Alumno aBuscar = new Alumno(dni);
				int posicion = alumno.indexOf(aBuscar);
				
				if (posicion >= 0) {
					throw new Exception ("Ya existe un alumno con el DNI introducido");
				}else {
					alumno.get(c).setDni(dni);
				}

				break;
			case 2:
				System.out.println("Introduzca el nuevo nombre");
				alumno.get(c).setNombre(entrada.next());
				break;
			case 3:
				System.out.println("Introduzca los nuevos apellidos");
				alumno.get(c).setApellidos(entrada.next());
				break;
			case 4:
				System.out.println("Introduzca el nuevo telefono");
				alumno.get(c).setTelefono(entrada.next());
				break;
			case 5:
				System.out.println("Introduzca el nuevo email");
				alumno.get(c).setEmail(entrada.next());
				break;
			case 6:
				System.out.println("Los datos del alumno han sido modificados exitosamente.");
				break;
			default:
				System.out.println("La opcion introducida es erronea");
				break;
			}
		} while (m != 6);

	}
	
	// Método 5: matricularAlumno (Hecho por David Ramírez, revisado y corregido con ayuda de Pablo Rodriguez-Contreras y Francisco Cervilla)
		public static void matricularAlumno (ArrayList<Alumno>alumno) throws Exception {
			Scanner entrada = new Scanner(System.in);
		 	//Comprobacion de la existencia del alumno
			int c = 0;	
			c = comprobar(alumno);	
			
			if (c == -1) {
				throw new Exception ("El alumno introducido no existe");
			}
			
			if (c>=0) {
					
				//Asignatura
				System.out.println("Introduce la asignatura");
				String asignatura1 = entrada.next();
							
				int posicion = comprobarMatricula(alumno,asignatura1,c);
					
					if (posicion >=0) {
						throw new Exception("El alumno ya se encuentra matriculado en esa asignatura");
					}else {
						Calificacion notas = new Calificacion(asignatura1);
						alumno.get(c).getNotas().add(notas);
					}
						
				}
		}
		
	// Método 6: bajaAsignatura (Hecho por David Ramírez, revisado y corregido con ayuda de Pablo Rodriguez-Contreras y Francisco Cervilla)
		
		public static void bajaAsignatura (ArrayList<Alumno>alumno) throws Exception {
			
			Scanner entrada = new Scanner(System.in);
			
			//Comprobacion de la existencia del alumno
				
				int c = 0;	
				
				c = comprobar(alumno);	
				
				if (c == -1) {
					throw new Exception ("El alumno introducido no existe");
				}
				
				if (c>=0) {
					
					// Asignatura
					
							System.out.println("Introduce la asignatura");
							String asignatura1 = entrada.next();
						
						int posicion = comprobarMatricula(alumno, asignatura1,c);
						
						if (posicion >= 0) {
							alumno.get(c).getNotas().remove(posicion);
						}else {
							throw new Exception ("El alumno no esta matriculado en la asignatura introducida");
						}
					}
			}
		

	// Método7 calificacionTrimestral(Hecho por Iván López Pérez).

	public static void calificacionTrimestral(ArrayList<Alumno> alumno) throws Exception {

		Scanner entrada = new Scanner(System.in);

		// Variables.

		boolean correcto;
		
		int seleccionar = Integer.MIN_VALUE;

		// Solicitamos el alumno sobre el que queremos introducir las notas del
		// trimestre.

		System.out.println("Introduzca el número del alumno sobre el que desea introducir su nota.");

		// Bucle para la excepción en caso de que no exista el alumno en dicha posicion.

		do {

			try {

				seleccionar = entrada.nextInt();
				seleccionar -= 1;
				
				alumno.get(seleccionar);

				correcto = true;

			} catch (InputMismatchException ex) {

				System.out.println("Error. Introduzca un número de alumno válido.");

				correcto = false;

			}catch(IndexOutOfBoundsException ex2) {
			
				System.out.println("Error. Introduzca un número de alumno válido.");

				correcto = false;
				
			}

		} while (correcto = false);

		// Añadimos los datos al ArrayList de calificaciones

			System.out.println("Diga la asignatura sobre la que quiere introducir la nota.");
			
			String asignatura1 = entrada.next();
			
			int posicion = comprobarMatricula(alumno,asignatura1,seleccionar);
				
			if (posicion >=0 ) {
				
			System.out.println("Diga la nota obtenida en dicha asignatura.");
				
			String nota = entrada.next();
			
			alumno.get(seleccionar).getNotas().get(posicion).setNota(nota);
			
			}else {
				
				throw new Exception("El alumno no esta matriculado en la asignatura introducida");
			
			}
			
		

		}

	// Método8 listarCalificaciones(Hecho por Iván López Pérez).// INTRODUCIR BUSQUEDA DE ALUMNO POR DNI(metodo comprobar)

	public static void listarCalificaciones(ArrayList<Alumno> alumno) {

		Scanner entrada = new Scanner(System.in);

		// Variables.

		int i;
		boolean correcto;
		int seleccionar = Integer.MIN_VALUE;

		// Solicitamos el alumno sobre el que queremos conocer las calificaciones.

		System.out.println("Introduzca la posición del alumno sobre el que desea conocer su nota.");

		// Bucle para la excepción en caso de que no exista el alumno en dicha posicion.

		do {

			try {

				seleccionar = entrada.nextInt();
				
				seleccionar -= 1;

				correcto = true;

			} catch (InputMismatchException ex) {

				System.out.println("Error. Introduzca una posición válida.");

				correcto = false;

			}

		} while (correcto = false);

		// Bucle para la excepción en caso de que la posición esté fuera de los límites.

		do {

			try {

				for (i = 0; i < alumno.size(); i++) {
					System.out.println("Nombre: " + alumno.get(i).getNombre());
					for (int j = 0; j< alumno.get(seleccionar).getNotas().size();j++) {
						
						System.out.println(". Asignatura: " + alumno.get(seleccionar).getNotas().get(j).getAsignatura()
						+ ". Nota: "+ alumno.get(seleccionar).getNotas().get(j).getNota());
					
					}
				}

			} catch (IndexOutOfBoundsException ex2) {

				System.out.println("Error. Introduzca una posición válida.");
			}

		} while (seleccionar < 0 || seleccionar > alumno.size());

	}
	
	
	// Metodo 9 Poner una falta dia completo ( Hecho por Francisco Cervilla y Pablo Rodriguez-Contreras)
	public static void ponerFaltaDia(ArrayList<Alumno> alumno) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		int c = comprobar(alumno);
		
		if (c == -1) {
			throw new Exception ("El alumno introducido no existe");
		}
		
		System.out.print("Introduzca el dia: ");
		int dia = entrada.nextInt();
		
		System.out.println("\n");
		
		System.out.print("Introduzca el mes: ");
		int mes = entrada.nextInt();
		
		System.out.println("\n");
		
		System.out.print("Introduzca el año: ");
		int anio = entrada.nextInt();
		
		Fecha dias = null;
		
		ArrayList<DiaClase> dias2 = new ArrayList<DiaClase>();
		
		try { // Comprueba que la fecha es correcta
				
		dias = new Fecha(dia,mes,anio);
				
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	
		DiaClase falta = new DiaClase(dias);
		
		int posicion = alumno.get(c).getFaltas().indexOf(falta);
		
		if (c >= 0) {
			
			if (posicion != -1) {
				alumno.get(c).getFaltas().get(posicion).getSesiones().faltaDiaEntero();
			}else {
				falta.getSesiones().faltaDiaEntero();
				alumno.get(c).getFaltas().add(falta);
				dias2.add(falta);
			}
		}
		
		
	
}
	
	// Metodo 10 ponerFaltaHora autor:Diego Maestra Martinez , Pablo Rodriguez-Contreras y Francisco Cervilla
	
		public static void faltaHora(ArrayList<Alumno> alumno)throws Exception{
			
			Scanner entrada= new Scanner(System.in);
			
			// Declaramos las variables
			
			int c = comprobar(alumno);
			
			if (c == -1) {
				
				throw new Exception ("El alumno introducido no existe");
			
			}
			
			System.out.print("Introduzca el dia: ");
			
			int dia = entrada.nextInt();
			
			System.out.println("\n");
			
			System.out.print("Introduzca el mes: ");
			
			int mes = entrada.nextInt();
			
			System.out.println("\n");
			
			System.out.print("Introduzca el año: ");
			
			int anio = entrada.nextInt();
			
			System.out.println("Introduzca la sesion en la que falta el alumno ");
			
			int sesion = entrada.nextInt();
			
			Fecha fecha = null;
				
			try { // Comprobar que la fecha es correcta
					
					fecha = new Fecha(dia,mes,anio);
					
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
					
					DiaClase falta = new DiaClase(fecha);
					
	
			// Ponemos la falta
			
			int posicion = alumno.get(c).getFaltas().indexOf(falta);
			
			if (c >= 0) {
							
				if (posicion != -1) {
					
					alumno.get(c).getFaltas().get(posicion).getSesiones().faltaHora(sesion);
					
				}else {
				
				falta.getSesiones().faltaHora(sesion);
				
				alumno.get(c).getFaltas().add(falta);
				
				}		
			}
		}

	

	
	//Metodo 11 pasarLista Autores: Francisco Cervilla y Pablo Rodriguez-Contreras
	
		public static void pasarLista(ArrayList<Alumno> alumno) throws Exception {
			
			Scanner entrada = new Scanner(System.in);
			
			if (alumno.size() == 0) {
				
				throw new Exception ("No tienes ningún alumno");
				
			}
			
			System.out.print("Introduzca el dia: ");
			int dia = entrada.nextInt();
			
			System.out.println("\n");
			
			System.out.print("Introduzca el mes: ");
			int mes = entrada.nextInt();
			
			System.out.println("\n");
			
			System.out.print("Introduzca el año: ");
			int anio = entrada.nextInt();
			
			Fecha dias = null;
			
			try { // Comprueba que la fecha es correcta
					
			dias = new Fecha(dia,mes,anio);
					
			}catch(Exception ex) {
				
				System.out.println(ex.getMessage());
			
			}
			
			for (int i = 0;i<alumno.size();i++) {
				
				DiaClase falta = new DiaClase(dias);
				
				System.out.println("El alumno: "+alumno.get(i).getApellidos()+", "
						+alumno.get(i).getNombre()+" ha faltado el dia introducido?");
				
				System.out.println("Introduzca 1 en caso afirmativo y cualquier otro numero en caso negativo");
				int opcion = entrada.nextInt();
				
				if (opcion == 1) {
					
					int posicion = alumno.get(i).getFaltas().indexOf(falta);
					System.out.println("Introduzca 1 si falto el dia completo y 2 si falto a una o varias sesiones");
					int opcion2 = entrada.nextInt();
					
					switch (opcion2) {
					
					case 1:
						
						if (posicion >= 0) {
							alumno.get(i).getFaltas().get(posicion).getSesiones().faltaDiaEntero();
						}else {
							falta.getSesiones().faltaDiaEntero();
							alumno.get(i).getFaltas().add(falta);
						}
						break;
					case 2:
						
						System.out.println("Introduzca la sesion en la que falto el alumno");
						int sesion = entrada.nextInt();
						if (posicion >= 0) {
							alumno.get(i).getFaltas().get(posicion).getSesiones().faltaHora(sesion);
						}else {
							falta.getSesiones().faltaHora(sesion);
							alumno.get(i).getFaltas().add(falta);
						}
						
						break;
						
					default:
						System.out.println("La opcion introducida no es valida");
						break;
							
					}
				}
			}
			
			
		}
	
	//Método: listarFaltas (Hecho por David Ramírez)
		public static void listarFaltas (ArrayList<Alumno>alumnos) throws Exception{
			
			Scanner entrada = new Scanner(System.in);
			
			//Variables
			
				int numeroAlumno;
				
			//Entradas
				//Número de Alumno
				
					System.out.println("Introduce el número del alumno cuyas faltas deseas listar");
					numeroAlumno= entrada.nextInt();
					numeroAlumno -= 1;
					
				//Proceso: se realiza una comprobación en el if por la cual si se cumple
					//la condición estipulada se manda uno de los mensajes de error, y en caso de que
					//no se cumpla ninguna de las condiciones se muestra un mensaje con los datos del
					//alumno indicando que se procede a mostrar la lista de sus faltas recorriendo el
					// ArrayList para mostrar las faltas contenidas en dicho ArrayList
					
					if (alumnos.size() == 0) {
						throw new IndexOutOfBoundsException ("No tienes ningún alumno");
					}
					
					if (numeroAlumno < 0 || numeroAlumno >= alumnos.size()) {
						throw new IndexOutOfBoundsException ("El alumno seleccionado no existe");
					}
					
					if (alumnos.get(numeroAlumno).getFaltas().isEmpty()) {
						throw new Exception ("El alumno introducido no tiene faltas");
					}
					
					System.out.println("El alumno: " + alumnos.get(numeroAlumno).getNombre() + alumnos.get(numeroAlumno).getApellidos() + ", con DNI: " + alumnos.get(numeroAlumno).getDni() + ", tiene las siguientes faltas:");
					
					for (int i = 0; i < alumnos.size(); i++) {
						
						for(int j = 0; j < alumnos.get(i).getFaltas().size(); j++) {
							alumnos.get(i).getFaltas().get(j).getSesiones().imprimeHorario();
						}
					}
		}

	/*-----------------------------------------------------------------------------------------------*/
		//Menú hecho por: Pablo Rodríguez-Contreras y Francisco Cervilla
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// CREAMOS EL ARRAY LIST

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		// VARIABLES PARA EL MENU
		
		int opcion = 0;

		boolean sal = false;

		boolean salir = true;
		
		boolean correcto = true;

		// MENU

		while (salir) {

			System.out.println("--------------------------------------\n" + "Introduzca una opción para el menú.\n"
					+ "1. Dar de alta alumnos.\n" + "2. Dar de baja alumnos.\n" + "3. Listar los alumnos\n"
					+ "4. Modificar alumnos.\n" + "5. Matricular alumnos.\n" + "6. Dar de baja de una asignatura.\n"
					+ "7. Introducir calificación trimestral.\n" + "8. Listar calificaciones de alumnos.\n"
					+ "9. Poner una falta (día completo).\n" + "10. Poner una falta (en una sesión).\n"
					+ "11. Pasar lista.\n" + "12. Listar faltas.\n" + "13. Salir.\n"
					+ "--------------------------------------\n");
			
			do {
				try {
					opcion = entrada.nextInt();
					correcto = false;
					}catch (InputMismatchException ex) {
						entrada.nextLine();
						opcion = 0;
						System.out.println("No se admite otro carácter que no sea un número entero.");
					}
				
			}while (correcto);
			
			
			switch (opcion) {
			
			case 1: // METODO darAlta
				
				sal = false;

				do {

					try {
						main.darAlta(alumnos);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}

					System.out.println("¿Desea repetir la opción?. En caso afirmativo introduzca cualquier numero"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 2: // METODO darBaja
				sal = false;
				do {

					main.darBaja(alumnos);

					System.out.println("¿Desea repetir la opción?. En caso afirmativo introduzca cualquier numero"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 3: // METODO listar
				try {
					main.listar(alumnos);
				} catch (Exception ex) {
					System.out.println("Error: " + ex.getMessage());
				}

				break;

			case 4: // METODO modificarAlumnos
					try {
						main.modificarAlumnos(alumnos);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}
				break;

			case 5: // METODO matricularAlumno

				sal = false;
				do {
					
					try {
						main.matricularAlumno(alumnos);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}

					System.out.println("¿Desea repetir la opción?. En caso afirmativo introduzca cualquier numero"
							+ ". En caso negativo introduzca 0");
					
					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 6: // METODO bajaAsignatura

				sal = false;
				do {
					try {
						main.bajaAsignatura(alumnos);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}

					System.out.println("¿Desea repetir la opción?. En caso afirmativo introduzca cualquier numero"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 7: // METODO calificacionTrimestral

				sal = false;
				do {
					try {
						main.calificacionTrimestral(alumnos);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}

					System.out.println("¿Desea repetir la opción?. En caso afirmativo introduzca cualquier numero"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 8: // METODO listarCalificaciones

				sal = false;
				do {
					main.listarCalificaciones(alumnos);

					System.out.println("¿Desea repetir la opción?. En caso afirmativo introduzca cualquier numero"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);
				break;

			case 9: // METODO ponerFaltaDia
							
				sal = false;
				do {
					
					try {
						main.ponerFaltaDia(alumnos);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}

					System.out.println("¿Desea repetir la opción?. En caso afirmativo introduzca cualquier numero"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 10: // METODO faltaHora

				sal = false;
				do {
					try {
						main.faltaHora(alumnos);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}

					System.out.println("¿Desea repetir la opción?. En caso afirmativo introduzca cualquier numero"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 11: // METODO pasarLista
				
				try {
					main.pasarLista(alumnos);
				} catch (Exception ex) {
					
					System.out.println("Error: "+ex.getMessage());
				}
				break;

			case 12: // METODO listarFaltas

				sal = false;
				do {
					try {
						main.listarFaltas(alumnos);
					} catch (Exception ex) {
						System.out.println("Error: "+ex.getMessage());
					}

					System.out.println("¿Desea repetir la opción?. En caso afirmativo introduzca cualquier numero"
							+ ". En caso negativo introduzca 0");

					int r = entrada.nextInt();

					if (r == 0)
						sal = true;
				} while (sal == false);

				break;

			case 13: // SALE DEL PROGRAMA
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
