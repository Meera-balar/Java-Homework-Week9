package javahomeworkweek9;

//Write a Java program to reverse an array of integer values.
public class Programme3_ReverseArray {
    public static void main(String[] args) {
        reverseArray();
    }

    public static void reverseArray() {
        // array syntax
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array Is : ");
        //for loop for original order array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Array in reverse order is : ");
        //for loop for reverse array order
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
