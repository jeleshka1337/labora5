package Komandy;

import Klassy.Flat;
import Klassy.House;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;


public abstract class Komanda {

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract Komanda execute(LinkedHashMap<Long, Flat> collection, Scanner scanner, String fileCollection, String value) throws IOException;

}
