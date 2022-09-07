package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "abba"
Output: "bab"
Explanation: "aba" is also a valid answer.
*/

public class LongestPalindromicSubstring {

    static String findLongestPalindrome(String input) {
         //System.out.println("Inside fuynction");
      	int maxLength = 0;
        String res = "";
        
        if(input == null){
            return "";
        }
        
        if(input.length() >= 1) {
            maxLength = 1;
            res = Character.toString(input.charAt(0));
        }
        
        //  s = "babad"
        for(int i = 0; i < input.length(); i++){ // 1
            int l = i-1; // 0
            int r = i + 1; // 2
            //System.out.println(i);
            while(l >= 0 &&  r < input.length()){
                if(input.charAt(l) == input.charAt(r)){
                    if(r - l + 1 > maxLength){
                        res = input.substring(l, r + 1);
                        //System.out.println(res);
                    }
                    l--;
                    r++;
                }else{
                    break;
                }
                
            }
            
            l = i;
            r = i + 1;
            while(l >= 0 && r < input.length()){
                if(input.charAt(l) == input.charAt(r)){
                    if(r - l + 1 > maxLength){
                        res = input.substring(l, r + 1);
                        //System.out.println(res);
                    }
                    l--;
                    r++;
                }else{
                    break;
                }
            }
        }
        
        //System.out.println(res);
        return res;
   }

 public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int a;
        // a = in.nextInt();
        // int b;
        // b = in.nextInt();
        // int sum;
        
        String input = "babad";

        //System.out.println("Inside main");
        String result = findLongestPalindrome(input);
        System.out.println(result);
   }
}
