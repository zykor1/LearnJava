public class Estudiante{
	public int count;
	public String nombre;
	public int edad;

	public Estudiante(){
		count++;
	}
	
	public void estudia(){
		System.out.println(nombre + " estudio");
	}
}