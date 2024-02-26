package SEMINAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class Task13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("null", "1", "eie", "lel", "lol", "2", "5"));
        deletNumbers(list);
        System.out.println(list);
        System.out.println();
        deletNumIter(list);
        System.out.println(list);
 
    }

    private static void deletNumIter(ArrayList<String> list) {
        Iterator<String> istr = list.iterator();
        while (istr.hasNext()) {
            String elem = istr.next();
            if (isNum(elem)) {
                istr.remove();
            }
        }
    }

    private static void deletNumbers(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
           if (isNum(list.get(i))) {
            list.remove(i);
            i--;
           }
        }
    }

    public static Boolean isNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
        
        
        
    }
}
