import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
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
				
				break;
				
			case 2:
				
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
				
				break;
				
			default:
				
				System.out.println("Opción incorrecta, introduzca otra.");
				
				break;
				
			}
		}
	}

}
