package org.example.exc5;

public class Cone extends ThreeDShape{

    private int height;
    private int radius;
    private int volume;


    public Cone(int height, int radius) {
        this.height = height;
        this.radius = radius;
        volume = (22 * this.radius * this.radius * this.height) / (3 * 7);

    }

    @Override
    public boolean fill(int waterFilled) {
        if (volume > waterFilled){
            System.out.println("under filled");
        } else if (volume == waterFilled) {
            System.out.println("Full");
        } else {
            System.out.println("Over fill");
        }

        return false;
    }

    @Override
    public int calculateVolume() {
        return volume;
    }
}
