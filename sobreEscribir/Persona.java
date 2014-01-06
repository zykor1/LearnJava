public class Persona{
	public String nombre;

	public Persona(){}

	public Persona(String nombre){
		this.nombre = nombre;
	}

	public void respira(){
		System.out.println("Yo respiro");
	}

	public void leer(){
		System.out.println("Yo leo a una velocidad normal");
	}
}