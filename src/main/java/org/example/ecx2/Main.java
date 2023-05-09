package org.example.ecx2;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("Test", "przedmiot 1");
        storage.addToStorage("Test", "przedmiot 2");
        storage.addToStorage("Test", "przedmiot 3");
        storage.addToStorage("Test", "przedmiot 4");
        storage.addToStorage("Test", "przedmiot 5");

        System.out.println(storage.printValues("Test"));

        storage.findValues("przedmiot 2");

    }
}
