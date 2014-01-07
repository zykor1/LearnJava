
class Rectangulo extends FiguraBasica implements Operaciones, Dibujar{

	public Rectangulo (int base, int altura){
		super(base, altura);
	}


	public String mostrar(){
		String rectangulo = "";
		for(int i = 0; i < altura; i++){
			for(int j = 0; j < base ; j++){
				if (i == 0)
					rectangulo = rectangulo + "X ";
				else if (i == altura -1)
					rectangulo = rectangulo + "X ";
				else if (j == 0)
					rectangulo = rectangulo + "X ";
				else if (j == base -1)
					rectangulo = rectangulo + "X ";
				else
					rectangulo = rectangulo + "  ";
			}
			rectangulo = rectangulo + "\n";
		}
		return rectangulo;
	}


	public String gira(){
		String rectangulo = "";
		for(int i = 0; i < base; i++){
			for(int j = 0; j < altura ; j++){
				if (i == 0)
					rectangulo = rectangulo + "X ";
				else if (i == base -1)
					rectangulo = rectangulo + "X ";
				else if (j == 0)
					rectangulo = rectangulo + "X ";
				else if (j == altura -1)
					rectangulo = rectangulo + "X ";
				else
					rectangulo = rectangulo + "  ";
			}
			rectangulo = rectangulo + "\n";
		}
		return rectangulo;
	}

	public double area() {
		return base * altura;
	}

		public String mover(int x, int y) {
		String rectangulo = "";
		for (int i = 0; i < y; i++)
			rectangulo = rectangulo + "\n";
		for (int i = 0; i < x; i++)
			rectangulo = rectangulo + " ";
		for(int i = 0; i < base; i++){
			for(int j = 0; j < altura ; j++){
				if (i == 0)
					rectangulo = rectangulo + "X ";
				else if (i == base -1)
					rectangulo = rectangulo + "X ";
				else if (j == 0)
					rectangulo = rectangulo + "X ";
				else if (j == altura -1)
					rectangulo = rectangulo + "X ";
				else
					rectangulo = rectangulo + "  ";
			}
			rectangulo = rectangulo + "\n";
			for (int k = 0; k < x; k++)
				rectangulo = rectangulo + " ";
		}
		return rectangulo;
	}

}
