import java.util.Scanner;

public class FirstIndexOfANumber {
    private static int findFirstIndex(int[] arr, int num) {
        return findFirstIndex(arr,num,0);
    }

    private static int findFirstIndex(int[] arr, int num, int i) {
        //if i reached here, it means the number we are looking for doesn't
        //exist in the array
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==num){
            return i;
        }else{
           return findFirstIndex(arr,num,i+1);
        }
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
        System.out.println("Enter the number you want to find first index for");
        int num= s.nextInt();
        System.out.println(findFirstIndex(arr,num));
    }
}
