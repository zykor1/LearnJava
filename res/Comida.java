
public class Comida {
	private String nombre;
	private String descripcion;
	private String personalizacion;
	private int precio;
	
	public Comida(){}
	
	public Comida(String nombre, String descripcion, int precio){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public void setPersonalizacion(String personalizacion){
		this.personalizacion = personalizacion;
	}
	
	public String getPersonalizacion(){
		return personalizacion;
	}
	
	public void setPrecio(int precio){
		this.precio = precio;
	}
	
	public int getPrecio(){
		return precio;
	}
	
}
