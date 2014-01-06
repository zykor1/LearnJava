public class MainE{
	public static void main(String[] args){
		System.out.println("Nombre \tCalificacion \tCount ");
		EstudianteE e1 = new EstudianteE("Juan", 10);
			System.out.println(e1.nombre + " \t" + e1.calificacion + " \t\t" + EstudianteE.getCount());

		EstudianteE e2 = new EstudianteE("Pedro");
			System.out.println(e2.nombre + " \t" + e2.calificacion + " \t\t" + EstudianteE.getCount());

		EstudianteE e3 = new EstudianteE();
			System.out.println(e3.nombre + " \t" + e3.calificacion + " \t\t" + EstudianteE.getCount());
	}
}