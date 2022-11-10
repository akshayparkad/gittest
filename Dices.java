import java.io.*;
import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        Random ran = new Random();
        int number = 0;
        try (PrintWriter file = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("test1.txt")));
        ) {

            for (int i = 1; i <= 5000000; i++) {
                number = ran.nextInt(5000000) + 1;
                file.print(number + ",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File test1.txt created!");
    }
}