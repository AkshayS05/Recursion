import java.util.Scanner;

public class PrintArray {
    private static void arraySum(int[] arr) {
        arraySum(arr,0,0);
    }

    private static void arraySum(int[] arr, int i, int sum) {
        if(i==arr.length){
            System.out.println(sum);
            return;
        }
        sum+=arr[i];
        arraySum(arr,i+1,sum);
    }
//    public static int ans[]= new int[];

    public static int sum(int[]arr){
        return sum(arr,0,0);
    }

    private static int sum(int[] arr, int i, int total) {
        if(i==arr.length){
            return total;
        }
        total+=arr[i];
       return sum(arr,i+1,total);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the Size of the array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Please enter the elements");
        for (int i = 0; i <size; i++) {
            arr[i]= s.nextInt();
        }
        System.out.println(sum(arr));
    }
}
