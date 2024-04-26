package Execs;

import Klassy.Coordinates;
import Klassy.Flat;
import Klassy.Furnish;
import Klassy.House;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
    public static LinkedHashMap <Long, Flat> input (String file){
        LinkedHashMap <Long, Flat> collection = new LinkedHashMap <> ();
        try {
            Scanner scanner = new Scanner(new File(file));
            String line;
            while ((line = scanner.nextLine()) != null){
                Flat flat = new Flat();
                Coordinates coordinates = new Coordinates();
                House house = new House();
                String[] fields = line.split("|");
                flat.setId(Long.valueOf(fields[0]));
                flat.setName(fields[1]);
                coordinates.setX(Double.valueOf(fields[2]));
                coordinates.setY(Integer.valueOf(fields[3]));
                flat.setCoordinates(coordinates);
                flat.setCreationDate(LocalDate.parse(fields[4]));
                flat.setArea(Integer.valueOf(fields[5]));
                flat.setNumberOfRooms(Long.valueOf(fields[6]));
                flat.setNumberOfBathrooms(Long.valueOf(fields[7]));
                flat.setTimeToMetroByTransport(Double.valueOf(fields[8]));
                flat.setFurnish(Furnish.valueOf(fields[9]));
                house.setName(fields[10]);
                house.setYear(Integer.valueOf(fields[11]));
                house.setNumberOfLifts(Long.valueOf(fields[12]));
                flat.setHouse(house);
                collection.put(flat.getId(), flat);
            }
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("Oops, couldn't find a file :-(");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchElementException n){
            System.out.println("Collection empty loooool :3");
        }
        return collection;
    }
}
