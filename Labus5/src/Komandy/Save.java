package Komandy;

import Klassy.Flat;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;


public class Save extends Komanda{
    public Save(){
        setTitle("save");
        setDescription(" — saves the created element;");
    }

    @Override
    public Komanda execute (LinkedHashMap <Long, Flat> collection, Scanner scanner, String fileCollection, String value) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileCollection)))) {
            //sooqa
            for (int i = 0; i < collection.size(); i++){
                writer.write(collection.get(i).toString());
                writer.write("\n");
            }
        } catch (IOException e) {
            // Обработка возможных исключений ввода-вывода
            e.printStackTrace();
        }
        System.out.println("Progress saved!");
        return null;
    }
}
