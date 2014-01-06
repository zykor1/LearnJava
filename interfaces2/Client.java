public class Client implements Constants{
	
	public static void main (String[] args){
		double radius = 1.5;
		System.out.printf("Area of circle is %.2f %s%n", PI_APPROXIMATION * radius * radius, AREA_UNITS);
		System.out.printf("Circumference of circle is  %.2f %s%n", 2.0 * Constants.PI_APPROXIMATION * radius, Constants.LENGTH_UNITS);

	}
}