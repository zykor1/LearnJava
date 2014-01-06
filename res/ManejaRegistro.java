import java.io.*;
public class ManejaRegistro{
	// Alias maneja archivo
	private final String nombreArchivo = "Clientes.txt";
	private File archivo;

	public ManejaRegistro(){
		
	}	

	public boolean guardarEnArchivo(String datos){
		try{
			archivo = new File(nombreArchivo);
			FileWriter fw = new FileWriter(archivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append(datos);
			bw.flush();
			bw.newLine();
			bw.close();
			return true;
		}catch(IOException e){
			System.out.println("No se pudo guardar la informacion en el archivo");
			return false;
		}
		return false;
	}

	

}