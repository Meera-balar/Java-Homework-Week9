package javahomeworkweek9.programme1_calculate;

/**
 * Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”, and “multiplication”.
 * All methods are instance method and it doesn’t return anything. But it has two parameters with name “int a” and “int b”.
 * Also each method have System.out.println(). This prints the result. Also create all one more method with name “calculateResult” with three parameter with name int a, int b and char symbol.
 * Write the logic in calculateResult method that when user enter first number and second number and symbol based on symbol it does calculate.
 */
public class Calculator {

    //Instance method for addition
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + "and" + b + " is " + (a + b));
    }

    //Instance method for subtraction
    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + "and" + b + " is " + (a - b));
    }

    //Instance method for multiplication
    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + "and" + b + " is " + (a * b));
    }

    //Instance method for division
    public void division(int a, int b) {

        System.out.println("Division of " + a + "and" + b + " is " + (a / b));
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else if (symbol == '/') {
            try {
                division(a, b);
            } catch (Exception c) {
                System.out.println("Number can't divided by 0" + c.getMessage());
            }
        } else {
            System.out.println("Invalid data entered");
        }
    }
}

