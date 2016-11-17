println "Please enter a number"
String s = System.console().readLine()
int n = Integer.parseInt(s)
boolean prime = true
if (n != 2) {
  	int factor = 2
  	while (factor < n) {
    		int remainder = n % factor
   		if (remainder == 0) {
      			prime = false
			factor = n
    		} else {
      			factor = factor + 1
      		}
	}
    	if (!prime) {
    		println "That is not prime"
	} else {
		println "That is prime"
	}  	
} else {
	println "That is prime"
}