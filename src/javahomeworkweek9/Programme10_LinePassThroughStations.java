package javahomeworkweek9;
//Write the programme that tell you which line pass through particular stations. Just use Zone 1 stations name.
import java.util.*;

public class Programme10_LinePassThroughStations {

    // main method
    public static void main(String[] args) {
        lineNamePassThroughStations();
    }
    public static void lineNamePassThroughStations(){
        // HashMap syntax
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();

        // create list one and store values
        List<String> list1 = new ArrayList<>();
        list1.add("Central Line");
        list1.add("Elizabeth Line");
        list1.add("Jubilee Line");

        // create list two and store values
        List<String> list2 = new ArrayList<>();
        list2.add("Central Line");
        list2.add("Bakerloo Line");
        list2.add("Victoria Line");

        // create list three and store values
        List<String> list3 = new ArrayList<>();
        list3.add("Central Line");
        list3.add("Elizabeth Line");

        // create list four and store values
        List<String> list4 = new ArrayList<>();
        list4.add("Central Line");
        list4.add("Piccadilly Line");

        // create list five and store values
        List<String> list5 = new ArrayList<>();
        list5.add("Central Line");
        list5.add("Northern Line");

        // create list six and store values
        List<String> list6 = new ArrayList<String>();
        list6.add("Bakerloo Line");
        list6.add("Northern Line");

        // create list seven and store values
        List<String> list7 = new ArrayList<String>();
        list7.add("Bakerloo Line");
        list7.add("Elizabeth Line");

        // create list eight and store values
        List<String> list8 = new ArrayList<String>();
        list8.add("Central Line");
        list8.add("Elizabeth Line");
        list8.add("Circle Line");

        // create list nine and store values
        List<String> list9 = new ArrayList<String>();
        list9.add("Bakerloo Line");
        list9.add("Jubilee Line");

        // create list ten and store values
        List<String> list10 = new ArrayList<String>();
        list10.add("Bakerloo Line");
        list10.add("Circle Line");

        // create list eleven and store values
        List<String> list11 = new ArrayList<String>();
        list11.add("Bakerloo Line");
        list11.add("Piccadilly Line");

        // create list twelve and store values
        List<String> list12 = new ArrayList<String>();
        list12.add("Bakerloo Line");
        list12.add("Jubilee Line");
        list12.add("Circle Line");

        // create list thirteen and store values
        List<String> list13 = new ArrayList<String>();
        list13.add("Bakerloo Line");
        list13.add("Circle Line");

        // create list fourteen and store values
        List<String> list14 = new ArrayList<String>();
        list14.add("Elizabeth Line");
        list14.add("Circle Line");

        // create list fifteen and store values
        List<String> list15 = new ArrayList<String>();
        list15.add("Victoria Line");
        list15.add("Circle Line");

        // create list sixteen and store values
        List<String> list16 = new ArrayList<String>();
        list16.add("Victoria Line");
        list16.add("Piccadilly Line");
        list16.add("Jubilee Line");

        // create list seventeen and store values
        List<String> list17 = new ArrayList<>();
        list17.add("Victoria Line");
        list17.add("Piccadilly Line");
        list17.add("Northern Line");
        list17.add("Circle Line");

        // create list eighteen and store values
        List<String> list18 = new ArrayList<>();
        list18.add("Jubilee Line");
        list18.add("Circle Line");

        // create list nineteen and store values
        List<String> list19 = new ArrayList<>();
        list19.add("Jubilee Line");
        list19.add("Northern Line");

        // create list twenty and store values
        List<String> list20 = new ArrayList<>();
        list20.add("Northern Line");
        list20.add("Circle Line");

        // put values into hashMap
        hashMap.put("Bond Street", list1);
        hashMap.put("Oxford Circus", list2);
        hashMap.put("Tottenham Court Road", list3);
        hashMap.put("Holborn", list4);
        hashMap.put("Bank", list5);
        hashMap.put("Elephant & Castle", list6);
        hashMap.put("Paddington", list7);
        hashMap.put("Liverpool Street", list8);
        hashMap.put("Waterloo", list9);
        hashMap.put("Embankment", list10);
        hashMap.put("Piccadilly Circus", list11);
        hashMap.put("Baker Street", list12);
        hashMap.put("Edgeware Road", list13);
        hashMap.put("Farringdon", list14);
        hashMap.put("Victoria", list15);
        hashMap.put("Green Park", list16);
        hashMap.put("King's Cross St. Pancras", list17);
        hashMap.put("Westminster", list18);
        hashMap.put("London Bridge", list19);
        hashMap.put("Moorgate", list20);

        // iterate and display values
        System.out.println("Fetching Stations and corresponding [Multiple] Line pass through stations \n");

        for( Map.Entry<String, List<String>> entry : hashMap.entrySet() )
        {
            String key = entry.getKey(); // getting key and store it into variable key
            List<String> values = entry.getValue(); // getting value and store it into variable values

            System.out.println("Station name is  = " + key); // print station names
            System.out.println("Line Pass through "+ key + " is  = " + values ); //print line pass through stations
        }
    }
}
