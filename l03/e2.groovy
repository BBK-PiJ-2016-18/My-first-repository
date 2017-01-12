print "Enter a real number: "
double n1 = Double.parseDouble(System.console().readLine())
print "Enter another real number: "
double n2 = Double.parseDouble(System.console().readLine())
println "What do you want to do?"
println "To add them, please enter 1"
println "To subtract them, please enter 2"
println "To multiply them, please enter 3"
println "To divide them, please enter 4"
print "Make your choice: "
int choice = Integer.parseInt(System.console().readLine())
switch (choice) {
	case 1:
		double ans = n1 + n2
		println n1 + " + " + n2 + " = " + ans
		break;
	case 2:
		double ans = n1 - n2
		println n1 + " - " + n2 + " = " + ans
		break;
	case 3:
		double ans = n1 * n2
		println n1 + " * " + n2 + " = " + ans
		break;
	case 4:
		double ans = n1 / n2
		println n1 + " / " + n2 + " = " + ans
		break;
}