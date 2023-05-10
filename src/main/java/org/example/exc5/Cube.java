package org.example.exc5;

public class Cube extends ThreeDShape{
    private int height;
    private int volume;


    public Cube(int height) {
        this.height = height;
        volume = height * height * height;

    }

    @Override
    public boolean fill(int waterFilled) {
        if (volume > waterFilled){
            System.out.println("under filled");
        } else if (volume == waterFilled) {
            System.out.println("Full");
        } else System.out.println("Over fill");

        return false;
    }

    @Override
    public int calculateVolume() {
        return volume;
    }

}
