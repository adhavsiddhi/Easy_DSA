/*
 *   @Duplicate Parentheses
 *   Givee a balanced expression, find if contains duplicate parentheses or not. A  set of 
 *   parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.
 * 
 *    -> Return a true if it contains duplicates else return false.
 * 
 *   example:  
 *            (i)  -> (((a+(b)))+(c+d))  => true
 *            (ii) -> ((((a)+(b))+c+d))  => true
 *            (iii)-> ((a+b)+(c+d))      => false
 *            (iv) -> (((a+b))+c)        => true
 */

import java.util.Stack;;

public class DuplicateParenthesesCode {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop(); // opening pair
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "(((a+(b)))+(c+d))";
        System.out.println(isDuplicate(str1)); // false
        /*The provided Java code defines a program to check for duplicate parentheses in a given balanced expression. Duplicate parentheses are defined as multiple sets of parentheses that surround the same subexpression. The code uses a stack data structure to evaluate the expression and determine if duplicates exist. Let's break down the code and its functionality:

isDuplicate Method:

The isDuplicate method takes a string str as input, which represents a balanced expression containing parentheses.
It uses a stack (s) to process the characters of the expression one by one.
It iterates through each character in the input string.
If the character is an opening parenthesis '(', it is pushed onto the stack.
If the character is a closing parenthesis ')', the code checks for duplicate parentheses. It counts the number of characters popped from the stack until it encounters the corresponding opening parenthesis '('.
If the count of characters popped is less than 1, it means there are duplicate parentheses, and the method returns true.
If the count is 1 or greater, it means that the parentheses are not duplicates, and the opening parenthesis is also popped from the stack.
After processing all characters, if there are no duplicates, the method returns false.
Main Method:

In the main method, two test cases are provided:
str1 represents the expression "(((a+(b)))+(c+d))".
str2 represents the expression "((a+b)+(c+d))".
The isDuplicate method is called for each test case, and the results are printed.
Output:

The output of the program is:
arduino
Copy code
false
true
In the first test case (str1), there are no duplicate parentheses, so the result is false.
In the second test case (str2), there are duplicate parentheses around the subexpression "(a+b)", so the result is true.



        String str2 = "((a+b)+(c+d))";
        System.out.println(isDuplicate(str2)); // true

    }
}
*/
