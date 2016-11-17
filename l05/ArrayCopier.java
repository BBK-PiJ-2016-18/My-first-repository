public class ArrayCopier {
	public static void main (String[] args) {
		Calculator 	c = new Calculator ();
		System.out.println (c.add(3,4));
	}
	if (src.length < dst.length) {
		for (int i = src.length; i < dst.length; i++) {
			src[i] = 0;
		}
	}
	for (int i = 0; i < dst.length; i++) {
		dst[i] = src[i];
	}
	return dst;
	}
}