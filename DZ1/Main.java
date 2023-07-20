
import ViewNotes.viewNotes;
import java.util.Scanner;
import static AddNote.addNote.Note;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить заметку");
            System.out.println("2. Посмотреть заметки");
            System.out.println("3. Выйти");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Note();
                    break;
                case 2:
                    viewNotes.viewNotes();
                    break;
                case 3:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}