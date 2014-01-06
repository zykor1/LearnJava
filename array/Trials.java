public class Trials {

	public static void main(String[]args){
		double[] storeMinimum = new double[5];
		double[] trialArray = new double[15];
		for(int i = 0; i < storeMinimum.length; i++){
			randomize(trialArray);
			storeMinimum[i] = findMinimum(trialArray);
		}

		for (int i = 0; i < storeMinimum.length; i++){
			System.out.printf("%4f%n", storeMinimum[i]);
		}
	}

	public static void randomize(double[] valArray){
		for(int i = 0; i < valArray.length; i++){
			valArray[i] = Math.random() * 100.0;
		}
	}

	public static double findMinimum(double[] valArray){
		double minValue = valArray[0];
		for(int i = 0; i < valArray.length; i++){
			minValue = Math.min(minValue, valArray[i]);
		}
		return minValue;
	}

}

