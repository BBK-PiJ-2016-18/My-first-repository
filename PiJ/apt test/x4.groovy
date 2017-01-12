println "Enter a line of text:"
String s = System.console().readLine()
int m = s.length()
boolean finished = false 
while (!finished) {
println "Enter another line of text (enter an empty line to finish):"
String str = System.console().readLine()
int n = str.length()
if (n > m) {
m = n
s = str
}
else if (n == 0) {
finished = true
}
}
println s