public class IntegerRepresentation{
	public static void main(String[] args){
		int positiveInt = +41;
		int negativeInt = -41;

		System.out.println("String represantation for decimal value: " + positiveInt);
		integerStringRepresentation(positiveInt);
		System.out.println("String representacion for decimal value: " + negativeInt);
		integerStringRepresentation(negativeInt);
	}

	public static void integerStringRepresentation(int i){

	
		System.out.println("	Binary:\t" + Integer.toBinaryString(i));
		System.out.println("	Octal:\t" + Integer.toOctalString(i));
		System.out.println("	Hex:\t" + Integer.toHexString(i));
		System.out.println("	Decimal:\t" + Integer.toString(i));

		System.out.println("	Using toString(int i, int base) method: ");
		System.out.println("	Base 2:\t" + Integer.toString(i, 2));
		System.out.println("	Base 8:\t" + Integer.toString(i, 8));
		System.out.println("	Base 16:\t" + Integer.toString(i, 16));
		System.out.println("	Base 10:\t" + Integer.toString(i, 10));


	}
}