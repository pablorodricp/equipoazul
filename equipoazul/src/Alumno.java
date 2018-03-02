
//Autor: Francisco Cervilla S�nchez

import java.util.*;

//Clase

public class Alumno {

	// Atributos

	private String dni;

	private String nombre;

	private String apellidos;

	private String telefono;

	private String email;

	private ArrayList<DiaClase> faltas;

	private ArrayList<Calificacion> notas;
	
	//Constructor
	
	public Alumno() {
		
		this.dni = "";
		
		this.nombre = "";
		
		this.apellidos = "";
		
		this.telefono = "";
		
		this.email = "";
		
		this.faltas = new ArrayList<DiaClase>();

		this.notas = new ArrayList<Calificacion>();
		
	}

	// Constructor(String dni)

	public Alumno(String dni) {

		this.dni = dni;

		this.faltas = new ArrayList<DiaClase>();

		this.notas = new ArrayList<Calificacion>();

	}

	// Constructor(String dni, String nombre, String apellidos)

	public Alumno(String dni, String nombre, String apellidos) {

		this.dni = dni;

		this.nombre = nombre;

		this.apellidos = apellidos;

		this.faltas = new ArrayList<DiaClase>();

		this.notas = new ArrayList<Calificacion>();

	}

	// Getters

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

	public ArrayList<DiaClase> getFaltas() {

		return faltas;

	}

	public ArrayList<Calificacion> getNotas() {

		return notas;

	}

	// Setters

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

	// Metodo equals

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
