public class Average2{
	public static void main(String[]args){
		printAverage(100, 0);
		System.out.println("Exit main().");
	}
	public static void printAverage(int totalSum, int totalNumber){
		try{
		int average = computeAverage(totalSum, totalNumber);
		System.out.println("Average = "+ totalSum + " / " + totalNumber +
			" = " + average);
		
		}catch(ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("Error divicion entre 0");
		}
		System.out.println("Exit printAverage().");
	}

	public static int computeAverage(int sum, int number){
		System.out.println("Computing average.");
		return sum / number;
	}
}