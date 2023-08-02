import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

    public class Main {
        public static void main(String[] args) {
            int[] gameField = {1, 0, 2, 3, 1, 0, 2, 0, 3};
            writeGameFieldToFile(gameField, "gameField.txt");
            int[] importedGameField = readGameFieldFromFile("gameField.txt");
            displayGameField(importedGameField);
        }

        public static void writeGameFieldToFile(int[] gameField, String filePath) {
            try {
                FileWriter writer = new FileWriter(filePath);
                for (int i = 0; i < gameField.length; i++) {
                    writer.write(String.valueOf(gameField[i]));
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static int[] readGameFieldFromFile(String filePath) {
            try {
                String content = Files.readString(Paths.get(filePath));
                int[] gameField = new int[content.length()];
                for (int i = 0; i < content.length(); i++) {
                    gameField[i] = Integer.parseInt(String.valueOf(content.charAt(i)));
                }
                return gameField;
            } catch (IOException e) {
                e.printStackTrace();
                return new int[0];
            }
        }

        public static void displayGameField(int[] gameField) {
            for (int i = 0; i < gameField.length; i++) {
                char symbol;
                switch (gameField[i]) {
                    case 0:
                        symbol = '•';
                        break;
                    case 1:
                        symbol = 'X';
                        break;
                    case 2:
                        symbol = 'O';
                        break;
                    default:
                        symbol = ' ';
                        break;
                }
                System.out.print(symbol + " ");
                if ((i + 1) % 3 == 0) {
                    System.out.println();
                }
            }
        }
    }

