
import java.util.Scanner;

public class ManejaRectangulo {
	Rectangulo rectangulo;
	ManejaArchivo archivo;
	
	public ManejaRectangulo(){
		archivo = new ManejaArchivo();
	}
	
	public void solicitaDatos(){
		Scanner entrada = new Scanner(System.in);
		String base;
		String altura;
		do{
			System.out.println("Escribe la base");
			base = entrada.next();
		}while (!Figuras.isNumeric(base));
		do{
			System.out.println("Escribe la altura");
			altura = entrada.next();
		}while (!Figuras.isNumeric(altura));
		mostrarGuardar(Integer.parseInt(base), Integer.parseInt(altura));
		entrada.close();
		
	}
	
	public void mostrarGuardar(int base, int altura){
		rectangulo = new Rectangulo(base, altura);
		String auxRectangulo = rectangulo.mostrar();
		System.out.println(auxRectangulo);
		archivo.guardarEnArchivo(auxRectangulo);
		mostrarOperacion();
	}
	
	public void mostrarOperacion(){
		Scanner entrada = new Scanner(System.in);
		String op;
		do{
			System.out.println("Operaciones con el rectangulo");
			System.out.println("1.- Girar\n2.- Mover\n3.- Area\n4.- Todos");
			op = entrada.next();
		}while (!Figuras.isNumeric(op));
		if (Integer.parseInt(op) == 1){
			this.gira();
		}
		if (Integer.parseInt(op) == 2){
			this.mostrarMover();
		}
		if (Integer.parseInt(op) == 3){
			this.area();
		}
		if (Integer.parseInt(op) == 4){
			this.gira();
			this.mostrarMover();
			this.area();
		}
	
		
	}

	public void gira(){
			String auxGira = rectangulo.gira();
			System.out.println(auxGira);
			archivo.guardarEnArchivo(auxGira);
	}

	public void area(){
			double area = rectangulo.area();
			System.out.println(area);
			archivo.guardarEnArchivo(String.valueOf(area));
	}

	public void mostrarMover(){
			int[] auxMover = this.mover();
			String auxMover1 = rectangulo.mover(auxMover[0], auxMover[1]);
			System.out.println(auxMover1);
			archivo.guardarEnArchivo(auxMover1);
	}
	
	public int[] mover(){
		Scanner entrada = new Scanner(System.in);
		String x;
		String y;
		do{
			System.out.println("Mover: escribe el tamaño de X ");
			x = entrada.next();
		}while (!Figuras.isNumeric(x));
		
		do{
			System.out.println("Mover: escribe el tamaño de Y ");
			y = entrada.next();
		}while (!Figuras.isNumeric(y));
		int [] aux = {Integer.parseInt(x), Integer.parseInt(y)};
		return aux;
	}

}
