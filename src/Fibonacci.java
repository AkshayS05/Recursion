import java.util.Scanner;

public class Fibonacci {
    private static void printFibo(int n) {
        printFibo(n, 0,0,1);
    }
    private static void printFibo(int n, int count,int a, int b) {
        if(count>n-2){
            return;
        }
        if(a==0 &&b==1){
            System.out.println(a);
            System.out.println(b);
        }
        int c= a+b;
        System.out.println(c);
        a=b;
        b=c;
        printFibo(n,count+1,a,b);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the input");
        int n= s.nextInt();
        printFibo(n);
    }
}
