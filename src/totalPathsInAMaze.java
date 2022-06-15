import java.util.Scanner;

public class totalPathsInAMaze {
    private static int countTotalPaths(int n, int m) {

        return countTotalPaths(n,m,0,0);
    }

    private static int countTotalPaths(int n, int m, int i, int j) {
        if(i==n ||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }
       int downnPaths= countTotalPaths(n,m,i+1,j);
        int rightPaths=countTotalPaths(n,m,i,j+1);
       int totalPaths= downnPaths+rightPaths;
       return totalPaths;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int n= s.nextInt();
        System.out.println("Please enter the number of columns");
        int m= s.nextInt();
        System.out.println(countTotalPaths(n,m));
    }
}
