import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        List<List<Integer>> result= new ArrayList();
        if(n<3){
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i <n-2 ; i++) {
            if(nums[i]>0){
                break;
            }
            if(i==0|| i>0 &&nums[i]>nums[i-1]){
                int j= i+1;
                int k= n-1;
                while(j<k){
                    if(nums[i]+nums[j]+nums[k]==0){
                       result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                       while(j<k && nums[j]==nums[j+1]){
                           j++;
                       }while(j<k&& nums[k]==nums[k-1]){
                          k--;
                     }
                        k--;
                        j++;
                    }
                    else if(nums[i]+nums[j]+nums[k]<0){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
int arr[]= {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
}
