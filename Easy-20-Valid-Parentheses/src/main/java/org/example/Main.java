package org.example;

/***
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();

        /***
         * jakby w zeszycie mam ze one sie zamykaja ze biore ten zamykajacy  i jesli odejme od niego indeks tego pcozatkowego ktorego musze znalezc ale wiem ze gdzies jet
         * to wtedy jesli liczba wynosi 1,3 lub 5 to jest git zamkniecie
         */
        for (int i = 0; i < chars.length; i++) {

        }
    }
}