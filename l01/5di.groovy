print "Enter a number: "
int n = Integer.parseInt(System.console().readLine())
int positive = (n > 0)? 1 : 0
int zero = (n == 0)? 1 : 0
int negative = (n < 0)? 1 : 0
boolean finished = false
while (!finished) {
	print "Enter another number (END to finish): "
	String s = System.console().readLine()
	if (s == "END") {
		finished = true
		break;
	}
	n = Integer.parseInt(s)
	addpositive = (n > 0)? 1 : 0
	addzero = (n > 0)? 1 : 0
	addnegative = (n > 0)? 1 : 0
	positive = positive + addpositive
	zero = zero + addzero
	negative = negative + addnegative
}
println "You input " + positive + " positive numbers"
println "You input zero " + zero + " times"
println "You input " + negative + " negative numbers"