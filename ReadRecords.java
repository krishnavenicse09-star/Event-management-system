
import java.io.*;

public class ReadRecords {

    public static void main(String[] args) {

        readFile("data/events.txt", "EVENT RECORDS");

        readFile("data/participants.txt", "PARTICIPANT RECORDS");
    }

    public static void readFile(String fileName, String title) {

        File file = new File(fileName);

        System.out.println("\n===== " + title + " =====");

        if (!file.exists()) {
            System.out.println("File not found: " + fileName);
            return;
        }

        try (BufferedReader br = new BufferedReader(
                new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}