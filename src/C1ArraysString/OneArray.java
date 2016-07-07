/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C1ArraysString;

/**
 *
 * @author gupta.abh
 */

/*
There are three types of edits that can be performed on strings: 
insert a character, remove a character and replace a character. 
Given two strings, write a function to check if they are within one edit of each other.

Pale, ple  ---> true
pales, pales --> true
pale, bale --> true
pale, bake -->false
 */
public class OneArray {

    public static void main(String[] args) {

        isOneEdit("pale", "pal");
    }

    public static boolean isOneEdit(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        } else {
            char[] string1 = s1.toCharArray();
            char[] string2 = s2.toCharArray();
            int count =0;
            if (string1.length == string2.length) {
                 for(int i=0;i<string1.length;i++){
                     if(string1[i]==string2[i]){
                         count++;
                     }
                 }
            }else{
                int count1 =0 ;
                if(string1.length>string2.length){
                    
                }else{
                    
                }
                
            }

        }

        return true;
    }

}
