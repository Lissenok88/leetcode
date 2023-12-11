package com.lissenok88;

/*Given an integer x, return true if x is a palindrome, and false otherwise.
**/
public class PalindromeNumber_9 {
    public static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}
