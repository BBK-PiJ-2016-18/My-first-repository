print "What time is it? Enter without a separator, in (h)hmm format: "
String s = System.console().readLine()
int t = Integer.parseInt(s)
int m = t % 100
if (m >= 60) {
println "?"
}
else if (t >= 2400) {
println "?"
}
else if (t >= 2100) {
println "Good night"
}
else if (t >= 1800) {
println "Good evening!"
}
else if (t >= 1200) {
println "Good afternoon"
}
else if (t>= 600) {
println "Good morning!"
}
else if (t >= 0) {
println "What are you doing up at this time? Go to bed!"
}
else {
println "?"
}