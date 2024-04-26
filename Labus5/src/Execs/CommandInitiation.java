package Execs;

import Komandy.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Класс реализующий управление коллекцией
 */
public class CommandInitiation {

    public static void run(LinkedHashMap collection, Scanner scanner, String fileCollection) {

        while(true) {
                List<String> orders;
            try {
                String string = scanner.nextLine().trim();
                orders = new ArrayList<>(Arrays.asList(string.split(" ")));
                System.out.println(orders);
                if (orders.size() == 1) {
                    orders.add("null");
                }
                System.out.println(orders);
                ((Komanda) CommandCreation.komandy().get(orders.get(0))).execute(collection, scanner, fileCollection, orders.get(1));
                System.out.println(orders);
                if (orders.get(0).equals("exit")){
                    System.out.println("Завершение работы.");
                    break;
                }
            } catch (FileNotFoundException e){
                System.out.println("File not found, bro :(");
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NoSuchElementException e){
                scanner.close();
                System.out.println("Entry error: " + e.getMessage());
                break;
            } catch (NullPointerException e){
                System.out.println("No such command, type 'help' to see the list of available commands.");
            }
        }
    }
}
