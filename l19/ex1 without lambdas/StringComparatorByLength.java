// copied from what Sergio wrote on board, compare to much shorter but equivalent code w/ lambdas in Keith's video (or BBK-PiJ-2016-00?) eg
// Array.sort( words, (s1, s2) _> ...

import java.util.Comparator;

public class StringComparatorByLength implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}