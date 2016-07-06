/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isunique1;

import java.util.Scanner;

/**
 *
 * @author gupta.abh
 */
public class IsUniqueString {
    
    //ASCII table has 128 symbols  A !=a
    //Extended ASCII table has 256 symbols  A!=a
    //Time complexity O(s.length())
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        
        String s = sc.next();        
        if(isUnique(s)==true){
            System.out.println("This is not a Unique String");
        }else{
            System.out.println("This is a unique String");
        }
        
    }

    
    public static boolean  isUnique(String s){
    boolean[] Array = new boolean[128];
    boolean isfound = false;
    for(int i=0;i<s.length();i++){
        if(Array[s.charAt(i)]==true){
            isfound = true;
            break;
        }else{
            Array[s.charAt(i)] = true;
        }
    }
    return isfound;
}
    
    
    
    
}
