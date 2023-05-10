package org.example.exc5;

public class Triangle extends Shape {
    @Override
    public int calculatePerimeter(int length) {
        return length * 3;
    }

    @Override
    public int calculateArea(int length) {
        return (int)(length * length) / 2;
    }


}
