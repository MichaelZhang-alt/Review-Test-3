
package Lesson8.examples;

public class SwimTimes {

    public static void main(String[] args) {
        String athletes[] = {"BOB", "SUE", "ANDY", "JOE"};
        double times[][] = {
            {12.8,14.2,11.7},
            {13.8},
            {10.9,9.8,10.7,12.2},
            {12.8,10.4}
        };
        //get each athletes avg time
        double avgtime[] = getAvg(times);
        
        for (int i = 0; i < athletes.length; i++){
            System.out.format("%s\tAvg Time: %.2f \tTimes: ", athletes[i], avgtime[i]);
            for (int j = 0; j < times[i].length; j++) {
                System.out.print(times[i][j] + "|");
            }
            System.out.println("");//athlete
        }
    }
    public static double[] getAvg(double t[][]){
        double avg[] = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                avg[i] += t[i][j]; //summing up each row
            }
            avg[i] = avg[i] / t[i].length;
        }
        return avg;
    }
    
}
