package org.example.exc3;

public class Demo {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();

        System.out.println(magazine.isLoaded() + " <- is loaded");

        System.out.println("load bullet");
        magazine.loadBullet("Irrelevant");

        System.out.println(magazine.isLoaded() + " <- is loaded");

        magazine.shot();

        for (int i = 0; i < 11; i++) {
            magazine.loadBullet("Test");

        }



    }
}
