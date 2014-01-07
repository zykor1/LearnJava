import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class WeightGroups {
	public static void main(String[] args) {

		Map<Integer, Integer> groupFreqMap = new HashMap<Integer, Integer>();

		for (String argument : args) { 
			double weight = Double.parseDouble(argument);
			int weightGroup = (int) Math.round(weight/5)*5; 
			Integer frequency = groupFreqMap.get(weightGroup); 
			frequency = (frequency == null) ? 1 : frequency+1;
			groupFreqMap.put(weightGroup, frequency); 
		}


		SortedSet<Integer> groupSet	= new TreeSet<Integer>(groupFreqMap.keySet()); 

		for (int group : groupSet) { 
			int frequency = groupFreqMap.get(group); 
			char[] bar = new char[frequency];
			Arrays.fill(bar, '*'); 
			System.out.println(group + ":\t" + new String(bar));
		}

	}
}