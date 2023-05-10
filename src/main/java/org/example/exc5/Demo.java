package org.example.exc5;

public class Demo {



    public static void main(String[] args) {
        Cone cone = new Cone(20, 20);
        System.out.println(cone.calculateVolume());
        cone.fill(15);
    }
}
