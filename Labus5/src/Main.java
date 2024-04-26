import Execs.CommandInitiation;
import Execs.Input;
import Klassy.Flat;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileCollection = "SnusEater.csv";
        LinkedHashMap<Long, Flat> collection = Input.input(fileCollection);
        System.out.println("Awaiting orders:");
        Scanner scanner = new Scanner(System.in);
        CommandInitiation.run(collection, scanner, fileCollection);
    }
}