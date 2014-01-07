public class Average3{

	public static void main(String[]args){
		try{
			printAverage(100, 0);
		} catch (ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("Exception handled in " + "Main().");
		}
		System.out.println("Exit main().");
	}

	public static void printAverage(int totalSum, int totalNumber){
		try{
		int average = computeAverage(totalSum, totalNumber);
		System.out.println("Average = "+ totalSum + " / " + totalNumber +
			" = " + average);
		
		}catch(IllegalArgumentException iae){
			iae.printStackTrace();
			System.out.println("Exception handled in " + "printAverage()");
		}
		System.out.println("Exit printAverage().");
	}

	public static int computeAverage(int sum, int number){
		System.out.println("Computing average.");
		return sum / number;
	}
}