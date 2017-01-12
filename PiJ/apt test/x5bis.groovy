print "Enter the first number: "
String s = System.console().readLine()
int n = Integer.parseInt(s)
int m = n
print "Enter the next number (0 to finish): "
s = System.console().readLine()
n = Integer.parseInt(s)
String list
if (n == 0) {
finished = true
}
else if (n < m ) {
list = "Down"
}
else if (n == m) {
list = "Same"
}
else {
list = "Up"
}
boolean finished = false
while (!finished) {
m = n
print "Enter the next number (0 to finish): "
s = System.console().readLine()
n = Integer.parseInt(s)
if (n == 0) {
finished = true
}
else if (n < m ) {
list = list + " Down"
}
else if (n == m) {
list = list + " Same"
}
else {
list = list + " Up"
}
}
println list