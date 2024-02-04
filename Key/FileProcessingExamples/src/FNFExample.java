import java.io.*;
import java.util.*;

public class FNFExample {

//    public static void main(String[] args) {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("data.txt"));
        String text = input.next();
        System.out.println(text);
    }
}