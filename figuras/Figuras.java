
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
		ManejaCuadrado cuadrado = new ManejaCuadrado();
		cuadrado.solicitaLado();

	}
}