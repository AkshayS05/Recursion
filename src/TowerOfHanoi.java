import java.util.Scanner;

public class TowerOfHanoi {
    private static void towerOfHanoi(int n, String src, String helper, String destination) {
        if(n==1){
            System.out.println("Disk"+ n + "moved from "+ src + " to "  + destination);
            return;
        }
        towerOfHanoi(n-1, src,destination,helper);
        System.out.println("Disk"+ n + "moved from "+ src + " to " + destination);
        towerOfHanoi(n-1, helper,src,destination);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the input");
        int n= s.nextInt();
        String src= "Source";
        String helper= "Helper";
        String destination="Destination";
     towerOfHanoi(n,src,helper,destination);


    }
}
