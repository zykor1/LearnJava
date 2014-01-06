public class Main{
	public static void main(String[] args){
		Estudiante e1 = new Estudiante();
		e1.nombre = "Juan";
		e1.edad = 20;

		Estudiante e2 = new Estudiante();
		e2.nombre = "Pedro";
		e2.edad = 21;

		Estudiante e3 = new Estudiante();
		e3.nombre = "Luis";
		e3.edad = 20;
		
		System.out.println("e1: " + e1.nombre + " Edad: " + e1.edad + " Count: " + e1.count);
		System.out.println("e2: " + e2.nombre + " Edad: " + e2.edad + " Count: " + e2.count);
		System.out.println("e3: " + e3.nombre + " Edad: " + e3.edad + " Count: " + e3.count);
	}
}