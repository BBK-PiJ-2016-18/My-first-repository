class Point {
	double x;
	double y;
}
class Rectangle {
	Point upright;
	Point downRight;
}
Point p1 = new Point()
print "Enter the x-coordinate of the top-right corner of the rectangle: "
p1.x = Double.parseDouble(System.console().readLine())
print "Now enter the y-coordinate of the top-right corner: "
p1.y = Double.parseDouble(System.console().readLine())
Point p2 = new Point()
print "Now nter the x-coordinate of the bottom-right corner of the rectangle: "
p2.x = Double.parseDouble(System.console().readLine())
print "Now enter the y-coordinate of the this corner: "
p2.y = Double.parseDouble(System.console().readLine())
double area = (p1.x - p2.x) * (p1.y - p2.y)
println "The area of the rectangle is " + area
double perimeter = (p1.x - p2.x) * 2 + (p1.y-p2.y) * 2
println "The perimeter of the rectangle is " + perimeter