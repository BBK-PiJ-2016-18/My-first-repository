import java.util.Arrays;
import java.util.Comparator;

public class Ex2 {
	public static void main(String[] args) {
		String[] stringArray = {"string", "thingy", "mong", "trump", "abc", "77", "1234567890", "ebola", "mexico", "dance"};
		System.out.println("Initial array: " + Arrays.asList(stringArray));
		
		Arrays.sort(stringArray, (s1, s2) -> s1.length() - s2.length());
		System.out.println("Sorted by length: " + Arrays.asList(stringArray));
		
		Arrays.sort(stringArray, (s1, s2) -> s2.length() - s1.length());
		System.out.println("Sorted by reverse length: " + Arrays.asList(stringArray));
		
		Arrays.sort(stringArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		System.out.println("Sorted first character: " + Arrays.asList(stringArray));
		
		Arrays.sort(stringArray, (s1,s2) -> StringUtils.eChecker(s1, s2));
		System.out.println("Strings containing 'e' first: " + Arrays.asList(stringArray));
	}
}