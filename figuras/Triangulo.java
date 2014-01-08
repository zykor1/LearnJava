class Triangulo extends FiguraBasica implements Operaciones, Dibujar{


	public Triangulo (int base, int altura){
		super(base, altura);
	}


	public String mostrar(){
		String triangulo = "";
		String espacio = "  "; 
		String asterisco = "X "; 
		for (int i= 1; i<=altura; i++){ 
			for (int espacios = altura - i; espacios >0; espacios--) 
				triangulo = triangulo + espacio; 
			for (int lineas = 1; lineas < 2 * i; lineas++) {
				if (lineas == 1)
					triangulo = triangulo + "X";
				if(lineas == i * 2 - 1){
					if (i * 2 - 1 > 1)
						triangulo = triangulo + "X";
				}
				if (i == altura && lineas < base -1)
						triangulo = triangulo + " X";
				else
					triangulo = triangulo + "  ";
			}
			triangulo = triangulo + "\n"; 
		} 
		return triangulo;
	}


	public String gira() {
		String gira = "";
		String espacio = "  "; 
		String asterisco = "X";
		for (int i= altura; i>=1; i--){ 
			for (int espacios = altura - i; espacios >0; espacios--) 
				gira = gira + espacio;
			for (int lineas = 1; lineas < 2 * i; lineas++) {
				if (lineas == 1)
					gira = gira + asterisco;
				if(lineas == i * 2 - 1){
					if (i * 2 - 1 > 1)
						gira = gira + asterisco;
				}
				if (i == altura && lineas < base -1)
						gira = gira + " X";
				else
					gira = gira + "  ";
					
			}
			gira = gira + "\n"; 
		}
		
		return gira;
		
	}


	public double area() {
		return (base * altura)/2;
	}



	public String mover(int x, int y) {
		String triangulo = "";
		String espacio = "  "; 
		String asterisco = "X "; 
		for (int i = 0; i < y; i++)
			triangulo = triangulo + "\n";
		for (int i = 0; i < x; i++)
			triangulo = triangulo + " ";

		for (int i= 1; i<=altura; i++){ 
			for (int espacios = altura - i; espacios >0; espacios--) 
				triangulo = triangulo + espacio; 
			for (int lineas = 1; lineas < 2 * i; lineas++) {
				if (lineas == 1)
					triangulo = triangulo + "X";
				if(lineas == i * 2 - 1){
					if (i * 2 - 1 > 1)
						triangulo = triangulo + "X";
				}
				if (i == altura && lineas < base -1)
						triangulo = triangulo + " X";
				else
					triangulo = triangulo + "  ";
			}
			triangulo = triangulo + "\n";
			for (int k = 0; k < x; k++)
				triangulo = triangulo + " ";
		} 
		return triangulo;
	}
}