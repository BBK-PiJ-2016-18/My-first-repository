print "Enter a number: "
String s = System.console().readLine()
int n = Integer.parseInt(s)
int previous = n
boolean consecutive = true
boolean finished = false
boolean descending = true
while (!finished) {
	print "Enter another number (-1 to finish): "
	s = System.console().readLine()
	n = Integer.parseInt(s)
	int difference = n - previous
	if (n == -1) {
		finished = true
	}
	else if (difference != 1) {
		consecutive = false
	}
	else if (difference != -1) {
		descending = false
	}
	println "value if consecutive is " + consecutive
	println "value if descending is " + descending
	previous = n
}
if (descending == true) {
	consecutive = true
}
if (consecutive == true) {
	println "Yes"
}
else {
	println "No"
}