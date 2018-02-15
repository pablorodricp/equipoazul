//Autor: Francisco Cervilla Sánchez
package equipoazul;
import java.util.*;

//Clase

public class Alumno {
	
//Atributos

	private String dni;
	
	private String nombre;
	
	private String apellidos;
	
	private String telefono;
	
	private String email;
	

	
//Constructor(String dni)
	
	public Alumno(String dni) {
		
		this.dni = dni;
		
		
		
	}
	
//Constructor(String dni, String nombre, String apellidos)
	
	public Alumno(String dni, String nombre, String apellidos) {
		
		this.dni = dni;

		this.nombre = nombre;
		
		this.apellidos = apellidos;
		
		
	}
	
//Getters
	
	public String getDni() {
		
		return dni;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public String getApellidos() {
		
		return apellidos;
		
	}
	
	public String getTelefono() {
		
		return telefono;
		
	}
	
	public String getEmail() {
		
		return email;
		
	}
	
	
//Setters
	
	public void setDni(String dni) {
		
		this.dni = dni;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setApellidos(String apellidos) {
		
		this.apellidos = apellidos;
		
	}
	
	public void setTelefono(String telefono) {
		
		this.telefono = telefono;
		
	}
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	
//Metodo equals
	
	public boolean equals(Object object) {
		
		boolean igual = false;

		if (object instanceof Alumno) {
			
			Alumno alumno = (Alumno) object;
			
			if (alumno.getDni().equalsIgnoreCase(this.getDni()))
			
				igual = true;
		
		}
		
		return igual;
	
	}

}