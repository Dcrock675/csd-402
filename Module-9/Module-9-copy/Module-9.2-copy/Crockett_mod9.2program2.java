
/**
 * Drew Crockett
 * 3/1/26
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {

            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists. Appending numbers.");
            }

            FileWriter writer = new FileWriter(file, true);

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100);
                writer.write(number + " ");
            }

            writer.close();

            System.out.println("Numbers written to file.");

            Scanner reader = new Scanner(file);

            System.out.println("File contents:");

            while (reader.hasNext()) {
                System.out.print(reader.next() + " ");
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}