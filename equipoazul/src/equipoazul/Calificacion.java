// AUTOR : PABLO RODRÍGUEZ-CONTRERAS PUERTAS
package equipoazul;

public class Calificacion {
	
	// DECLARACION DE VARIABLES
	
	private String asignatura;
	private String nota;
	
	// CONSTRUCTOR POR DEFECTO
	
	public Calificacion() {
		this.asignatura = "";
	}
	
	// CONSTRUCTOR CON PARAMETROS
	
	public Calificacion(String asignatura,String nota) {
		this.asignatura = asignatura;
		this.nota = nota;
	}
	
	// GETTERS & SETTERS
	
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public String getAsignatura() {
		return asignatura;
	}
	
	public void setNota(String nota) {
		this.nota = nota;
	}
	
	public String getNota() {
		return nota;
	}
	
	// METODO EQUALS
	
	public boolean equals(Object object) {
		
		boolean igual = false;

		if(object instanceof Calificacion){
			Calificacion calificacion = (Calificacion) object;

		if(calificacion.getAsignatura().equalsIgnoreCase(this.getAsignatura()))
			igual = true;
	}
		
	return igual;
	}
	
}
