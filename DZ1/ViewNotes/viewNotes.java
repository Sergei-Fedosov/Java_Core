package ViewNotes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class viewNotes {
public static void viewNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Data/note.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
        } catch (IOException ex) {
        System.out.println("Ошибка при чтении файла: " + ex.getMessage());
        }
    }
}