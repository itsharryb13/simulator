package org.example;

public class top implements garment {
    private String occasion ;
    private String color;

    public top(String occasion, String color) {
        this.occasion = occasion;
        this.color = color;
    }

    // displays type and color of garment that goes with the top
    @Override
    public void wear() {
        System.out.println (occasion + " " + color + " top");
    }
}
