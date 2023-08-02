import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

    public class Backup {
        public static void main(String[] args) {
            createBackup("./backup");
        }

        public static void createBackup(String backupFolderPath) {
            File backupFolder = new File(backupFolderPath);
            if (!backupFolder.exists()) {
                backupFolder.mkdir();
            }

            File sourceFolder = new File(".");
            File[] files = sourceFolder.listFiles();

            for (File file : files) {
                if (file.isFile()) {
                    try {
                        Files.copy(file.toPath(), new File(backupFolder.getAbsolutePath() + "/" + file.getName()).toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }