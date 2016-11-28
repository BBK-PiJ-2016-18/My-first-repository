public class Average {
	private double sum(double[] numbers) {
		double total = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9];
		return total;
	}
	
	private double addition(double[] numbers) {
		double result = 0.0;
		for (int i = 0; i < numbers.length; i++) {
			result = result + numbers[i];
		}
		return result;
	}
	
	public double average(double total) {
		double avg = total / 10;
		return avg;
	}
	
	public double avg(double[] numbers) {
		double total = sum(numbers);
		double mean = average(total);
		return mean;
	}
	
	public double[] converter(String[] args) {
		double[] numbers = new double [args.length];
		for (int i=0; i < args.length; i++) {
			numbers[i] = Double.parseDouble(args[i]);
		}
		return numbers;			
	}
}