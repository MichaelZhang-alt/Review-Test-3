package Lesson8.examples;

import java.util.Scanner;

public class ParallelSearch {

    public static void main(String[] args) {
        String name[] = {"Amy", "Joe", "Bob", "Sue", "Guy"};
        //marks are in same order as names - parallel
        int mark[] = {78, 62, 87, 91, 44};
        Scanner scan = new Scanner(System.in);
        String search;
        System.out.println("Enter name to search for age > ");
        search = scan.nextLine();

        //search strategy
        int location = -1;
        for (int i = 0; i < name.length; i++) {
            if (search.equals(name[i])) {
                location = i;
            }
        }
        if (location == -1) {
            System.out.println(search + " was not found in list.");
        } else {
            System.out.format("%s's mark is %d\n", search, mark);
        }
    }

}
