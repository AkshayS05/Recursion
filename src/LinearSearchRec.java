import java.util.Scanner;

public class LinearSearchRec {
    private static int linearSearch(int[] arr, int target) {
        return linearSearch(arr,target,0);
    }

    private static int linearSearch(int[] arr,int target, int i) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return linearSearch(arr,target,i+1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the Size of the array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Please enter the elements");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Please enter the target");
        int target= s.nextInt();
        System.out.println(linearSearch(arr,target));
    }


}
