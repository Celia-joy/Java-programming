
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileStreamDemo {

    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // 1. Write text to the source file
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(sourceFile, StandardCharsets.UTF_8))) {

            writer.write("Hello, Java file handling!");
            writer.newLine();
            writer.write("We are learning buffered streams.");
            writer.newLine();
            writer.write("This is our file-copying practical.");

            System.out.println("Source file written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            return;
        }

        // 2. Read and display the source file
        System.out.println("\nSource file contents:");

        try (BufferedReader reader = new BufferedReader(
                new FileReader(sourceFile, StandardCharsets.UTF_8))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // 3. Copy the source file to the destination file
        try (BufferedReader reader = new BufferedReader(
                    new FileReader(sourceFile, StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(
                    new FileWriter(destinationFile, StandardCharsets.UTF_8))) {

            char[] buffer = new char[4096];
            int charactersRead;

            while ((charactersRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, charactersRead);
            }

            System.out.println("\nFile copied successfully.");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
            return;
        }

        // 4. Verify the destination file
        System.out.println("\nDestination file contents:");

        try (BufferedReader reader = new BufferedReader(
                new FileReader(destinationFile, StandardCharsets.UTF_8))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error verifying copy: " + e.getMessage());
        }
    }
}
