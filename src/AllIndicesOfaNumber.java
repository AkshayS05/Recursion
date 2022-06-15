import java.util.Scanner;

public class AllIndicesOfaNumber {
    private static int[] findAllIndices(int[] arr, int num) {
        return findAllIndices(arr,num,0,0);
    }
//public static int[] ans = new int[0];
    private static int[] findAllIndices(int[] arr, int num, int i,int count) {
       if(i==arr.length){
           return new int[0];
       }
        int indexes[]= findAllIndices(arr,num,i+1,count);
       if(arr[i]!=num){
           return indexes;
       }
     else{
         int ans[]= new int [indexes.length+1];
         ans[0]= i;
         for (int j = 0; j < ans.length; j++) {
             ans[j+1]= indexes[i];
         }
         return  ans;
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
        System.out.println("Enter the number you want to find all indices of");
        int num= s.nextInt();
        int ans[]=(findAllIndices(arr,num));
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
}
