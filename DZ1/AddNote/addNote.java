package AddNote;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class addNote {
    public static void Note() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите заметку: ");
        String note = scanner.nextLine();

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));

        try (FileWriter writer = new FileWriter("Data/note.txt", true)) {
            writer.write(timestamp + " -> " + note + "\n");
            writer.flush();
            System.out.println("Заметка успешно добавлена в файл.");
        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл: " + ex.getMessage());
        }
    }
}