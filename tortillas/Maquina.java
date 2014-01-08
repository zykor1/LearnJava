
interface Maquina{
	public void prepararTortilla(int cantidad);
	boolean verficarIngredientes() throws IngredienteNotFound;
	void actualizarIngredientes();
}