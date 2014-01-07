
class Cuadrado extends FiguraBasica implements Operaciones, Dibujar{


	public Cuadrado (int lado){
		super(lado, lado);
	}


	public String mostrar(){
		String cuadrado = "";
		for(int i = 0; i < base; i++){
			for(int j = 0; j < base ; j++){
				if (i == 0)
					cuadrado = cuadrado + "X ";
				else if (i == base -1)
					cuadrado = cuadrado + "X ";
				else if (j == 0)
					cuadrado = cuadrado + "X ";
				else if (j == base -1)
					cuadrado = cuadrado + "X ";
				else
					cuadrado = cuadrado + "  ";
			}
			cuadrado = cuadrado + "\n";
		}
		return cuadrado;
	}


	public String gira() {
		String gira = "";
		String espacio = "  "; 
		String asterisco = "X "; 
		for (int i= 1; i<=base; i++){ 
			for (int espacios = base - i; espacios >0; espacios--) 
				gira = gira + espacio; 
			for (int lineas = 1; lineas < 2 * i; lineas++) {
				if (lineas == 1)
					gira = gira + "X";
				if(lineas == i * 2 - 1){
					if (i * 2 - 1 > 1)
						gira = gira + "X";
				}else
					gira = gira + "  ";
			}
			gira = gira + "\n"; 
		} 
		for (int i= base-1; i>=1; i--){ 
			for (int espacios = base - i; espacios >0; espacios--) 
				gira = gira + espacio;
			for (int lineas = 1; lineas < 2 * i; lineas++) {
				if (lineas == 1)
					gira = gira + "X";
				if(lineas == i * 2 - 1){
					if (i * 2 - 1 > 1)
						gira = gira + "X";
				}else
					gira = gira + "  ";
					
			}
			gira = gira + "\n"; 
		}
		
		return gira;
		
	}


	public double area() {
		return base * altura;
	}



	public String mover(int x, int y) {
		String cuadrado = "";
		for (int i = 0; i < y; i++)
			cuadrado = cuadrado + "\n";
		for (int i = 0; i < x; i++)
			cuadrado = cuadrado + " ";
		for(int i = 0; i < base; i++){
			for(int j = 0; j < base ; j++){
				if (i == 0)
					cuadrado = cuadrado + "X ";
				else if (i == base -1)
					cuadrado = cuadrado + "X ";
				else if (j == 0)
					cuadrado = cuadrado + "X ";
				else if (j == base -1)
					cuadrado = cuadrado + "X ";
				else
					cuadrado = cuadrado + "  ";
			}
			cuadrado = cuadrado + "\n";
			for (int k = 0; k < x; k++)
				cuadrado = cuadrado + " ";
		}
		return cuadrado;
	}
}