// copied from what Sergio wrote on board, compare to much shortler but equivalent code w/ lambdas in Keith's eg

public class StringComparatorByLength implements Comparator<String> {
	@Override
	public int Compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}