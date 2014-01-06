public class Estudiante extends Persona{
	
	public Estudiante(){} 

	public Estudiante(String nombre)
	{
		super(nombre);
	}

	public void estudia(){
		System.out.println("Yo estudio");
	}

	@Override
	public void leer(){
		System.out.println("Yo leo mas rapido por que soy estudiante");
	}
}