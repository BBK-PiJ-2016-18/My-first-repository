print "Enter a number: "
String s = System.console().readLine()
int a = Integer.parseInt(s)
print "Enter another number: "
String t = System.console().readLine()
int b = Integer.parseInt(t)
print "Enter a third number: "
String u = System.console().readLine()
int c = Integer.parseInt(u)
int n1 = a
int n2 = b
int n3 = c
if (b < a) {
	n1 = b
	n2 = a
	if (c < a) {
		n2 = c
		n3 = a
		if (c < b) {
			n1 = c
			n2 = b
		}
	}
}
else {
	if (c < b) {
		n2 = c
		n3 = b
		if (c < a) {
			n1 = c
			n2 = a
		}
	}
}
println "From lowest to highest: " + n1 + ", " + n2 + ", " + n3