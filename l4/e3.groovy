Integer power(int b, int e) {
	int product = 1
	for (int i = 1; i <= e; i++) {
		product = product * b
	}
	return product
}

Integer power2(int e) {
	int product = power (2, e)
	return product
}

Integer binary2decimal(String binary) {
	int decimal = 0
	for (int i = 0; i < binary.length(); i++) {
		int j = binary.length() - 1 - i
		int digit = Integer.parseInt(binary.substring(j, j + 1))
		decimal = decimal + digit * power2(i)
	}
	return decimal
}

Integer decimal2binary (int decimal) {
	int numerator = decimal
	String binary = ""
	while (numerator > 0) {
		int q = numerator / 2
		int digit = numerator % 2
		binary = binary + digit
		numerator = q
	}
	return binary
}
boolean running = true;
while (running) {
	println "1 - Convert binary to decimal";
	println "2 - Convert decimal to binary";
	println "0 - Exit";
	print "> ";
	String str = System.console().readLine();
	int option = Integer.parseInt(str);
	switch (option) {
		case 0: running = false;
		break;
		case 1: print "Enter the binary number you wish to convert: "
		String s = System.console().readLine()
		println binary2decimal(s);
		break;
		case 2: print "Enter the decimal number you wish to convert: "
		String s = System.console().readLine()
		int decimal = Integer.parseInt(s)
		println decimal2binary(s);
		break;
		default: println "Invalid option. Please try again."
	}
}