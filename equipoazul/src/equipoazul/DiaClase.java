//Autor: David Ramírez Bustos
public class DiaClase {
		//Atributos
			private Fecha dia;
			private Horario sesiones;
		//Métodos:
			//Constructor por parámetros
				public DiaClase (Fecha dia) {
					//Inicialización del atributo
						this.dia = dia;
					//Creación de la instancia de horario
						Horario objeto = new Horario ();
						//Inicialización del atributo
							this.sesiones = objeto;
				}
			//SetDia()
				public void setDia(Fecha dia) {
					this.dia = dia;
				}
			//Getters
				public Fecha getDia() {
					return dia;
				}
				public Horario getSesiones () {
					return sesiones;
				}
			// Sobrecarga del método equals de la clase Object
				public boolean equals(Object object){
					//Variables
						boolean igual = false;
					//Proceso
						if(object instanceof DiaClase){
							DiaClase diaClase = (DiaClase) object;
							if(diaClase.getDia().equals(this.getDia()))
								igual = true;
						}
						return igual;
				}
}
