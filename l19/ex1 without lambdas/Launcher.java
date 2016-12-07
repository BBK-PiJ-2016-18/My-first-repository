import java.util.Arrays;

public class Launcher {
	public static void main(String[] args) {
		//Integer[] intArray = {1,55,12,14,32,22,99,3};
		String[] stringArray = {"string", "strong", "mong", "trump", "abc", "77", "1234567890"};
		System.out.println("The initial array: " + Arrays.asList(stringArray));
		
		StringComparatorByLength comparator = new StringComparatorByLength();
		Arrays.sort(stringArray, comparator); // "Modifies"	the array so the elements are now in ascending order of length.	
		System.out.println("Sorted by length: " + Arrays.asList(stringArray));
		
		StringComparatorByReverseLength reverseComparator = new StringComparatorByReverseLength();
		Arrays.sort(stringArray, reverseComparator);
		System.out.println("Sorted by reverse length: " + Arrays.asList(stringArray));
		
		StringComparatorByFirstCharacter firstComparator = new StringComparatorByFirstCharacter();
		Arrays.sort(stringArray, firstComparator);
		System.out.println("Sorted by first character: " + Arrays.asList(stringArray));
		
	}
}