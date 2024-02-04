import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadInputText {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);

            // process the contents of this line
            int count = 0;
            while (lineScan.hasNext()) {
                String word = lineScan.next();
                count++;
            }
            System.out.println("Line has " + count + " words");
        }
    }
}