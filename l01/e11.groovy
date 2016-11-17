int rank
boolean finished = false
while (!finished)
{
	finished = true
	print "Enter the rank of your first card: "
	String s = System.console().readLine()
	if (s == "J") {
		rank = 11
	}
	else if (s == "Q") {
		rank = 12
	}
	else if (s== "K") {
		rank = 13
	}
	else rank = Integer.parseInt(s)
	if (rank < 0) {
		println "That is not a valid rank, try again: "
		finished = false
	}
	else if (rank > 13) {println "That is not a valid rank, try again: "
		finished = false
	}
}
println rank 
		