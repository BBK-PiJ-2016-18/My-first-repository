println "Please enter a number"
String s = System.console().readLine()
int m = Integer.parseInt(s)
println "Enter another number"
String t = System.console().readLine()
int n = Integer.parseInt(t)
int k = 0
int product = 0
while (k < n) {
  product = product + m
  k = k + 1
}
println "The product of those two numbers is " + product