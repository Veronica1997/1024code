package e;

public class Rect extends Shape {
    public double weight;
    public double height;
    public double zhouchang() {
        return (weight+height)*2;
    }
    public double mianji() {
        return weight*height;
    }
    }