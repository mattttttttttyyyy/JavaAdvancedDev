package org.example.exc5;

public class Rectangle extends Shape{

    /*
Create an abstract class named Shape with abstract methods calculatePerimeter()
for calculating the perimeter and calculateArea() for calculating the area.
        Create classes Rectangle, Triangle, Hexagon extending the Shape class,
        and implement the abstract methods accordingly. Verify the correctness of the program.
*/

    @Override
    public int calculatePerimeter(int length) {
        return length * 4;
    }

    @Override
    public int calculateArea(int length) {
        return length * length;
    }


}
