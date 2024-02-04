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
import java.util.Scanner;

/*
    An update to the HoursWorked program that allows the user to enter an ID
    and outputs the hours worked for that employee.
 */
public class HoursWorked_v2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        int desiredID = console.nextInt();
        boolean found = false;

        Scanner input = new Scanner(new File("hours.txt"));

        while (input.hasNextLine()) {
            // process one employee
            // line1 = "123 Susan 12.5 8.1 7.6 3.2"
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);

            int id = lineScan.nextInt();
            if (id == desiredID) {
                found = true;
                String name = lineScan.next();
                double totalHours = 0.0;
                int days = 0;
                while (lineScan.hasNextDouble()) {
                    totalHours += lineScan.nextDouble();
                    days++;
                }
                // Susan (ID#123) worked 31.4 hours (7.85 hours/day)
                System.out.println(name + " worked " + totalHours + " hours (" + totalHours / days + " hours/day)");
            }
        }

        if (!found) {
            System.out.println("ID #" + desiredID + " not found.");
        }
    }
}
