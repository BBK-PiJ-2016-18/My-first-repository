int t = 0
print "Enter a number: "
String s = System.console().readLine()
int x = Integer.parseInt(s)
if (x == 100) {
t = t + 1
}
boolean finished = false
while (!finished) {
print "Enter another number (0 to finish): "
String u = System.console().readLine()
int num = Integer.parseInt(u)
if (num == 100) {
t = t + 1
}
else if (num == 0) {
finished = true
}
}
println t