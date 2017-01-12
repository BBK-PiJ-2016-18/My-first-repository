println "Please choose an option:"
println "For ’Checking you balance’, please enter 1"
println "For ’Purchases’, please enter 2"
println "For ’Refunds’, please enter 3"
println "For ’Queries about the warranty’, please enter 4"
println "For ’Returning faulty goods’, please enter 5"
println "For any other query, please enter 0"
boolean finished = false
String s = System.console().readLine()
Integer choice = Integer.parseInt(s)
while (!finished)
switch (choice) {
	case 0:
	println "Go and talk with a human operator"
	finished = true
	break;
	case 1:
	println "Go and check bank balance"
	finished = true
	break;
	case 2:
	println "Go and purchase something"
	finished = true
	break;
	case 3:
	println "Go and process refunds"
	finished = true
	break;
	case 4:
	println "Go and answer queries"
	finished = true
	break;
	case 5:
	println "Return faulty goods"
	finished = true
	break;
	default:
	println "That is not a valid option, please try again"
}