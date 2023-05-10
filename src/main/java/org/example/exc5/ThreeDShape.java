package org.example.exc5;

/*Create classes named Cone and Cube extending the 3DShape class,
        respectively implementing the abstract methods. Test the correctness of the implementation.*/

public abstract class  ThreeDShape extends Shape implements Fillable{
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public abstract int calculateVolume();
}
