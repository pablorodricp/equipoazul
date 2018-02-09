// Autor: Iván López Pérez

package equipoazul;

// Clase Horario

public class Horario {

	// Atributos de la clase.

	private char[] sesiones;

	// Constructor por defecto.

	public Horario() {
		this.sesiones = '';
	}

	// Getters.

	public char[] sesiones() {
		return sesiones;
	}

	// Método faltaDiaEntero.

	public char[] faltaDiaEntero() {
		for (int i = 1; i <= 6; i++) {
			sesiones[i] = 'F';
		}
		return sesiones;
	}

	// Método faltaHora.

	public char[] faltaHora(int sesion) {
		for (int i = 1; i <= 6; i++) {
			if (i == sesion) {
				sesiones[sesion] = 'F';
			}
		}
		return sesiones;
	}

	// Método imprimeHorario.

	public void imprimeHorario() {
		System.out.println(sesiones[1] + "/" + sesiones[2] + "/" + sesiones[3] + "/" + sesiones[4] + "/" + sesiones[5]
				+ "/" + sesiones[6]);
	}

}
