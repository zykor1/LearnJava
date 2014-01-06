public class Factory{
	public static void main(String[]args){
		TubeLight cellarLight = new TubeLight();
		Light nightLight;
		nightLight = cellarLight;
		System.out.println("KWH price: " + nightLight.kwhPrice());
	}
}