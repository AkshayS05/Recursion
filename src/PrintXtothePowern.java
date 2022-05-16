import java.util.Scanner;

public class PrintXtothePowern {
    private static int calcPower(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int powerMinusOne= calcPower(x, n-1);
        int ans= x*powerMinusOne;
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number");
        int x = s.nextInt();
        System.out.println("Please enter the power");
        int n= s.nextInt();
        System.out.println(calcPower(x,n));
    }

}

