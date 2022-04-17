package Sergey.HW.Hw6_1;

public class Block {

    private int width;
    private int length;
    private int height;

    public Block (int[] array) {
        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return (width * length + length * height + height * width) * 2;
    }

    void printObject(){
        System.out.println(getWidth());
        System.out.println(getLength());
        System.out.println(getHeight());
        System.out.println(getVolume());
        System.out.println(getSurfaceArea());
    }






}
