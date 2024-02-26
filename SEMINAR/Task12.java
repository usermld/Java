package SEMINAR;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Task12
 */
public class Task12 {

    public static void main(String[] args) {

        ArrayList<String> list = getListPlanets();
        System.out.println(list);
        printRepeatPlanets(list);
        deletRepeat(list);
        System.out.println(list);

    }

    private static ArrayList<String> getListPlanets() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Меркурий");
        list.add("Венера");
        list.add("Земля");
        list.add("Марс");
        list.add("Юпитер");
        list.add("Сатурн");
        list.add("Уран");
        list.add("Нептун");
        list.add("Плутон");
        list.add("Уран");
        list.add("Уран");
        list.add("Нептун");
        list.add("Плутон");
        list.add("Земля");
        list.add("Марс");
        list.add("Юпитер");
        list.add("Сатурн");

        return list;
    }

    private static void printRepeatPlanets(ArrayList<String> planets) {

        ArrayList<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);
        System.out.println(sortedPlanets);

        int count = 1;
        String planet = sortedPlanets.get(0);
        for (int i = 1; i < sortedPlanets.size(); i++) {

            if (sortedPlanets.get(i).equals(planet)) {
                count++;
            } else {
                System.out.println(planet + " -> " + count);
                planet = sortedPlanets.get(i);
                count = 1;
            }

        }
        System.out.println(planet + " -> " + count);
    }

    public static void deletRepeat(ArrayList<String> planets) {
        
    //     for (int i = 0; i < planets.size(); i++) {
    //         String currentPlanet = planets.get(i);
    //         for (int j = i + 1; j < planets.size(); j++) {
    //             if (planets.get(j).equals(currentPlanet)) {
    //                 planets.remove(j);
    //                 j--;
    //             }
    //         }
    //     }
          for (int i = 0; i < planets.size(); i++) {
            String currentPlanet = planets.get(i);
            for (int j = planets.size() - 1; j > i; j--) {
                if (planets.get(j).equals(currentPlanet)) {
                    planets.remove(j);
                    j--;
            }
        }
    }
    }
}
