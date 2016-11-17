print "Please enter some text: "
String s = System.console().readLine()
boolean palindrome = true
int n = s.length()
int k
if (n % 2 == 0) {
	k = n / 2
}
else {
	k = (n - 1) / 2
}
for (int i = 0; i < k; i++) {
	if (s.substring(i, i+1) != s.substring(n-i-1, n-i) ) {
		palindrome = false
	}
}
if (palindrome == true) {
	println s + " is a palindrome"
}
else {
	println s + " is NOT a palindrome"
}