print "Enter a number: "
int n = Integer.parseInt(System.console().readLine())
int positive = 0
int zero = 0
int negative = 0
if (n > 0) {
	positive = positive + 1
}
else if (n == 0) {
	zero = zero + 1
}
else if (n < 0) {
	negative = negative + 1
}
boolean finished = false
while (!finished) {
	print "Enter another number (END to finish): "
	String s = System.console().readLine()
	if (s == "END") {
	finished = true
	break;
	}
	int i = Integer.parseInt(s)
	if (i > 0) {
		positive = positive + 1
	}
	else if (i == 0) {
		zero = zero + 1
	}
	else if (i < 0) {
		negative = negative + 1
	}
}
println "You input " + positive + " positive numbers"
println "You input zero " + zero + " times"
println "You input " + negative + " negative numbers"