/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C1ArraysString;

import java.util.Scanner;

/**
 *
 * @author gupta.abh
 */
// Add %20 in place of a blank space in a sentence
public class URLify {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String s = sc.nextLine();
        System.out.println("URLify String:  " + modifyUrl(s));

    }

    public static String modifyUrl(String s) {

        char[] charArray = s.toCharArray();
        int countSpace = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(charArray[i])) {
                countSpace++;
            }
        }
        char[] newArray = new char[s.length() + countSpace * 2];
        int index = newArray.length - 1;
        int j = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i])) {
                newArray[j] = '%';
                newArray[j + 1] = '2';
                newArray[j + 2] = '0';
                j = j + 3;
            } else {
                newArray[j] = charArray[i];
                j++;
            }
        }

        /*System.out.println(new String(newArray));
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]);
        }*/
        return new String(newArray);
    }

}
