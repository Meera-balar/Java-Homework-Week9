package javahomeworkweek9;
//Write a Java program to test an array list is empty or not. Define array list with underground tube names
import java.util.ArrayList;

public class Programme7_IsEmptyArray {
    public static void main(String[] args) {
        isEmptyArray();
    }

    public static void isEmptyArray() {
        ArrayList<String> undergroundTubeNames = new ArrayList<>();
        undergroundTubeNames.add("Jubilee");
        undergroundTubeNames.add("Victoria");
        undergroundTubeNames.add("Elizabeth");
        undergroundTubeNames.add("Piccadilly");
        undergroundTubeNames.add("Central");

        //Printing list of underground tube names
        System.out.println("Underground tube name is : " + undergroundTubeNames);
        // checking does list is empty or not by using if-else
        if (undergroundTubeNames.isEmpty()) {
            System.out.println("Underground tube names is empty.");
        } else {
            System.out.println("Underground tube names is  not empty.");
        }
        // removing all values from list and making it empty
        undergroundTubeNames.removeAll(undergroundTubeNames);

        System.out.println("Underground tube name is : " + undergroundTubeNames);
        // checking does list is empty or not by using if-else
        if (undergroundTubeNames.isEmpty()) {
            System.out.println("Underground tube names is empty.");
        } else {
            System.out.println("Underground tube names is  not empty.");
        }

    }

}
