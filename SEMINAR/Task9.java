package SEMINAR;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Task9 {
    private static Logger logger = Logger.getLogger(Task9.class.getName());
    public static void main(String[] args) {
        configLogger();
        
        String[] contetnFolder = getContentFolder(".");
        writeToFile(contetnFolder, "file.txt");
    }
    
    public static String[] getContentFolder(String folderName) {
        
        File folder = new File(folderName);
        return folder.list();
    }

    public static void writeToFile(String[] strs, String fileName) {
        
        try (FileWriter fw = new FileWriter(fileName)) {
            for (String str : strs) {
                fw.write(str);
                fw.write(System.lineSeparator());
            }
            
            
            logger.log(Level.INFO, "done");
        } catch (Exception e) {
            logger.warning("Error writing file");
        }
        
    }
    public static void configLogger() {
        try {
            FileHandler fh =  new FileHandler("log.txt", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (Exception e) {
            //logger.log(Level.WARNING, "Error writing file");
        }
    }
}
