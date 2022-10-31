package javahomeworkweek9;
//Write a Java program to iterate through all elements in an array list using Iterator.
import java.util.HashSet;
import java.util.Iterator;

public class Programme5_ArrayListIterator {
    public static void main(String[] args) {
        arrayElementsIterator();
    }
    public static void arrayElementsIterator(){
        // HashSet syntax.
        HashSet<String> list = new HashSet<>();
        // Programming language list set
        list.add("MySQL");
        list.add("Python");
        list.add("JAVA");
        list.add("HTML");
        list.add("PHP");

        // Iterating ArrayList using Iterator and store it into itr variable name
        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){
            // Print the elements of ArrayList
            System.out.println(itr.next());
        }
    }

}
