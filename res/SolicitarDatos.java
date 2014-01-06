import java.util.Scanner;

public class SolicitarDatos{
	Scanner entrada;
	ManejaRegistro manejaRegistro;
	Menu menu;

	public SolicitarDatos()
	{
		entrada = new Scanner(System.in);
		manejaRegistro = new ManejaRegistro();
		menu = new Menu();
	}


	// Si tipo es 1 entonces es adulto si es 2 es niño
	public void solicitar( int tipo){
		this.datosPersonales(tipo);
		if (tipo ==1)
			menu.mostrarMenu(Menu.menuAdulto(), tipo);
		else
			menu.mostrarMenu(Menu.menuNino(), tipo);
	}

	public void datosPersonales(int tipo){
		System.out.println("Vamos a requerir algunos datos personales");
		System.out.println("Escriba su nombre");
			String nombre = entrada.nextLine();
			String auxEdad;
		do{
			System.out.println("Escriba su edad");
			auxEdad = entrada.nextLine();
		}while (!Main.isNumeric(auxEdad));

		if (tipo ==1){
			this.datosAdulto(nombre, Integer.parseInt(auxEdad));
		}else{
			this.datosNino(nombre, Integer.parseInt(auxEdad));
		}

	}

	public void datosAdulto(String nombre, int edad){
			Adulto adulto = new Adulto();
			adulto.setNombre(nombre);
			adulto.setEdad(edad);

			System.out.println("Escriba su profesion");
				adulto.setProfesion(entrada.nextLine());

			System.out.println("Escriba su pasatiempo");
				adulto.setPasatiempo(entrada.nextLine());
			guardaDatosAdulto(adulto);
	}


	public void guardaDatosAdulto(Adulto adulto){
		String datos = "Adulto - Nombre: " + adulto.getNombre() + " - Edad: " + adulto.getEdad() + " - Profesion: " +
		 adulto.getProfesion() + " - Pasatiempo: " + adulto.getPasatiempo() + "\n";
		manejaRegistro.guardarEnArchivo(datos);
	}



	public void datosNino(String nombre, int edad){
			Nino nino = new Nino();
			nino.setNombre(nombre);
			nino.setEdad(edad);
			System.out.println("Cual es tu heroe favorito?");
				nino.setSuperH(entrada.nextLine());

			System.out.println("Cuales son tus caricaturas favoritas?");
				nino.setCaricaturas(entrada.nextLine());
			guardaDatosNino(nino);	
	}


	public void guardaDatosNino(Nino nino){
		String datos = "Niño - Nombre: " + nino.getNombre() + " - Edad: " + nino.getEdad() + " - SuperHeroe: " +
		 nino.getSuperH() + " - Caricaturas: " + nino.getCaricaturas() + "\n";
		manejaRegistro.guardarEnArchivo(datos);
	}


}