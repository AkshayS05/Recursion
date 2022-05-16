import java.util.Scanner;

public class CalcFactorial {
    public static int  calcFactorial(int n) {
      if(n==1||n==0){
          return 1;
      }
      int factorialMinusOne=calcFactorial(n-1);
    int total= n*factorialMinusOne;
    return total;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the input");
        int n= s.nextInt();
        System.out.println(calcFactorial(n));
    }
}
