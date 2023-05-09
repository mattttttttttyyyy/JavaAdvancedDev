package org.example.exc3;
/*
Create a class simulating a magazine for a firearm. The class should have the ability to
define the size of the magazine using a constructor. Implement the following methods:

        loadBullet(String bullet) → adds a bullet to the magazine, doesn't allow loading more bullets than the magazine capacity
        isLoaded() → returns information whether the firearm is loaded (at least one bullet) or not
        shot() → one invocation fires (prints in the console) one - the last loaded bullet
        and prepares the next one, loaded before the last one. If there are no more bullets, it prints "empty magazine" in the console.
*/

public class Magazine {

    private final int maxCapacity = 12;
    private int bulletsInMagazine;


    public void loadBullet(String bullet){
        if (bulletsInMagazine < maxCapacity ){
            bulletsInMagazine++;
        } else {
            System.out.println("FULL");
        }

    }
    public boolean isLoaded(){
        return bulletsInMagazine != 0;
    }

    public void shot(){
        if(isLoaded()){
            System.out.println("SHOT");
            if (!isLoaded()){
                System.out.println("next bullet ready");
            } else {
                System.out.println("Empty");
            }
        } else {
            System.out.println("Empty");
        }
    }

}
