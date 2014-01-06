import java.util.Scanner;

public class Main{


	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}

	public static void main (String[] args){
		//boolean continuar = true;
		SolicitarDatos solicitarDatos = new SolicitarDatos();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elija 1 o 2: \n1.- Adulto \n2.- Niño ");
		String respuesta = entrada.nextLine();
		if (isNumeric(respuesta)){
			if (Integer.parseInt(respuesta) == 1)
				solicitarDatos.solicitar(1);
			else if (Integer.parseInt(respuesta) == 2)
				solicitarDatos.solicitar(2);
			else
				System.out.println("No es una opcion valida");
		}
		entrada.close();
	}

}