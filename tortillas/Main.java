import java.util.Scanner;

public class Main(){

	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String tipoT;
		String cantidad;
		do{
			System.out.println("¿Que tortilla quieres preparar?");
			System.out.println("1.- Tortilla normal\n2.- Tortilla para taco");
			tipoT = entrada.next();
		}while (!isNumeric(tipoT));

		do{
			System.out.println("¿Que cantidad de tortillas deseas preparar?");
			cantidad = entrada.next();
		}while (!isNumeric(cantidad));
		
		if (Integer.parseInt(tipoT) == 1)
			PrepararNormal normal = new PrepararNormal(Integer.parseInt(cantidad));
		else
			PrepararTaco taco = new PrepararTaco(Integer.parseInt(cantidad));
		entrada.close();
	}
}