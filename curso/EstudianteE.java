public class EstudianteE{
	public  static int count;
	public String nombre;
	public int calificacion;

	public EstudianteE(){
		this("---", -1);
	}

	public EstudianteE(String nombre){
		this(nombre, -1);
	}

	public EstudianteE(String nombre, int calificacion){
		this.nombre = nombre;
		this.calificacion = calificacion;
		count++;
	}


	
	public static int getCount(){
		return count;
	}

	public void estudia(){
		System.out.println(nombre + " estudio");
	}
}