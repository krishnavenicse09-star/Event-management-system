
import java.io.*;
import java.util.Scanner;

public class EventFileStorage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            File folder = new File("data");
            folder.mkdir();

            File file = new File(folder, "events.txt");

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter Event Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Event Date: ");
            String date = sc.nextLine();

            System.out.print("Enter Event Venue: ");
            String venue = sc.nextLine();

            bw.write("Event Name: " + name);
            bw.newLine();

            bw.write("Event Date: " + date);
            bw.newLine();

            bw.write("Event Venue: " + venue);
            bw.newLine();

            bw.write("-------------------------");
            bw.newLine();

            bw.close();

            System.out.println("Event saved successfully!");
            System.out.println("File location: data/events.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}