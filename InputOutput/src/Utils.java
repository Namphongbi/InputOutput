import java.io.*;
import java.nio.file.*;
public class Utils {
    public static String readContentFromFile(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
    public static void writeContentToFile(String path, String content) throws IOException {
        FileWriter fileWriter = new FileWriter(path, false);
        fileWriter.write(content);
        fileWriter.close();
    }
    public static void appendContentToFile(String path, String content) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);
        fileWriter.write(content);
        fileWriter.close();
    }
    public static File findFileByName(String folderPath, String fileName) {
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().equals(fileName)) {
                    return file;
                }
            }
        }
        return null;
    }

}
