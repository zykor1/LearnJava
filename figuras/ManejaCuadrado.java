
import java.util.Scanner;

public class ManejaCuadrado {
	Cuadrado cuadrado;
	ManejaArchivo archivo;
	
	public ManejaCuadrado(){
		archivo = new ManejaArchivo();
	}
	
	public void solicitaLado(){
		Scanner entrada = new Scanner(System.in);
		String lado;
		do{
			System.out.println("Escribe tamaño del lado");
			lado = entrada.next();
		}while (!Figuras.isNumeric(lado));
		mostrarGuardar(Integer.parseInt(lado));
		entrada.close();
		
	}
	
	public void mostrarGuardar(int lado){
		cuadrado = new Cuadrado(lado);
		String auxCuadrado = cuadrado.mostrar();
		System.out.println(auxCuadrado);
		archivo.guardarEnArchivo(auxCuadrado);
		mostrarOperacion();
	}
	
	public void mostrarOperacion(){
		Scanner entrada = new Scanner(System.in);
		String op;
		do{
			System.out.println("Operaciones con el cuadrado");
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
			String auxGira = cuadrado.gira();
			System.out.println(auxGira);
			archivo.guardarEnArchivo(auxGira);
	}

	public void area(){
			double area = cuadrado.area();
			System.out.println(area);
			archivo.guardarEnArchivo(String.valueOf(area));
	}

	public void mostrarMover(){
			int[] auxMover = this.mover();
			String auxMover1 = cuadrado.mover(auxMover[0], auxMover[1]);
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
