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
	if (s.substring(i) != s.substring(k-i) ) {
		palindrome = false
	}
}
if (palindrome == true) {
	println s + "is a palindrome"
}
else {
	println s + " is NOT a palindrome"
}