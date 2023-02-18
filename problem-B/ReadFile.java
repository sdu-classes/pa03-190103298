import java.util.*;
import java.io.*;

public class ReadFile {
    public static String[] readFile(String filename) throws FileNotFoundException{
        File file = new File(filename);
        Scanner in = new Scanner(file);
        
        String[] lines = new String[1000];
        int lineCounter = 0;

        while(in.hasNextLine()) {
            String line = in.nextLine();
            lines[lineCounter] = line;
            lineCounter++;
        }

        
        System.out.println(filename);

        return lines;
    }
    public static void main(String[] args) {
        try {
        String relPath = "files" + File.separator +"text.txt";
        String absPath = "problem-B\files";
        String[] lines = readFile(relPath);
        for(String line: lines) {
            if(line == null) {
                break;
            }
            System.out.println(line);
        }
        } catch(FileNotFoundException exc) {
            System.out.println("File doesn't exist");
        }            
    }
}