print "Please enter wife's salary: "
String s = System.console().readLine()
int wifeSalary = Integer.parseInt(s)
print "Now enter husband's salary: "
String t = System.console().readLine()
int husbandSalary = Integer.parseInt(t)
int totalSalary = husbandSalary + wifeSalary
if (totalSalary >= 40000) {
println "Higer taxrate"
} else {
println "Lower taxrate"
}