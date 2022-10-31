package javahomeworkweek9.programme1_calculate;
/**
 * Write a “main” method into main class. It has scanner that takes user input.
 * Also write the logic that it ask user to “Enter first Number:”, “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user enter + symbol result like “Addition of 5 and 10 is: 15” and respective for other symbol.
 * 5. With the result it’s also print one more message “Would you like to do more calculation Please enter “Y” or “N” :” (Hint use while loop if user enter Y program asking the user to enter First Number, and if user enter N programme should terminate)
 */

import java.util.Scanner;
//Inheritance Main class(child class) extends Calculator class(Parent class)
public class Main extends Calculator {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter First number :");
        int a = scanner.nextInt();
        System.out.print("Please Enter Second number : ");
        int b = scanner.nextInt();
        System.out.print("Please Enter one of symbol '+' , '-' , '*' , '/' : ");
        char symbol = scanner.next().charAt(0);
        Calculator obj = new Calculator();
        obj.calculateResult(a, b, symbol);
        System.out.println("Would you like to more calculations?");
        char cont = scanner.next().charAt(0);

        while (cont == 'Y' || cont == 'y') {
            System.out.println("Enter the first number: ");
            a = scanner.nextInt();
            System.out.println("Enter the second number: ");
            b = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/: ");
            symbol = scanner.next().charAt(0);
            Calculator obj1 = new Calculator();
            obj1.calculateResult(a, b, symbol);
            System.out.println("Would you like to more calculations?");
            cont = scanner.next().charAt(0);
        }
        while(cont=='N'||cont=='n')
        {
            System.out.println("Thank you for using calculator ");
            System.exit(0);
        }
        //Scanner closed
        scanner.close();
    }

    }

