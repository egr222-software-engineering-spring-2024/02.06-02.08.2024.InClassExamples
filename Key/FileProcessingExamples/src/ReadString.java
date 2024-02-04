import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) throws FileNotFoundException {
        String text = "15   3.2 hello   9  27.5";  // will not crash!!
        System.out.println("\"" + text + "\"");

        Scanner strScan = new Scanner(text);
        int num = strScan.nextInt();  // 15
        System.out.println("num is " + num);

        double num2 = strScan.nextDouble();  // 3.2
        System.out.println("num2 is " + num2);

        String word = strScan.next();  // hello
        System.out.println("word is " + word);
    }
}