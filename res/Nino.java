public class Nino extends Cliente{
	private String superH;
	private String caricaturas;

	public Nino(){
		
	}

	public Nino(String nombre, int edad, String superH, String caricaturas){
		super(nombre, edad);
		this.superH = superH;
		this.caricaturas = caricaturas;
	}

	public void setSuperH(String superH){
		this.superH = superH;
	}

	public String getSuperH(){
		return superH;
	}

	public void setCaricaturas(String caricaturas){
		this.caricaturas = caricaturas;
	}

	public String getCaricaturas(){
		return caricaturas;
	}
}