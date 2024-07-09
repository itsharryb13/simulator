package org.example;

// Shoes class will be child of Garment
public class shoe implements garment {
    private String occasion ;
    private String color;

    public shoe(String occasion, String color) {
        this.occasion = occasion;
        this.color = color;
    }

    // displays type and color of garment that goes with the top
    @Override
    public void wear() {
        System.out.println (occasion + " " + color + "Shoes");
    }
}
