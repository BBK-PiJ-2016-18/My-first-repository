print "Please enter the numerator: "
String s = System.console().readLine()
int n = Integer.parseInt(s)
print "Now enter the denominator: "
String t = System.console().readLine()
int d = Integer.parseInt(t)
int q = 0
while (d <= n) {
	n = n - d
	q = q + 1
}
int r = n
println n + " divided by " + d + " is " + q + ", remainder " + r