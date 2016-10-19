class Point {
double x;
double y;
}
Point p1 = new Point()
print "Enter the x-coordinate of the first point: "
p1.x = Double.parseDouble(System.console().readLine())
print "Enter the y-coordinate of the first point: "
p1.y = Double.parseDouble(System.console().readLine())
Point p2 = new Point()
print "Enter the x-coordinate of the second point: "
p2.x = Double.parseDouble(System.console().readLine())
print "Enter the y-coordinate of the second point: "
p2.y = Double.parseDouble(System.console().readLine())
Point p3 = new Point()
print "Enter the x-coordinate of the third point: "
p3.x = Double.parseDouble(System.console().readLine())
print "Enter the y-coordinate of the third point: "
p3.y = Double.parseDouble(System.console().readLine())
println p1.x
println p1.y
println p2.x
println p2.y
println p3.x
println p3.y
double p1p2_dist = (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y)
double p1p3_dist = (p1.x - p3.x) * (p1.x - p3.x) + (p1.y - p3.y) * (p1.y - p3.y)
double p2p3_dist = (p2.x - p3.x) * (p2.x - p3.x) + (p2.y - p3.y) * (p2.y - p3.y)
if (p1p2_dist < p1p3_dist) {
	if (p1p2_dist < p2p3_dist) {
		println "point 1 (" + p1.x + ", " + p1.y + ") and point 2 (" + p2.x + ", " + p2.y + ") are the closest"
	}
	else {
		println "point 2 (" + p2.x + ", " + p2.y + ") and point 3 (" + p3.x + ", " + p3.y + ") are the closest"
	}
}
else if (p1p3_dist < p2p3_dist) {
	println "point 1 (" + p1.x + ", " + p1.y + ") and point 3 (" + p3.x + ", " + p3.y + ") are the closest"
}
else {
	println "point 2 (" + p2.x + ", " + p2.y + ") and point 3 (" + p3.x + ", " + p3.y + ") are the closest"
}