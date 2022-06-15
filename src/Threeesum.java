import java.util.Arrays;

public class Threeesum{
    public static void sumOfThree(int[] arr) {
//        int target= arr[0];
//        arr[0]= 0;
//        int count=0;
//        for(int i=1; i<arr.length-2; i++){
//            for( int j=i+1; j<arr.length-1; j++){
//                for(int k= i+2; k<arr.length; k++){
//                    if(arr[i]+arr[j]+arr[k]==target){
//                        count++;
//                    }
//                    if(count==3){
//                        System.out.println("true");
//                        return;
//                    }
//                    if(i==arr.length-2&&count<3){
//                        System.out.println("false");
//                        return;
//                    }
//                }
//            }
//        }

        //start
    int target= arr[0];
    arr[0]=0;
        Arrays.sort(arr);
    int n= arr.length;
    int count=0;
        for (int i = 1; i <n-2 ; i++) {
            int j= i+1;
            int k= n-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]==target) {
                    count++;

                    if (count == 3) {
                        System.out.println("true");
                        return;
                    }
                    while (j < k && arr[j] == arr[j + 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }
                }
               else if(arr[i]+arr[j]+arr[k]<target){
                    j++;
                }else{
                   k--;
                }
            }
        }
        System.out.println("false");

    }
        public static void main(String[] args) {
        int arr[]= {10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2};
    sumOfThree(arr);
    }
}
