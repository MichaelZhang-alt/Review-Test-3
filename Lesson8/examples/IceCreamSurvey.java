package Lesson8.examples;

public class IceCreamSurvey {

    public static void main(String[] args) {
        String survey[][]
                = {
                    {"James",
                        "Chocolate"},
                    {"Dillan",
                        "Chocolate"},
                    {"Mike",
                        "Strawberry"},
                    {"Justin",
                        "Strawberry"},
                    {"Evan",
                        "Chocolate"},
                    {"Giu",
                        "Strawberry"},
                    {"Josh",
                        "Chocolate"}
                };
        //print the survey results
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print(j == 0 ? "Name: " : "Flavour: ");
                System.out.print("\t" + survey[i][j] + "\t");
            }
            System.out.println("");
        }

        String cpeople[] = filter(survey, "Chocolate");
        String vpeople[] = filter(survey, "Vanilla");
        String speople[] = filter(survey, "Strawberry");

        showresults(cpeople, "Chocolate");
        showresults(vpeople, "Vanilla");
        showresults(speople, "Strawberry");

    }

    public static void showresults(String list[], String flav) {
        System.out.println("Here is a list of people who like " + flav);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ",");
        }
    }

    public static String[] filter(String data[][], String flav) {
        String result = "";
        for (int i = 0; i < data.length; i++) {
            if (flav.equals(data[i][1])) {
                result += data[i][0] + ",";
            }
        }
        return result.split(",");
    }

}
