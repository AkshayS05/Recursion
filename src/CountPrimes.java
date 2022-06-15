import java.util.Scanner;
public class CountPrimes {
    private static int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for(int i=2;i<n;i++) {
            if(notPrime[i] == false)
                count++;
            for(int j=2;i*j<n;j++) {
                notPrime[i*j] = true;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int n= s.nextInt();
        System.out.println(countPrimes(n));
    }
}
