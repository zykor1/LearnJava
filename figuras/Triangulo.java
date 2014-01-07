

class Triangulo{
	public int base;
	public int altura;

	public Triangulo (int base, int altura){
		this.base = base;
		this.altura = altura;
		this.dibuja1();
	}


	
	public void dibuja1() {
		String espacio = "  "; 
		String asterisco = "X "; 
		for (int i= 1; i<=5; i++){ 
			for (int espacios = 5 - i; espacios >0; espacios--) 
				System.out.print(espacio); 
			for (int lineas = 1; lineas < 2 * i; lineas++) 
				System.out.print(asterisco); 
			System.out.println(""); 
		} 
		for (int i= 4; i>=1; i--){ 
			for (int espacios = 5 - i; espacios >0; espacios--) 
				System.out.print(espacio); 
			for (int lineas = 1; lineas < 2 * i; lineas++) 
				System.out.print(asterisco); 
			System.out.println(""); 
		}
	}

	public void dibuja(){
		for(int i = 0; i < altura; i++){
			for(int j = 0; j < base ; j++){
				if (i == 0)
					System.out.print("X ");
				else if (i == altura -1)
					System.out.print("X ");
				else if (j == 0)
					System.out.print("X ");
				else if (j == base -1)
					System.out.print("X ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}