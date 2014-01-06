import java.util.InputMismatchException;

public class Main{
	
	public static void main(String[]args)
	{
		Estudiante est = new Estudiante("Jose");
		Profesor prof = new Profesor("Pedro");
		Persona p = new Estudiante("Juan");

		System.out.println("Persona: " + p.nombre);
		p.respira();
		p.leer();
		System.out.println("No puedo estudiar no soy estudiante");

		System.out.println();
		System.out.println();

		Estudiante auxEst = (Estudiante) p;
		System.out.println("Persona a estudiante: " + auxEst.nombre);
		auxEst.respira();
		auxEst.leer();
		auxEst.estudia();

		System.out.println();
		System.out.println();

		System.out.println("Estudiante: " + est.nombre);
		est.respira();
		est.estudia();
		est.leer();

		System.out.println();
		System.out.println();

		System.out.println("Profesor: " + prof.nombre);
		prof.respira();
		prof.califica();
		prof.leer();

	}
}