import java.util.Scanner;

class recursionRev {
    public static void revString (String str, int inx){
        if (inx == 0){
            System.err.print(str.charAt(inx));
            return;        
        }
        System.out.print(str.charAt(inx));
        revString(str,inx-1);
    }
    public static void main (String args[]){
        String str="abcd";
        int inx=str.length()-1;
        revString(str,inx);
        }
    }