package javahomeworkweek9;
//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets. Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
import java.util.HashSet;


public class Programme8_StoreIntegerNumber {
    public static void main(String[] args) {
        storingIntegerNumber();
    }

    public static void storingIntegerNumber() {
        // HashSet syntax.
        HashSet<Integer> list = new HashSet<>();
        //1 to 10 list set
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        // Printing list
        System.out.println(list);

        //list1 set using HashSet
        HashSet<Integer> list1 = new HashSet<>();
        list1.add(4);
        list1.add(7);
        list1.add(8);

        // for loop to check whether list set contains another set of list1
        for (int number : list1) {
            if (list.contains(number)) {
                System.out.println(number + " = " + "Number is in Set 1 to 10 ");
            } else {
                System.out.println("Number is not in set.");
            }
        }
    }
}
