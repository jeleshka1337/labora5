package Execs;

import Komandy.*;


import java.util.HashMap;
import java.util.Map;

/**
 * Класс с функцией создания коллекции команд
 */
public class CommandCreation {
    public static Map komandy(){
        Insert insert = new Insert();
        Save save = new Save();
        Map<String, Komanda> commandsList = new HashMap<>();
        commandsList.put(insert.getTitle(), insert);
        commandsList.put(save.getTitle(), save);
        return commandsList;
    }

}