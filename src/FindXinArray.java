import java.util.Scanner;

public class FindXinArray {
    private static boolean findX(int[] arr, int num) {
        //creating a helper function to pass index for iteration.
     return findX(arr,num,0);
    }

    private static boolean findX(int[] arr, int num, int i) {
        //if i =array's length, it means the whole array is traversed but the number we are looking for is not
        //present, thus we return false
        if(i== arr.length){
            return false;
        }
        if(arr[i]==num){
            return true;
        }else{
            return findX(arr,num,i+1);
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
        System.out.println("Enter the number you want to find");
        int num= s.nextInt();
        System.out.println(findX(arr, num));
    }


}
