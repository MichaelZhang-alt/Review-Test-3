package Lesson8.examples;

public class StudentMarks {

    public static void main(String[] args) {
        int marks[][] = {{78, 68, 79, 98}, {34, 32, 56, 78}, {79, 98, 80, 90}};
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println(""); //end of row, go to new line
        }
        System.out.println("Calling add10 method");
        add10(marks); //sending in 2d marks array
        System.out.println("Did it change here too");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println(""); //end of row, go to new line
        }
        System.out.println("Does it work for single numbers");
        int x = 10;
        add10(x);
        System.out.println(x);
        String result = x == 10 ? "NO" : "YES";
        System.out.println(result);
        System.out.println("The average is " + getAvg(marks));

        int stavg[] = getRowAvg(marks);
        System.out.println("Student averages are: ");
        for (int i = 0; i < stavg.length; i++) {
            System.out.println(stavg[i]);
        }
    }

    public static void add10(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += 10;
            }
        }
    }

    public static void add10(int x) {
        x += 10;
    }

    public static int getAvg(int arr[][]) {
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                avg += arr[i][j];
            }
        }
        return avg / (arr.length * arr[0].length); //wont work for ragged arrays
    }

    public static int[] getRowAvg(int arr[][]) {
        int avg[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                avg[i] += arr[i][j];
            }
            avg[i] = avg[i] / arr[i].length;
        }
        return avg;
    }
    
}
