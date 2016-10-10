class Point {
double x;
double y;
}
Point p1 = new Point()
print "Enter the x-coordinate of the first point: "
double x1 = Double.parseDouble(System.console().readLine())
print "Enter the y-coordinate of the first point: "
double y1 = Double.parseDouble(System.console().readLine())
Point p1 = new Point()
print "Enter the x-coordinate of the second point: "
double x2 = Double.parseDouble(System.console().readLine())
print "Enter the y-coordinate of the second point: "
double y2 = Double.parseDouble(System.console().readLine())
Point p1 = new Point()
print "Enter the x-coordinate of the third point: "
double x3 = Double.parseDouble(System.console().readLine())
print "Enter the y-coordinate of the third point: "
double y3 = Double.parseDouble(System.console().readLine())
double p1p2_dist = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)
double p1p3_dist = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3)
double p2p3_dist = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3)
if (p1p2_dist < p1p3_dist) {
	if (p1p2_dist < p2p3_dist) {
		println "point 1 (" + x1 + ", " + y1 + ") and point 2 (" + x2 + ", " + y2 + ") are the closest"
	}
	else {
		println "point 2 (" + x2 + ", " + y2 + ") and point 3 (" + x3 + ", " + y3 + ") are the closest"
	}
}
else if (p1p3_dist < p2p3_dist) {
	println "point 1 (" + x1 + ", " + y1 + ") and point 3 (" + x3 + ", " + y3 + ") are the closest"
}
else {
	println "point 2 (" + x2 + ", " + y2 + ") and point 3 (" + x3 + ", " + y3 + ") are the closest"
}