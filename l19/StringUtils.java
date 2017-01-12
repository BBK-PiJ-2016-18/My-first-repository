public class StringUtils {
	public static int eChecker(String s1, String s2) {
		int eCount = 0;
		if (s1.contains("e") && !s2.contains("e")) {
			eCount = -1;
		}
		else if (s2.contains("e") && !s1.contains("e")) {
			eCount = 1;
		}
		return eCount;
	}
}