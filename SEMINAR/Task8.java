package SEMINAR;

import java.io.FileWriter;

public class Task8 {
    public static void main(String[] args) {
        int repeat = 100;
        String str = repeatWords("TEST", repeat);
        writeToFile(str, "test.txt");

    }
    public static String repeatWords(String word, int repeat) {
        
        StringBuilder sb = new StringBuilder();

        
        for (int i = 0; i < repeat; i++) {
            sb.append(word).append("\n");
        }
        
        
        
        return sb.toString();
    }
    public static void writeToFile(String str, String fileName) {
        
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(str);
            System.out.println("done");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error writing file");
        }
        // FileWriter fw = null;
        
        // try {
        //     fw = new FileWriter(fileName);
        //     fw.write(str);
            
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // finally {
        //     fw.close();
        // }
    }
}
