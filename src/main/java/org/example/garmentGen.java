package org.example;

//  creation of different parts of the outfit
// of different garments
public interface garmentGen {
    // shoes
    garment createShoes( String occasion, String color);
    // tops
    garment createTop(String occasion, String color);
    // pants
    garment createPants(String occasion, String color);

}
