print "Please enter some text: "
String s = System.console().readLine()
print s
int n = s.length()
for (int i = 0; i < s.length(); i++ ) {
	print s.substring(n - 1 - i, n-i)
}