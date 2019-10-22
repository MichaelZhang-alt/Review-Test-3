package Lesson8.examples;

import java.util.Scanner;

public class Attendance {

    public static void main(String[] args) {
        String attendance[][] = {
            {"Joe", "S09", "S12", "O14"},
            {"Amy"},
            {"Sue", "S24"},
            {"BOB", "S05", "S23", "O11", "O23"}
        };
        //PRINT ATTENDANCE REPORT -> and 2D.length = number of rows going down
        int abs[] = countAbs(attendance);
        for (int i = 0; i < attendance.length; i++) {
            for (int j = 0; j < attendance[i].length; j++) {
                System.out.print(attendance[i][j] + "\t");
            }
            System.out.println("Total absences = " + abs[i]); //go to next student
        }
        while (true) {
            System.out.println("\n\n----Search\n");
            Scanner s = new Scanner(System.in);
            System.out.print("Enter Nmae to search or \"x\" to quit > ");
            String name = s.nextLine();
            if (name.equals("x")) {
                break;
            }
            String dates[] = search(attendance, name);
            if (dates.length > 0) {
                System.out.println("Here is a list of dates " + name + " was absent: ");
                for (int i = 0; i < dates.length; i++) {
                    System.out.print(dates[i] + " | ");
                }
            }
            s.nextLine(); // clear scanner
        }
    }

    public static String[] search(String data[][], String nm) {
        String list = "";
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equals(nm)) {
                for (int j = 0; j < data[i].length; j++) { //start at first absence = location 1
                    list += data[i][j] + ","; //list = all absences starting at location 1
                }
            }
        }
        if (list.length() == 0) {
            return new String[0];
        } else {
            return list.split(",");
        }
    }

    public static int[] countAbs(String data[][]) {
        int abs[] = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            abs[i] = data[i].length - 1; //-1 cuz name doesnt count as absence
        }
        return abs;
    }

}
