/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C1ArraysString;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gupta.abh
 */
//Give Two String Write a Method to decide if one is permutation of the other
// Algorithm
/*
Step 1 - Check if both string are equal in length 
Step 2 If Equal then Sort Both the string
Step 3 If sorted Strings are equal then return true

 */
public class CheckPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String first = sc.next();

        System.out.println("Enter second String");
        String second = sc.next();

        if (isPermutation(first, second) == true) {
            System.out.println("Both String are permutation of each other");

        } else {
            System.out.println("No permutation of each other");
        }

    }

    public static boolean isPermutation(String first, String second) {
        boolean ispermutation = false;
        if (first.length() == second.length()) {
            first = sortString(first);
            second = sortString(second);
            if (first.equals(second)) {
                ispermutation = true;
            } else {
                ispermutation = false;
            }

        } else {

            ispermutation = false;
        }
        return ispermutation;
    }

    public static String sortString(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        String sorted = new String(str);
        return sorted;
    }

}
