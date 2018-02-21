import java.util.*;

public class main {
	
	/*-----------------------------------------------------------------------------------------------*/
	
	//METODOS ESTATICOS
	
	//Metodo darAlta (Hecho por Francisco Cervilla)
	
	public static void darAlta(ArrayList<Alumno> alumno) {
		
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
	
	//Metodo darBaja (Hecho por Francisco Cervilla)
	
	public static void darBaja(ArrayList<Alumno> alumno) {
		
		Scanner entrada = new Scanner (System.in);
		
		boolean correcto;
		
		int seleccionar = Integer.MIN_VALUE;
		
		System.out.println("Introduzca la posición del alumno que desea dar de baja.");
		
		//Bucle para la excepcion en caso de que no exista el alumno en dicha posicion
		
		do{
		
			try {
				
				seleccionar = entrada.nextInt();
				
				correcto = true;
			
			}catch(InputMismatchException ex) {
			
				System.out.println("Error. Introduzca una posición válida.");
				
				correcto = false;
			
			}
		
		}while(correcto = false);
		
		//Bucle para la excepcion en caso de que la posicion este fuera de los limites
		
		do {
		
			try{
			
				alumno.remove(seleccionar);
			
			}catch(IndexOutOfBoundsException ex2) {
			
				System.out.println("Error. Introduzca una posición válida.");
			}
		
		}while(seleccionar < 0 || seleccionar > alumno.size());
		
	}
	//Método: matricularAlumno (Hecho por David Ramírez)
		public static void matricularAlumno (ArrayList<Calificacion>matriculado, int numeroAlumno, String asignatura) throws Exception {
			Scanner entrada = new Scanner(System.in);
			//Entradas
				//Número de Alumno
					System.out.println("Introduce el número del alumno que deseas matricular");
					numeroAlumno= entrada.nextInt();
				//Asignatura	
					System.out.println("Introduce la asignatura");
					asignatura= entrada.nextLine();
			//Proceso: se realiza una comprobación en el if por la cual si se cumple la condición estipulada (alumno.get(numeroAlumno).getAsignatura() == asignatura) se manda el mensaje de error, y en caso de que no se cumpla al ArrayList matriculado se le añade la asignatura introducida, indicando asi que al alumno se le ha matriculado asignatura
				if (matriculado.get(numeroAlumno).getAsignatura() == asignatura) {
					throw new Exception ("Error: El alumno ya esta matriculado en esta asignatura");
				}
				matriculado.get(numeroAlumno).setAsignatura(asignatura);	
		}
	//Método: bajaAsignatura (Hecho por David Ramírez)
		public static void bajaAsignatura (ArrayList<Calificacion>matriculado, int numeroAlumno, String asignatura) throws Exception {
			Scanner entrada = new Scanner(System.in);
			//Entradas
				//Número de Alumno
					System.out.println("Introduce el número del alumno que deseas matricular");
					numeroAlumno= entrada.nextInt();
				//Asignatura	
					System.out.println("Introduce la asignatura");
					asignatura= entrada.nextLine();
			//Proceso: se realiza una comprobación en el if por la cual si se cumple la condición estipulada (alumno.get(numeroAlumno).getAsignatura() != asignatura) se manda el mensaje de error, y en caso de que no se cumpla al ArrayList matriculado se le cambia una asignatura introducida por un "", indicando asi que al alumno ya no esta matriculado en la asignatura
				if (matriculado.get(numeroAlumno).getAsignatura() != asignatura) {
					throw new Exception ("Error: El alumno no esta matriculado en esta asignatura");
				}
				matriculado.get(numeroAlumno).setAsignatura("");
		}

	
	
	
	/*-----------------------------------------------------------------------------------------------*/

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		//CREAMOS EL ARRAY LIST
		
		ArrayList<Alumno> alumnos = new ArrayList();
		ArrayList<Calificacion>matriculado = new ArrayList();
		
		//VARIABLES PARA EL MENU
		
		int opcion;
		
		boolean salir = true;
		
		//MENU
		
		while(salir) {
			
			System.out.println("--------------------------------------\n"
					+ "Introduzca una opción para el menú.\n"
					+ "1. Dar de alta alumnos.\n"
					+ "2. Dar de baja alumnos.\n"
					+ "3. Listar los alumnos\n"
					+ "4. Modificar alumnos.\n"
					+ "5. Matricular alumnos.\n"
					+ "6. Dar de baja de una asignatura.\n"
					+ "7. Introducir calificación trimestral.\n"
					+ "8. Listar calificaciones de alumnos.\n"
					+ "9. Poner una falta (día completo).\n"
					+ "10. Poner una falta (en una sesión).\n"
					+ "11. Pasar lista.\n"
					+ "12. Listar faltas.\n"
					+ "13. Salir.\n"
					+ "--------------------------------------\n");
			
			opcion = entrada.nextInt();
			
			switch(opcion) {
			
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
				
			case 5://Matricular alumnos (Hecho por: David Ramírez Bustos)
				//Variables
					int numeroAlumno = 0;
					String asignatura = "";
				//Proceso
					//Salida
						main.matricularAlumno(matriculado, numeroAlumno, asignatura);
				break;
				
			case 6://Dar de baja de una asignatura (Hecho por: David Ramírez Bustos)
				//Variables
					numeroAlumno = 0;
					asignatura = "";
				//Proceso
					//Salida
						main.bajaAsignatura(matriculado, numeroAlumno, asignatura);
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
