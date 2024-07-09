package org.example;
public class casual implements garmentGen {

    public garment createTop(String occasion, String color) {
        // returns the top with the type and color for casual
        return new top(occasion, color);
    }
    // creates new instance of professional pants
    public garment createPants(String occasion, String color) {
        // returns the pants with the type and color for casual
        return new pants(occasion, color);
    }

    public garment createShoes(String occasion, String color) {
        // returns the shoe with the type and color for casual
        return new shoe(occasion, color);
    }
}
