//Autor: David Ram�rez Bustos
public class DiaClase {
		//Atributos
			private Fecha dia;
			private Horario sesiones;
		//M�todos:
			//Constructor por par�metros
				public DiaClase (Fecha dia) {
					//Inicializaci�n del atributo
						this.dia = dia;
					//Creaci�n de la instancia de horario
						Horario objeto = new Horario ();
						//Inicializaci�n del atributo
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
			// Sobrecarga del m�todo equals de la clase Object
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
