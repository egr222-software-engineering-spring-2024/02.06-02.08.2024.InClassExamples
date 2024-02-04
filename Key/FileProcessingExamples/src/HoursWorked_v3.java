/*
    This program reads an input file of hours worked

    123 Susan 12.5 8.1 7.6 3.2
    456 Brad 4.0 11.6 6.5 2.7 12
    789 Jenn 8.0 8.0 8.0 8.0 7.5

    and outputs each employee's hours

    Susan (ID#123) worked 31.4 hours (7.85 hours/day)
	Brad (ID#456) worked 36.8 hours (7.36 hours/day)
	Jenn (ID#789) worked 39.5 hours (7.90 hours/day)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// Processes an employee input file and outputs each employee's hours.


public class HoursWorked_v3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("hours.txt"));
//        PrintStream out = System.out;
        PrintStream out = new PrintStream(new File("hours_out.txt"));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            processEmployee(out, line);
        }
    }

    public static void processEmployee(PrintStream out, String line) {
        Scanner lineScan = new Scanner(line);
        int id = lineScan.nextInt();          // e.g. 456
        String name = lineScan.next();        // e.g. "Greg"
        double sum = 0.0;
        int count = 0;
        while (lineScan.hasNextDouble()) {
            sum = sum + lineScan.nextDouble();
            count++;
        }

        double average = sum / count;
        out.println(name + " (ID#" + id + ") worked " +
                sum + " hours (" + average + " hours/day)");
    }
}