print "Enter a number: "
String s = System.console().readLine()
int n = Integer.parseInt(s)
int previous = n
boolean ascending = true
boolean finished = false
while (!finished) {
	print "Enter another number (-1 to finish): "
	s = System.console().readLine()
	n = Integer.parseInt(s)
	int difference = n - previous
	if (n == -1) {
		finished = true
	}
	else if (difference != 1) {
		ascending = false
	}
	previous = n
}
if (ascending == true) {
	println "Yes"
}
else {
	println "No"
}