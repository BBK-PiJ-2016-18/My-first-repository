class Point {
double x;
double y;
}
Integer distance (Point p1, Point p2) {
int dist = (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y)
return dist;
}
Point p1 = new Point ()
print "Enter the x-coordinate of the first point: "
p1.x = Double.parseDouble(System.console().readLine())
print "Enter the y-coordinate of the first point: "
p1.y = Double.parseDouble(System.console().readLine())
Point p2 = new Point ()
print "Enter the x-coordinate of the second point: "
p2.x = Double.parseDouble(System.console().readLine())
print "Enter the y-coordinate of the second point: "
p2.y = Double.parseDouble(System.console().readLine())
Point p3 = new Point ()
print "Enter the x-coordinate of the third point: "
p3.x = Double.parseDouble(System.console().readLine())
print "Enter the y-coordinate of the third point: "
p3.y = Double.parseDouble(System.console().readLine())
if (distance (p1, p2) < distance (p1, p3)) {
	if (distance (p1, p2) < distance (p2, p3)) {
		println "point 1 (" + p1.x + ", " + p1.y + ") and point 2 (" + p2.x + ", " + p2.y + ") are the closest"
	}
	else {
		println "point 2 (" + p2.x + ", " + p2.y + ") and point 3 (" + p3.x + ", " + p3.y + ") are the closest"
	}
}
else if (distance (p1, p3) < distance (p2, p3)) {
	println "point 1 (" + p1.x + ", " + p1.y + ") and point 3 (" + p3.x + ", " + p3.y + ") are the closest"
}
else {
	println "point 2 (" + p2.x + ", " + p2.y + ") and point 3 (" + p3.x + ", " + p3.y + ") are the closest"

}