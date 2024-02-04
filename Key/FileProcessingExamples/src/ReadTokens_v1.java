import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTokens_v1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Tokens.txt"));

        double d = input.nextDouble(); // 16.2
        System.out.println("d = " + d + " (should be 16.2)");

        String s = input.next();  // 23.5
        System.out.println("s = " + s + " (should be 23.5)");

        d = input.nextDouble(); // 19.1
        System.out.println("d = " + d + " (should be 19.1)");

        d = input.nextDouble(); // 7.4
        System.out.println("d = " + d + " (should be 7.4)");

        d = input.nextDouble(); // 22.8
        System.out.println("d = " + d + " (should be 22.8)");

        d = input.nextDouble(); // 18.5
        System.out.println("d = " + d + " (should be 18.5)");

        d = input.nextDouble(); // -1.8
        System.out.println("d = " + d + " (should be -1.8)");

        d = input.nextDouble(); // 14.9
        System.out.println("d = " + d + " (should be 14.9)");

        // there are no more tokens...attempting another read will cause an error
        if (input.hasNext()) {
            System.out.println("unexpected token: " + input.next());
        } else {
            System.out.println("no more tokens");
        }
    }
}
