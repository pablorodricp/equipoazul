// Autor: Iv�n L�pez P�rez

// Clase Horario

public class Horario {

	// Atributos de la clase.

	private char sesiones[] = new char[6];

	// Constructor por defecto.

	public Horario() {
		sesiones[0] = ' ';
		sesiones[1] = ' ';
		sesiones[2] = ' ';
		sesiones[3] = ' ';
		sesiones[4] = ' ';
		sesiones[5] = ' ';
	}

	// Getters.

	public char[] getSesiones() {
		return sesiones;
	}

	// M�todo faltaDiaEntero.

	public char[] faltaDiaEntero() {
		for (int i = 0; i <= 5; i++) {
			sesiones[i] = 'F';
		}
		return sesiones;
	}

	// M�todo faltaHora.

	public char[] faltaHora(int sesion) {
		try {
		sesion -= 1;
		sesiones[sesion] = 'F';
		
		for (int i= 0 ; i<=5 ; i++) {
			if (sesiones[i] != 'F') {
				sesiones[i] = 'A';
			}
		}
		
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Error: Se ha introducido un valor fuera de rango "+ ex.getMessage());
		}
		return sesiones;
	}

	// M�todo imprimeHorario.

	public void imprimeHorario() {
		System.out.println(sesiones[0] + "/" + sesiones[1] + "/" + sesiones[2] + "/" + sesiones[3] + "/" + sesiones[4]
				+ "/" + sesiones[5]);
	}

}
