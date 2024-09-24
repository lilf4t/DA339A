package model.items;

public class Size {

    //----------------------------------Instance Variables---------------------------------------
    private double length;
    private double width;
    private double height;


    //----------------------------------Constructor----------------------------------------------
    public Size(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //----------------------------------Get method----------------------------------------------
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }


    //----------------------------------Set method----------------------------------------------
    public void setLength(double length) {this.length = length;}
    public void setWidth(double width) {this.width = width;}
    public void setHeight(double height) {this.height = height;}


    //----------------------------------To string----------------------------------------------
    public String toString() {
        return String.format("%.1f cm %.1f cm %.1f cm", length, width, height);
    }
}
