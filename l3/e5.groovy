class Point {
	double x;
	double y;
}
class Rectangle {
	Point upRight;
	Point downLeft;
}
print "Enter the x-coordinate of the top-right corner of the rectangle: "
double upRightX = Double.parseDouble(System.console().readLine())
print "Now enter the y-coordinate of the top-right corner: "
upRightY = Double.parseDouble(System.console().readLine())
print "Now enter the x-coordinate of the bottom-right corner of the rectangle: "
downLeftX = Double.parseDouble(System.console().readLine())
print "Now enter the y-coordinate of the this corner: "
downLeftY = Double.parseDouble(System.console().readLine())
Point topRightCorner = new Point()
topRightCorner.x = upRightX
topRightCorner.y = upRightY
Point downLeftCorner = new Point()
downLeftCorner.x = downLeftX
downLeftCorner.y = downLeftY
Rectangle myRec = new Rectangle()
myRec.upRight = topRightCorner
myRec.downLeft = downLeftCorner
double area = (myRec.upRight.x - myRec.downLeft.x) * (myRec.upRight.y - myRec.downLeft.y)
println "The area of the rectangle is " + area
double perimeter = (myRec.upRight.x - myRec.downLeft.x) * 2 + (myRec.upRight.y - myRec.downLeft.y) * 2
println "The perimeter of the rectangle is " + perimeter
