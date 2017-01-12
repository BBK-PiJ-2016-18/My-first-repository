print "Enter the first number: "
String s = System.console().readLine()
int n = Integer.parseInt(s)
boolean finished = false
while (!finished) {
int m = n
print "Enter the next number (0 to finish): "
String t = System.console().readLine()
n = Integer.parseInt(t)
if (n == 0) {
finished = true
}
else if (n < m ) {
println "Down"
}
else if (n == m) {
println "Same"
}
else {
println "Up"
}
}