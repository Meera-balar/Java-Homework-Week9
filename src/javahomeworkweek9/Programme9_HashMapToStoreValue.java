package javahomeworkweek9;
//Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map.
import java.util.HashMap;
import java.util.Map;

public class Programme9_HashMapToStoreValue {
    public static void main(String[] args) {
        mapForIterateValues();
    }
    public static void mapForIterateValues(){
        // HashMap syntax
        HashMap<String , Integer> list = new HashMap<>();
        list.put("Manisha",1);  //Here key ="Manisha" and value = 1.
        list.put("Krupa",2);
        list.put("Siddhi",3);
        list.put("Hiren",4);
        list.put("Kishan",5);
        list.put("Harshid",6);
        list.put("Nauman",7);

        //Iterate and display people name list
        for(Map.Entry<String,Integer> list1 : list.entrySet()){
            System.out.println(list1);
        }
    }
}
