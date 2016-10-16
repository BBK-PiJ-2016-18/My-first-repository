Integer hextodecdigit (String hexdigit) {
	if (hexdigit == "a") {
		return 10;
	}
	else if (hexdigit == "b") {
		return 11;
	}
	else if (hexdigit == "c") {
		return 12;
	}
	else if (hexdigit == "d") {
		return 13;
	}
	else if (hexdigit == "e") {
		return 14;
	}
	else if (hexdigit == "f") {
		return 15;
	}
	if (hexdigit == "A") {
		return 10;
	}
	else if (hexdigit == "B") {
		return 11;
	}
	else if (hexdigit == "C") {
		return 12;
	}
	else if (hexdigit == "D") {
		return 13;
	}
	else if (hexdigit == "E") {
		return 14;
	}
	else if (hexdigit == "F") {
		return 15;
	}
	else {
	return Integer.parseInt(hexdigit)
	}
}
String dec2hex (int decimal) {
	int numerator = decimal
	String hex = ""
	while (numerator > 0) {
		int q = numerator / 16
		int digit = numerator % 16
		switch (digit) {
			case 10:
			hex = "A" + hex
			break;
			case 11:
			hex = "B" + hex
			break;
			case 12:
			hex = "C" + hex
			break;
			case 13:
			hex = "D" + hex
			break;
			case 14:
			hex = "E" + hex
			break;
			case 15:
			hex = "F" + hex
			break;
			default:
			hex = digit + hex
			break;
		}
		numerator = q
	}
	return hex
}
Integer power(int b, int e) {
	int product = 1
	for (int i = 1; i <= e; i++) {
		product = product * b
	}
	return product
}

Integer power16(int e) {
	int product = power (16, e)
	return product
}
Integer hex2dec(String binary) {
	int decimal = 0
	for (int i = 0; i < binary.length(); i++) {
		int j = binary.length() - 1 - i
		String hdigit = (binary.substring(j, j + 1))
		int digit = hextodecdigit(hdigit)
		decimal = decimal + digit * power16(i)
	}
	return decimal
}	
print "Please enter a decimal or hexadecimal (starting with \"0x\") number: "
String s = System.console().readLine()
String hextest = s.substring(0,2)
if (hextest == "0x") {
	println "Your number was hex"
	String t = s.substring(2)
	println "Converted to decimal, that is " + hex2dec(t)
}
else {
	println "Your number was decimal"
	println "Converted to hex, that is " + dec2hex(Integer.parseInt(s))
}
