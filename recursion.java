import  java.util.*;
public class recursion {
    public static void reverse(String S,int n){
          if(n==0){
            return;
          }
          System.out.print(S.charAt(n-1));
          reverse(S,n-1);
         

    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String");
       String word = sc.next();
       int n=word.length();
       reverse(word,n);
    }
}