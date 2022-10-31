package javahomeworkweek9;
//Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.
import java.util.ArrayList;

public class Programme4_ArrayColor {
    public static void main(String[] args) {
        colorNameList();
    }

    public static void colorNameList() {
        //ArrayList syntax
        ArrayList<String> colorList = new ArrayList();
        //Color name list set
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Pink");
        colorList.add("Yellow");
        // Iterating and display using for loop
        for (String colorName : colorList) {
            System.out.println("Color is : " + colorName);
        }
    }
}


