import java.util.*;


public class transposeMatrix{
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows :");
        int n = sc.nextInt();
        System.out.println("Enter columns :");
        int m = sc.nextInt();

        System.out.println("Enter the elements :");
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is : ");
        //To print transpose
        for(int i=0; i<m ;i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

