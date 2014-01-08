import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Ingredientes{
	private File archivo;
	private final String nombreArchivo = "ingredientes.txt";

	public int[] leerIngredientes(){
		try{
			int [] aux = new int[3];
			Scanner myScanner = new Scanner(new File(nombreArchivo);
			String line;
			cont = 0;
			while (myScanner.hasNextLine()) {
			    line = myScanner.nextLine();
			    aux[cont] = Integer.parseInt(line);
			    cont++;
			}
			return aux;
		}
		}catch(IOException ex){
			System.out.println("Error en la apertura del archivo "+ex.toString());
			return null;
		}
	}


	private String preparaDatos(int[] datos){
		String aux = "";
		for(int i = 0; i < datos.length(); i++){
			aux = aux + datos[i];
			aux = aux + "\n";
		}
		return aux;
	}

	public boolean guardarEnArchivo(int[] datos){
		try{
			archivo = new File(nombreArchivo);
			FileWriter fw = new FileWriter(archivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append(preparaDatos(datos));
			bw.flush();
			bw.newLine();
			bw.close();
		}catch(IOException e){
			System.out.println("No se pudo guardar la informacion en el archivo");
		}
		return false;
	}


}