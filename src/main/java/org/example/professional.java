package org.example;
public class professional implements garmentGen {
    // creates new instance of a professional top
    public garment createTop(String occasion, String color) {
        // returns the top with the type and color for professional outfit
        return new top(occasion, color);
    }
    // creates new instance of professional pants
    public garment createPants(String occasion, String color) {
        // returns the pants with the type and color for professional outfit
        return new pants(occasion, color);
    }
    // creates new instance of professional shoes
    public garment createShoes(String occasion, String color) {
        // returns the shoe with the type and color for professional outfit
        return new shoe(occasion, color);
    }
}

