public class Comparator<T> {
	/*public T getMax(T n, T m) {
		Number n1
		Number n2
		if (n1 > n2) {
			return n
		}
		else {
			return m
		}
	}*/
	public static void main(String[] args) {
		Comparator c = new Comparator();
		System.out.println(c.getMax(1,3));
		System.out.println(c.getMax(1.4,3.5));
		System.out.println(c.getMax("1","3"));
	}
		
	public int getMax(int d1, int d2) {
		return (int) getMax((double) d1, (double) d2);
	}
	
	public String getMax(String number1, String number2) {
		return "" + getMax(Integer.parseInt(number1), Integer.parseInt(number2));
	}
	
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}

}