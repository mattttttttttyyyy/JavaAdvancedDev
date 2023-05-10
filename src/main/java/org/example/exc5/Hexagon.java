package org.example.exc5;

public class Hexagon extends Shape {
    @Override
    public int calculatePerimeter(int length) {
        return length * 6;
    }

    @Override
    public int calculateArea(int length) {
        return (int) ((6*(length*length))/(4*Math. tan(Math. PI/6)));
    }


}
