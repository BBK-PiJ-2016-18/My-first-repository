int total = 0
boolean finished = false
while (!finished) {
print "Please enter a number (end with zero): "
String s = System.console().readLine()
int num = Integer.parseInt(s)
if (num != 0) {
total = total + 1
} else {
finished = true
}
}
println "You have entered " + total + " numbers" 