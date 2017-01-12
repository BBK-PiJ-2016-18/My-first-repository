public class Launcher {
	public static void main(String[] args) {
		if (args.length < 10) {
			
		}
		Average avgCalc = new Average();
		double[] numbers = avgCalc.converter(args);
		double mean = avgCalc.avg(numbers);
		System.out.println(mean);
	}
}