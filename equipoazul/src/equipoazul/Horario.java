// Autor: Iv�n L�pez P�rez

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

	// M�todo faltaDiaEntero.

	public char[] faltaDiaEntero() {
		for (int i = 1; i <= 6; i++) {
			sesiones[i] = 'F';
		}
		return sesiones;
	}

	// M�todo faltaHora.

	public char[] faltaHora(int sesion) {
		for (int i = 1; i <= 6; i++) {
			if (i == sesion) {
				sesiones[sesion] = 'F';
			}
		}
		return sesiones;
	}

	// M�todo imprimeHorario.

	public void imprimeHorario() {
		System.out.println(sesiones[1] + "/" + sesiones[2] + "/" + sesiones[3] + "/" + sesiones[4] + "/" + sesiones[5]
				+ "/" + sesiones[6]);
	}

}
