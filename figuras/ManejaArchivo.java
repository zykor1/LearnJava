
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManejaArchivo{
	// Alias maneja archivo
	private final String nombreArchivo = "figuras.txt";
	private File archivo;

	public ManejaArchivo(){
		
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
		}catch(IOException e){
			System.out.println("No se pudo guardar la informacion en el archivo");
		}
		return false;
	}
}
