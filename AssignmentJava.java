import java.util.Scanner;
import java.util.ArrayList;

public class AssignmentJava {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // using scanner object for user input

        System.out.println("Please enter your unit name: ");
        String userName = sc.nextLine();
        System.out.println("The unitname is:  " + userName);
        ArrayList<Double> unitMarks = new ArrayList<Double>();       // using arraylist object to hold multiple array items
        do {                                                          // using do-while loop to display students marks
            System.out.println("Please enter your obtained unit marks of the respective units: ");
            Double userMarks = sc.nextDouble();
            if (userMarks > 0 && userMarks < 100) {
                unitMarks.add(userMarks);
            } else {
                System.out.println("Please input the marks between 0 and 100");
            }
        } while (unitMarks.size() != 25);
        System.out.println(userName);
        System.out.println("The marks are listed below.");
        unitMarks.forEach(x -> {
            System.out.println(x);
        });
        Double highestMark = unitMarks.get(0);                          //instantiating highest mark
        Double lowestMark = unitMarks.get(0);                           // instantiating lowest mark
        for (int i = 0; i < unitMarks.size(); i++) {                    // using for loop logic for highest and lowest marks
            if (highestMark < unitMarks.get(i)) {
                highestMark = unitMarks.get(i);
            }
            if (lowestMark > unitMarks.get(i)) {
                lowestMark = unitMarks.get(i);
            }
        }
        System.out.println("The highest mark is: " + highestMark);
        System.out.println("The lowest mark is: " + lowestMark);
        Double calculate = 0.0;
        for (int i = 0; i < unitMarks.size(); i++) {
            calculate += unitMarks.get(i);
        }
        double meanCalculate = calculate / unitMarks.size();
        System.out.println("The calculated mean is : " + meanCalculate);
        double summationStd = 0.0;
        for (int i = 0; i < unitMarks.size(); i++) {     //(x-mean)**2
            double someValue = Math.pow((unitMarks.get(i) - meanCalculate), 2);
            summationStd += someValue;
        }
        int divisorValue = unitMarks.size() - 1;             // N-1
        double someValue = summationStd / divisorValue;
        double stDeviation = Math.pow(someValue, 0.5);
        System.out.println("The standard deviation is: " + stDeviation);    // displaying the standard deviation

    }
}

