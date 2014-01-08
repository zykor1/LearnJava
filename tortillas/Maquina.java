interface Maquina{
	public void prepararTortilla();
	private boolean verficarIngredientes() throws IngredienteNotFound;
	private void actualizarIngredientes();
}