import java.util.Scanner;
public class factorialFunction{
    public static void findFactorial(int n){
        int fact=1;
        if (n<0){
            System.out.println("Invalid input");
            return;
        }
        for (int i=n; i>=1; i--){
            fact=fact*i;
        }
        System.out.println("Factorial is:"+ fact);
                  
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        findFactorial(n);
    }
}

