import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTokens_v2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Tokens.txt"));

        while (input.hasNext()) {
            String token = input.next();  // will not crash!!
            System.out.println("next token is \"" + token + "\"");
        }
    }
}