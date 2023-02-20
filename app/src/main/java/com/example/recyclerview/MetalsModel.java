package com.example.recyclerview;

public class MetalsModel {
    String scientificName;
    String metalsName;
    String symbols;
    int image;

    public MetalsModel(String scientificName, String metalsName,
                       String symbols, int image) {
        this.scientificName = scientificName;
        this.metalsName = metalsName;
        this.symbols = symbols;
        this.image = image;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getMetalsName() {
        return metalsName;
    }

    public String getSymbols() {
        return symbols;
    }

    public int getImage() {
        return image;
    }
}
