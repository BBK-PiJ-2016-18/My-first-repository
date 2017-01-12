boolean valid = false
while (!valid) {
	print "Please enter a number between 1 and 25: "
	String s = System.console().readLine()
	int n = Integer.parseInt(s)
	if (n > 25) {
		println "That is not valid"
	}
	else if (n > 0) {
		valid = true
	}
	else {
		println "That is not valid"
	}
}
int spaces
int i = 0
int j = 0
while (i < n) {
	i++
	spaces = n - i
	while (spaces > 0) {
		spaces--
		print "  "
	}
	j = i
	while (j > 0) {
		if (i < 10) {
			print i + " "
		}
		if (i >= 10) {
			print i
		}
		j--
	}
	println ""
}