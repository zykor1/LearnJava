public class Average8{

	public static void main(String[]args){
		try{
			printAverage(100, 0);
					
		}catch(IntegerDivisionByZero idbze){
			idbze.printStackTrace();
			System.out.println("Exception handled in " + "main()");
		}finally{
			System.out.println("Finally done in main()");
		}

		System.out.println("Exit main().");
	}

	public static void printAverage(int totalSum, int totalNumber)
	throws IntegerDivisionByZero{
		int average = computeAverage(totalSum, totalNumber);
		System.out.println("Average = "+ totalSum + " / " + totalNumber +
			" = " + average);
		System.out.println("Exit printAverage().");
	}

	public static int computeAverage(int sum, int number)
	throws IntegerDivisionByZero{
		System.out.println("Computing average.");
		if (number == 0)
			throw new IntegerDivisionByZero("Integer division by zero");
		return sum / number;
	}
}

class IntegerDivisionByZero extends Exception{
	IntegerDivisionByZero(String str){
		super(str);
	}
}