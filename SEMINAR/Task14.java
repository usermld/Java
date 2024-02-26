package SEMINAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task14 {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();

        ArrayList<String> general1 = new ArrayList<>(Arrays.asList("Роман", "Книга1", "Книга2", "Книга3"));
        ArrayList<String> general2 = new ArrayList<>(Arrays.asList("Новэлла", "Книга4", "Книга5", "Книга6"));
        ArrayList<String> general3 = new ArrayList<>(Arrays.asList("Триллер", "Книга7", "Книга8", "Книга9"));

        catalog.add(general1);
        catalog.add(general2);
        catalog.add(general3);

        for (ArrayList<String> general : catalog) {
            System.out.println(general);
        }

        
    }
}
