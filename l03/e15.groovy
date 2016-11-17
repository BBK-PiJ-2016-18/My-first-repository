print "Please enter some text: "
String s = System.console().readLine()
boolean palindrome = true
int n = s.length()
char w = s.substring(n-2, n-1)
println w
println Character.toUpperCase(w)
char v = s.substring(n-1, n)
println v
println Character.toUpperCase(v)
int k
if (n % 2 == 0) {
	k = n / 2
}
else {
	k = (n - 1) / 2
}
for (int i = 0; i < k; i++) {
	char c = s.substring(n-i-1, n-i)
	char d = s.substring(i, i+1)
	if (s.substring(i, i+1) != s.substring(n-i-1, n-i) && Character.toLowerCase(d) != s.substring(n-i-1, n-i) && s.substring(i, i+1) != Character.toLowerCase(c) ) {
		palindrome = false
	}
}
if (palindrome == true) {
	println s + " is a palindrome"
}
else {
	println s + " is NOT a palindrome"
}