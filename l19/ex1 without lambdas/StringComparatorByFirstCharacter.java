import java.util.Comparator;

public class StringComparatorByFirstCharacter implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s1.charAt(0) - s2.charAt(0); // This produces a number despite being a "letter" subtracr a "Letter"
	}
} 