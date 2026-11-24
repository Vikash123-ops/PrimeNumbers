import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the number of times");
        int t= scn.nextInt();
        for (int i=1; i<=t; i++){
            System.out.print("Enter number "+i+"=");
            int n= scn.nextInt();
            int count= 0;
            for (int div=2; div*div<=n; div++){
                if (n%div==0){
                    count++;
                    break;
                }
            }
            if (n<=1){
                System.out.println("Not prime");

            }
            else if (count==0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
}