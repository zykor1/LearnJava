
import java.util.Scanner;
public class Figuras {
	
	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		String opc;
		do{
			System.out.println("Elije una opcion");
			System.out.println("1.- Cuadrado \n2.- Rectangulo \n3.- Triangulo");
			opc = entrada.next();
		}while (!isNumeric(opc));
		
		if (Integer.parseInt(opc) == 1){
			ManejaCuadrado cuadrado = new ManejaCuadrado();
			cuadrado.solicitaLado();
		}else if(Integer.parseInt(opc) == 2)
		{
			ManejaRectangulo rectangulo = new ManejaRectangulo();
			rectangulo.solicitaDatos();
		}else if (Integer.parseInt(opc) == 3){
			ManejaTriangulo triangulo = new ManejaTriangulo();
			triangulo.solicitaDatos();
		}

		entrada.close();
	}
}