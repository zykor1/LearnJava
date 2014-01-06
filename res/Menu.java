import java.util.Scanner;


public class Menu {
	public static String JUGUETE = "Max Steel";
	public static String POSTRE = "Flan";
	public Menu(){}
	
	public Menu(int tipo){
		if (tipo == 1)
			mostrarMenu(this.menuAdulto(), tipo);
		else
			mostrarMenu(this.menuNino(), tipo);
			
	}
	
	public void mostrarMenu(Comida[] menu, int tipo){
		System.out.println("Menu");
		for (int i = 0; i < menu.length ; i++){
			System.out.println((i + 1) + ".- " + menu[i].getNombre());
		}
		Scanner entrada = new Scanner(System.in);
		String opcion = entrada.nextLine();
		if (opcion.equals("1") || opcion.equals("2") || opcion.equals("3") ){
			Comida auxComida = menu[Integer.parseInt(opcion) - 1];
			System.out.println(auxComida.getDescripcion());
			auxComida.setPersonalizacion(entrada.nextLine());
			this.pagando(auxComida, tipo);
		}else
			System.out.println("Elige una opcion valida");
		entrada.close();
	}
	
	public void pagando(Comida comida, int tipo){
		if (tipo ==1){
			System.out.println("Su cobro es de: " + comida.getPrecio());
			System.out.println("Su postre sera: " + this.POSTRE);
		}else{
			System.out.println("Esta jugando con " + this.JUGUETE);
		}
		System.out.println("Esta comiendo: "+ comida.getNombre() + " y su personalizacion fue " +
		comida.getPersonalizacion());
	}
	
	public static Comida[] menuNino(){
		Comida[] comida = new Comida[3];
		comida[0] = new Comida("Hot-dog", "Tamaño (ejem: Pequeño, Mediano, Grande)", 40);
		comida[1] = new Comida("Pizza", "Combinacion (ejem: Italiana, Hawaiana, Mexicana)", 132);
		comida[2] = new Comida("Hamburgesa", "Tipo de carne (ejem: Res, Pollo)", 70);
		return comida;
	}
	
	
	public static Comida[] menuAdulto(){
		Comida[] comida = new Comida[3];
		comida[0] = new Comida("Milanesa", "Termino (ejem: Medio)", 60);
		comida[1] = new Comida("Pollo", "Pieza (ejem: Pierna, Pechuga, Muslo)", 60);
		comida[2] = new Comida("Arroz", "Color (ejem: Blanco, Rojo)", 40);
		return comida;
	}
	
}
