
import java.io.*;
import java.util.Scanner;

public class ParticipantFileStorage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            File folder = new File("data");
            folder.mkdir();

            File file = new File(folder, "participants.txt");

            BufferedWriter bw = new BufferedWriter(
                new FileWriter(file, true)
            );

            System.out.print("Enter Participant Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Enter Event Name: ");
            String event = sc.nextLine();

            bw.write("Participant Name: " + name);
            bw.newLine();

            bw.write("Email: " + email);
            bw.newLine();

            bw.write("Phone Number: " + phone);
            bw.newLine();

            bw.write("Event Name: " + event);
            bw.newLine();

            bw.write("-------------------------");
            bw.newLine();

            bw.close();

            System.out.println("Participant saved successfully!");
            System.out.println("File location: data/participants.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}