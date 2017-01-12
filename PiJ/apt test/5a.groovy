println "Please choose an option:"
println "For ’Checking you balance’, please enter 1"
println "For ’Purchases’, please enter 2"
println "For ’Refunds’, please enter 3"
println "For ’Queries about the warranty’, please enter 4"
println "For ’Returning faulty goods’, please enter 5"
println "For any other query, please enter 0"
String s = System.console().readLine()
Integer choice = Integer.parseInt(s)
switch (choice) {
	case 1:
	println "Go and check bank balance"
	case 2:
	println "Go and purchase something"
	case 3:
	println "Go and process refunds"
	case 4:
	println "Go and answer queries"
	case 5:
	println "Return faulty goods"
	default:
	println "Go and talk with a human operator"
}