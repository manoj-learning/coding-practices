import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("String Reversal!");

        String ishaan = "Ishaan is the teacher";
        char temp;

        System.out.println("Original String: " + ishaan);

        String reversedIshaan = "";

        for (int i = 0; i < ishaan.length(); i++) {

            temp = ishaan.charAt(i);
            reversedIshaan = temp + reversedIshaan;
        }

        System.out.println("Reversed String: " + reversedIshaan);

        if (isPalindrome("12321"))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static boolean isPalindrome(String input) {
        String[] brokenInput = input.split("");
        int startIndex = 0;
        int endIndex = brokenInput.length - 1;

        if (input.isEmpty())
            return true;

        while (startIndex < endIndex) {

            if (!(brokenInput[startIndex].equals(brokenInput[endIndex]))) {
                return false;
            }

            startIndex++;
            endIndex--;
        }

        return true;
    }
}