print "Enter a number: "
String s = System.console().readLine()
int n = Integer.parseInt (s)
int max = n
boolean finished = false
while (!finished) {
	print "Enter another number (-1 to finish): "
	s = System.console().readLine()
	n = Integer.parseInt (s)
	if (n == -1) {
		finished = true
	}
	else if (n > max) {
		max = n
	}
}
println "Largest number: " + max