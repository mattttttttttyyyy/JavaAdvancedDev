package org.example.exc3;

public class Demo {
    public static void main(String[] args) {
        Magazine magazine = new Magazine(15);

        System.out.println(magazine.isLoaded() + " <- is loaded");

        System.out.println("load bullet");
        magazine.loadBullet("Irrelevant");

        System.out.println(magazine.isLoaded() + " <- is loaded");

        magazine.shot();

        System.out.println("\n----------------------------------");


        for (int i = 0; i < 15; i++) {
            magazine.loadBullet("Test");

        }
        System.out.println("\n----------------------------------");
        for (int i = 0; i < 15; i++) {
            System.out.println("*******************");
            magazine.shot();
        }


    }
}
