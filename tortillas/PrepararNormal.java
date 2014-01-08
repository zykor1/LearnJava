class PrepararNormal implements TortillaNormal, Maquina{
	
	Ingredientes ingredientes;
	int[] ingredientesLeidos;

	public PrepararNormal(){
		ingredientes = new Ingredientes();
		ingredientesLeidos = ingredientes.leerIngredientes();
	}


	public PrepararNormal(int cantidad){
		ingredientes = new Ingredientes();
		ingredientesLeidos = ingredientes.leerIngredientes();
		this.prepararTortilla(cantidad)
	}	

	public void prepararTortilla(int cantidad){
		try{
			for(int i = 0; i < cantidad; i++){
				this.verficarIngredientes();
				this.actualizarIngredientes();
				System.out.println("Tortilla " + i + " creada")
			}
		}catch(IngredienteNotFound inf){
			System.out.println("No hay suficientes ingredientes");
		}
	}

	private boolean verficarIngredientes() throws IngredienteNotFound{
		if(ingredientesLeidos[0] >= MASA)
			throw new IngredienteNotFound("No hay suficiente masa");
		if(ingredientesLeidos[1] >= AGUA)
			throw new IngredienteNotFound("No hay suficiente agua");
		if(ingredientesLeidos[2] >= SAL)
			throw new IngredienteNotFound("No hay suficiente sal");
	}

	private void actualizarIngredientes(){
		ingredientesLeidos[0] = ingredientesLeidos[0] - MASA;
		ingredientesLeidos[1] = ingredientesLeidos[1] - AGUA;
		ingredientesLeidos[2] = ingredientesLeidos[2] - SAL;
		ingredientes.guardarEnArchivo(ingredientesLeidos);
	}

}