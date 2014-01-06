public class Adulto extends Cliente{
	private String pasatiempo;
	private String profesion;

	public Adulto(){}

	public Adulto(String nombre, int edad, String pasatiempo, String profesion){
		super(nombre, edad);
		this.pasatiempo = pasatiempo;
		this.profesion = profesion;
	}



	public void setPasatiempo(String pasatiempo){
		this.pasatiempo = pasatiempo;
	}

	public String getPasatiempo(){
		return pasatiempo;
	}

	public void setProfesion(String profesion){
		this.profesion = profesion;
	}

	public String getProfesion(){
		return profesion;
	}
}