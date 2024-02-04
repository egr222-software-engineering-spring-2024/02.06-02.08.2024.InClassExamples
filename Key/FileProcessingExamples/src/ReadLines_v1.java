import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLines_v1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Tokens.txt"));

        while (input.hasNextLine()) {
            String line = input.nextLine();  // will not crash!!
            System.out.println("next line is \"" + line + "\"");
        }
    }
}