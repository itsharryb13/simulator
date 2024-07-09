package org.example;


public class pants implements garment {
    // class for pants rather being different style it would have similar styles

    private String occasion ;
    private String color;

    public pants(String occasion, String color) {
        this.occasion = occasion;
        this.color = color;
    }
    // displays type and color of garment that goes with the pants
    @Override
    public void wear() {
        System.out.println (occasion + " " + color + " pants");
    }
}
