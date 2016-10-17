Calculator myCalculator = new Calculator()

boolean finished = false
while (!finished) {
	println ""
	print "Enter a number: "
	int n1 = Integer.parseInt(System.console().readLine())
	print "Enter another number: "
	int n2 = Integer.parseInt(System.console().readLine())
	println "To add these two numbers, enter 1"
	println "To subtract two numbers, enter 2"
	println "To multiply two numbers, enter 3"
	println "To add divide numbers, enter 4"
	println "To calculate a number modulo another number, enter 5"
	println "To exit, enter 0"
	print "Make your choice: "

	String s = System.console().readLine()
	int choice = Integer.parseInt(s)
	switch (choice) {
		case 1:
		println n1 + " + " + n2 + " = " + myCalculator.add(n1,n2)
		break;
		case 2:
		println n1 + " - " + n2 + " = " + myCalculator.subtract(n1,n2)
		break;
		case 3:
		println n1 + " x " + n2 + " = " + myCalculator.multiply(n1,n2)
		break;
		case 4:
		println n1 + " / " + n2 + " = " + myCalculator.divide(n1,n2)
		break;
		case 5:
		println n1 + " mod " + n2 + " = " + myCalculator.modulus(n1,n2)
		break;
		default:
		finished = true
		break;
	}
}