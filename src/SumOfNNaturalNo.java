import java.util.Scanner;

public class SumOfNNaturalNo {
    public static void printSum(int n) {
        printSum(n, 0);
    }
    public static void printSum(int n, int sum) {
        if(n==1){
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=n;
        printSum(n-1,sum);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the input");
        int n= s.nextInt();
        printSum(n);
    }

}
