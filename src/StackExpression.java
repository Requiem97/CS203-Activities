/*Reyes, Marius Alberto
*CS 203
*2CSA
*Lab Exercise 5
 */

import java.util.Scanner;

public class StackExpression {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("t: ");
        int t = sc.nextInt();
        String prefix;
        String infix;

        switch (t) {
            case 1:
                System.out.print("s: ");
                sc.nextLine();
                prefix = sc.nextLine();
                System.out.println("\n" + "Prefix: " + prefix);
                System.out.println("Infix: " + prefixToInfix(prefix));
                break;
            case 3:
                System.out.print("s: ");
                sc.nextLine();
                prefix = sc.nextLine();
                System.out.println("\n" + "Prefix: " + prefix);
                System.out.println("Infix: " + prefixToInfix(prefix));
                System.out.println("Value: " + evalPrefix(prefix));
                break;
            case 4:
                System.out.print("s: ");
                sc.nextLine();
                infix = sc.nextLine();
                System.out.println("\n" + "Infix: " + infix);
                prefix = infixToPrefix(infix);
                System.out.println("Prefix: " + prefix);
                System.out.println("Value: " + evalPrefix(prefix));
                break;
            case 6:
                System.out.print("s: ");
                sc.nextLine();
                infix = sc.nextLine();
                System.out.println("\n" + "Infix: " + infix);
                prefix = infixToPrefix(infix);
                System.out.println("Prefix: " + prefix);
                System.out.println("Value: " + evalPrefix(prefix));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static String prefixToInfix(String prefix) {
        Stack<String> s = new Stack<String>();
        String sprefix[] = prefix.split(" ");
        int n = sprefix.length;
        for (int i = n - 1; i >= 0; i--) {
            if (isOperand(sprefix[i])) {
                s.push(sprefix[i]);
            } else {
                String A = s.pop();
                String B = s.pop();
                String lol = "(" + A + sprefix[i] + B + ")";
                s.push(lol);
            }
        }
        return s.pop();
    }

    public static String evalPrefix(String prefix) {
        Stack<String> s = new Stack<String>();
        String[] sprefix = prefix.split(" ");
        int n = sprefix.length;
        for (int i = n - 1; i >= 0; i--) {
            if (isOperand(sprefix[i])) {
                s.push(sprefix[i]);
            } else {
                String A = s.pop();
                String B = s.pop();
                s.push(evaluate(A, sprefix[i], B));
            }
        }
        return s.pop();
    }

    public static String evaluate(String op1, String operator, String op2) {
        double a = Double.parseDouble(op1);
        double b = Double.parseDouble(op2);
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
            case "^":
                result = Math.pow(a, b);
                break;
        }
        return String.valueOf(result);
    }

    public static boolean isOperand(String x) {
        return !(x.equals("+") || x.equals("-") || x.equals("/")
                || x.equals("*") || x.equals("^") || x.equals("%"));
    }

    public static String infixToPrefix(String e) {
        String[] X = e.split(" ");
        Stack<String> optr = new Stack<>();
        Stack<String> rev = new Stack<>();
        String ans = "";

        for (int i = X.length - 1; i >= 0; i--) {
            if (X[i].matches("[0-9]+(\\.[0-9]{1,2})?")) {
                rev.push(X[i]);
            } else {
                while (!optr.isEmpty() && isLowerPrece(X[i], optr.peek())) {
                    rev.push(optr.pop());
                }
                optr.push(X[i]);
            }
        }

        while (!optr.isEmpty()) {
            rev.push(optr.pop());
        }

        while (!rev.isEmpty()) {
            if (!rev.peek().equals("(") && !rev.peek().equals(")")) {
                ans = ans + rev.pop() + " ";
            } else {
                rev.pop();
            }
        }
        return ans;
    }

    public static boolean isLowerPrece(String e, String check) {
        if ("^".equals(e) && "^".equals(check)) {
            return true;
        }
        return incomingPriority(e) < InStackPriority(check);
    }

    public static int InStackPriority(String e){
        switch(e){
            case "+":
            case "-":
                return 1;
            case "/":
            case "*":
                return 3;
            case "%":
                return 6;
            case "^":
                return 8;
            case ")":
                return 0;
            default:        
                return 0;
        }
    }
    
    public static int incomingPriority(String el){
        switch(el){
            case "+":
            case "-":
                return 2;
            case "/":
            case "*":
                return 4;
            case "%":
                return 5;
            case "^":
                return 7;
            case ")":
                return 9;
            default:
                return 0;
        }
    }
}
