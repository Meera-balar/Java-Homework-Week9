package javahomeworkweek9;
//Re write the student mark sheet programme using if else and while loop.
import java.util.Scanner;

public class Programme2_StudentMarkSheet {
    public static void main(String[] args) {

        studentMarkSheet();
    }
    public static void studentMarkSheet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name :");
        String studentName = scanner.nextLine();
        System.out.print("Enter Student Roll Number : ");
        int rollNumber = scanner.nextInt();
        System.out.println("Enter Math Subject's Marks");
        int mathMarks = scanner.nextInt();
        System.out.println("Enter Science Subject's Marks");
        int scienceMarks = scanner.nextInt();
        System.out.println("Enter English's Marks");
        int englishMarks = scanner.nextInt();
        int total = mathMarks + scienceMarks + englishMarks;
        System.out.println(" _______________________________");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|_______________________________|");
        System.out.println("|      Name    : " + studentName + "           |");
        System.out.println("|      Roll No : " + rollNumber + "              |");
        System.out.println("|_______________________________|");
        System.out.println("|      Subjects : Marks         |");
        System.out.println("|_______________________________|");
        System.out.println("|        Math    : " + mathMarks + "           |");
        System.out.println("|        Science : " + scienceMarks + "           |");
        System.out.println("|        English : " + englishMarks + "           |");
        while (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid marks entered Marks should be 1 to 100");
            System.exit(0);
        }
        while (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            System.out.println("|      Result     : Fail        |");
            System.out.println(" _______________________________");
            System.exit(0);
        }

        System.out.println("|_______________________________|");
        System.out.println("|        Total : " + total + "            |");
        System.out.println("|_______________________________|");
        float percentage = (total * 100) / 300;
        System.out.println("|      Percentage : " + percentage + "        |");

        if (percentage >= 80) {
            System.out.println("|      Result     : Pass        |");
            System.out.println("|      Grade      : A+          |");
        } else if (percentage >= 60) {
            System.out.println("|      Result     : Pass        |");
            System.out.println("|      Grade      : A           |");
        } else if (percentage >= 50) {
            System.out.println("|      Result     : Pass        |");
            System.out.println("|      Grade      : B           |");
        } else if (percentage >= 35) {
            System.out.println("|      Result     : Pass        |");
            System.out.println("|      Grade      : C           |");
        } else {
            System.out.println("|      Result     : Fail        |");
            System.out.println("|      Grade      : F           |");
        }
        System.out.println("|_______________________________|");
    }
}

