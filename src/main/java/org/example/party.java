package org.example;

// this class is a child of GarmentFactory and is responsible for
// creating party garments
class party implements garmentGen {
    // creates new instance of a party top
    public garment createTop(String occasion, String color) {
        // returns the top with the type and color for party outfit
        return new top(occasion, color);
    }
    // creates new instance of professional pants
    public garment createPants(String occasion, String color) {
        // returns the pants with the type and color for party outfit
        return new pants(occasion, color);
    }

    public garment createShoes(String occasion, String color) {
        // returns the pants with the type and color for party outfit
        return new shoe(occasion, color);
    }
}
