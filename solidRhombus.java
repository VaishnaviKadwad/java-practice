public class solidRhombus{
    public static void main(String[] args) {
        int n=5;
        //upper half
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
        