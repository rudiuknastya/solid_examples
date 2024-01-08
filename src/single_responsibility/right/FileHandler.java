package single_responsibility.right;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public String getFileText(String fileName){
        File file = new File(fileName);
        StringBuilder words = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                String[] lineWords = line.split("[^a-zA-Z0-9]+");
                for (String word : lineWords) {
                    words.append(word);
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return String.valueOf(words);
    }
}
