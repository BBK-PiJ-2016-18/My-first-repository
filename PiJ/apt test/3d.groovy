print "Enter an integer: "
String s = System.console().readLine()
int x = Integer.parseInt(s)
print "Enter the integer you want do divide into " + x + ": "
t = System.console().readLine()
int y = Integer.parseInt(t)
if (y == 0) {
println "Cannot divide by zero"
} else {
int z
z = x % y
if (z == 0) {
println "Yes"
} else {
println "No"
}
}