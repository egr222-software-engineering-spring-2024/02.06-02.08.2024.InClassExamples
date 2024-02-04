import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLines_v2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Tokens2.txt"));

        while (input.hasNextLine()) {
            String line = input.nextLine();  // will not crash!!
            System.out.println("next line is \"" + line + "\"");

            Scanner strScan = new Scanner(line);
            int num = strScan.nextInt();  // 15
            System.out.println("num is " + num);

            double num2 = strScan.nextDouble();  // 3.2
            System.out.println("num2 is " + num2);

            String word = strScan.next();  // hello
            System.out.println("word is " + word);
        }
    }
}