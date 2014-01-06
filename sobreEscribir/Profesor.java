public class Profesor extends Persona{

	public Profesor(){}

	public Profesor(String nombre)
	{
		super(nombre);
	}

	public void califica(){
		System.out.println("Yo califico a los estudiantes");
	}

}