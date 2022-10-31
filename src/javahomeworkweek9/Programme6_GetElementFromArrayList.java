package javahomeworkweek9;
//Write a Java program to retrieve an element (at a specified index) from a given array list
import java.util.ArrayList;

public class Programme6_GetElementFromArrayList {
    public static void main(String[] args) {
        getSpecificElementFromArray();
    }
    public static void getSpecificElementFromArray(){
        //Arraylist Syntax
        ArrayList<Character> list = new ArrayList<>();
        //List of array
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        //Iterate and display list of character
        for(Character letter : list){
            System.out.println("Character list is : " + letter);
        }
        // Printing values at specific index
        System.out.println("Elements at specific index 3 is : " + list.get(3));
        System.out.println("Elements at specific index 4 is : " + list.get(4));
    }
}
