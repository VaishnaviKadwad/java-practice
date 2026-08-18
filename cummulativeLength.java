import java.util.*;
public class cummulativeLength {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int count = 0;
        String names[] = new String[m];
        for(int i=0;i<m;i++){
            names[i]=sc.next();
        }
        for(int i=0;i<m;i++){
            count+=names[i].length();
        }
        System.out.println("The total length of all the names in the list "+count);
    }
}
    

