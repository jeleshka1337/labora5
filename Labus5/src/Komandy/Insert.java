package Komandy;

import Klassy.Coordinates;
import Klassy.Flat;
import Klassy.Furnish;
import Klassy.House;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class Insert extends Komanda {
    public Insert(){
        setTitle("insert");
        setDescription(" — creates a new element with a specific key;");
    }

    public void genId(LinkedHashMap <Long, Flat> collection, Flat flat) {
        List<Long> IdList = new ArrayList<>();
        for ( Flat object : collection.values()){
            IdList.add(object.getId());
        }
        Collections.sort(IdList);
        long ID = 1;
        for (Long id : IdList){
            if (ID == id){
                ID++;
            }
            else {
                flat.setId(ID);
                break;
            }
        }
        if (ID > IdList.size()){
            flat.setId(ID);
        }
    }
    public void callName(Flat flat, Scanner scanner) throws IOException {
        System.out.println("Please provide a name:");
        String name = scanner.nextLine();
        while (name == "") {
            System.out.println("Nuh-uh! Try again:");
            name = scanner.nextLine();
        }
        flat.setName(name);
    }

    public void callCoordinates(Flat flat, Scanner scanner) {
        Coordinates coordinates = new Coordinates();
        System.out.println("Please provide X axis coordinates (must be less than 830):");
        while (true) {
            try {
                String x = scanner.nextLine();
                while (x == "" || Double.parseDouble(x) > 830) {
                    System.out.println("Incorrect! One more try:");
                    x = scanner.nextLine();
                }
                coordinates.setX(Double.parseDouble(x));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sire, X should be a number!");
            }
        }
        System.out.println("Please provide Y axis coordinates:");
        while (true) {
            try {
                String y = scanner.nextLine();
                while (y == "") {
                    System.out.println("Incorrect! One more try:");
                    y = scanner.nextLine();
                }
                coordinates.setY(Integer.parseInt(y));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sire, Y should be a round number!");
            }
        }
        flat.setCoordinates(coordinates);
    }

    public void genDate(Flat flat) {
        flat.setCreationDate(LocalDate.now());
    }

    public void callArea(Flat flat, Scanner scanner) {
        System.out.println("Enter the amount of area (more than 0):");
        while (true) {
            try {
                String area = scanner.nextLine();
                while (area == "" || Integer.parseInt(area) <= 0) {
                    System.out.println("Nah, this won't do, come on:");
                    area = scanner.nextLine();
                }
                flat.setArea(Integer.parseInt(area));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Area is supposed to be a round number!");
            }
        }
    }

    public void callNumberOfRooms(Flat flat, Scanner scanner) {
        System.out.println("Enter the total number of rooms (more than 0):");
        while (true) {
            try {
                String numberOfRooms = scanner.nextLine();
                while (numberOfRooms == ""|| Long.parseLong(numberOfRooms) <= 0) {
                    System.out.println("No way bro:");
                    numberOfRooms = scanner.nextLine();
                }
                flat.setNumberOfRooms(Long.parseLong(numberOfRooms));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Number of rooms is supposed to be a round number!");
            }
        }
    }

    public void callNumberOfBathrooms(Flat flat, Scanner scanner) {
        System.out.println("Enter the total number of bathrooms (more than 0):");
        while (true) {
            try {
                String numberOfBathrooms = scanner.nextLine();
                while (numberOfBathrooms == "" || Long.parseLong(numberOfBathrooms) <= 0) {
                    System.out.println("Nonononono i said more than 0:");
                    numberOfBathrooms = scanner.nextLine();
                }
                flat.setNumberOfBathrooms(Long.parseLong(numberOfBathrooms));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Number of bathrooms is supposed to be a round number!");
            }
        }
    }

    public void callTimeToMetroByTransport(Flat flat, Scanner scanner) {
        System.out.println("Enter the time to metro by transport (more than 0):");
        while (true) {
            String timeToMetroByTransport = scanner.nextLine();
            while (timeToMetroByTransport == "" || Double.parseDouble(timeToMetroByTransport) <= 0) {
                System.out.println("Oops, it seems like u failed... But don't be discouraged, just try again! :");
                timeToMetroByTransport = scanner.nextLine();
            }
            flat.setTimeToMetroByTransport(Double.parseDouble(timeToMetroByTransport));
            break;
        }
    }

    public void callFurnish (Flat flat, Scanner scanner) {
        System.out.println("Please choose a furnish type out of these variants: designer, none, fine, bad, little.");
            while (flat.getFurnish() == null){
                String option = scanner.nextLine();
                switch (option) {
                    case ("designer"):
                        flat.setFurnish(Furnish.DESIGNER);
                        break;
                    case ("none"):
                        flat.setFurnish(Furnish.NONE);
                        break;
                    case ("fine"):
                        flat.setFurnish(Furnish.FINE);
                        break;
                    case ("bad"):
                        flat.setFurnish(Furnish.BAD);
                        break;
                    case ("little"):
                        flat.setFurnish(Furnish.LITTLE);
                        break;
            }
        }
    }

    public void callHouse (Flat flat, Scanner scanner) {
        House house = new House();
        System.out.println("Please name the house:");
        while (true) {
            String name = scanner.nextLine();
            while (name == "") {
                System.out.println("Incorrect! One more try:");
                name = scanner.nextLine();
            }
            house.setName(name);
            break;
        }
        System.out.println("Please provide a year (maximum — 638):");
        while (true) {
            try {
                String year = scanner.nextLine();
                while (year == "" || Integer.parseInt(year) > 638) {
                    System.out.println("Incorrect! One more try:");
                    year = scanner.nextLine();
                }
                house.setYear(Integer.parseInt(year));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sire, year should be a round number!");
            }
        }
        System.out.println("Please provide the number of lifts (minimum — 1):");
        while (true) {
            try {
                String lifts = scanner.nextLine();
                while (lifts == "" || Long.parseLong(lifts) < 1) {
                    System.out.println("Incorrect! One more try:");
                    lifts = scanner.nextLine();
                }
                house.setNumberOfLifts(Long.parseLong(lifts));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sire, number of lifts should be a round number!");
            }
        }
        flat.setHouse(house);
    }

    @Override
    public Komanda execute(LinkedHashMap <Long, Flat> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        Flat flat = new Flat();
        genId(collection, flat);
        callName(flat, scanner);
        callCoordinates(flat, scanner);
        genDate(flat);
        callArea(flat, scanner);
        callNumberOfRooms(flat, scanner);
        callNumberOfBathrooms(flat, scanner);
        callTimeToMetroByTransport(flat, scanner);
        callFurnish(flat, scanner);
        callHouse(flat, scanner);
        // bakhnut' klyuch
        collection.put(Long.valueOf(value), flat);
        System.out.println("Collection updated! Good job!");
        return null;
    }
}
