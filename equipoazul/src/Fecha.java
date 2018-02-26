
//autor:diego maestra.
public class Fecha {
	private int dia, mes, anio;
	//excepcion para fecha incorrecta
	public static void fechaincorrecta(int diaN, int mesN, int anioN)throws Exception   {
		
	}

	// constructor con parametros
	public Fecha(int dia, int mes, int anio)throws Exception {
		
		//excepciones throw
		//error si pones año menor que 2015
		if(anio<= 2015)
			throw new Exception("Error:el año introducido  tiene que ser mayor a 2015");
		//error si pones un mes mayor que 12 o menor que 1
		if(anio>=2015&&(mes>=1||mes<=12))
			throw new Exception("Error:el mes introducido no es valido, debe introducir desde el mes 1 al 12");
		//error si el dia introducido es mayor que 30 o menor que 1 en los meses de 30 dias
		if(anio>=2015&&(mes==4||mes==6||mes==9||mes==11)&&(dia<=30||dia>=1))
			throw new Exception("Error:introduzca desde el dia 1 al 30 en meses de 30 dias");
		//error si el dia introducido no esta entre el dia 1 y el 31 en meses de 31 dias
		if(anio>=2015&&(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&(dia<=31||dia>=1))
			throw new Exception("Error:introduzca desde el dia 1 al 31 en meses de 31 dias ");
		//error si el dia introducido no esta entre el dia 1 y 28 de febrero
		if(anio>=2015&&(mes==2)&&(dia<28||dia>1))
			throw new Exception("Error: introduzca desde el dia 1 al 28 en el mes de febrero");
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	

	}

	// Getters
	public int getDia() {
		return dia;

	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	// metodo que muestra en pantalla la fecha con el siguiente formato
	// dia/mes/año.
	public void imprimeFecha() {
		System.out.println("Fecha:" + dia + "/" + (mes) + "/" + anio);

	}

	// sobrecarga el método equals de la clase Object.
	public boolean equals(Object object) {
		boolean igual = false;
		if (object instanceof Fecha) {
			Fecha fecha = (Fecha) object;
			if (fecha.getDia() == this.getDia() && fecha.getMes() == this.getMes() && fecha.getAnio() == this.getAnio())
				igual = true;
		}
		return igual;
	}
}
