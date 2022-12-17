// import java.util.HashMap;
import java.util.Arrays;
public class twoSumReturningIndex {
    public static int[] twoSum(int[] nums2, int target) {

        if(nums2 == null){
            return null;
        }
        int res[] = new int[2];

        int[] nums = Arrays.copyOf(nums2,nums2.length);
        Arrays.sort(nums);
        int start=0 , end=nums.length-1; 
        int a=0, b=0;

        while(start<end){
            int sum = nums[start] + nums[end];
            if(sum < target){
                start++;
            } else if(sum > target){
                end--;
            }else{
                a = nums[start]; b = nums[end]; 
                break;
            }
        }

        for (int i=0; i<nums2.length; i++){
            if(nums2[i] == a){
                res[0] = i;
                break;
            }
        }
        System.out.println(a + " " + b + " " + res[0]);
        for(int i=0; i<nums2.length; i++){
            System.out.print(nums2[i] + " ");   
        }
        System.out.println();

        // if(a!=b){
        //     for(int i=0; i<nums2.length; i++){
                
        //     }
        // }else{

        // }
        if(a == b){
            for(int i=0; i<nums2.length; i++){
                if(nums2[i] == b && i!=res[0]){
                    res[1] = i;
                    break;
                }
            }
        }else{
            for (int i=0; i<nums2.length; i++){
                if(nums2[i] == b){
                    res[1] = i;
                    break;
                }
        }   
    }return res;
}
    public static void main(String args[]){
        int[] nums = {3,2,3};
        int target = 6;
        int[] res = twoSum(nums,target);
        System.out.print(res[0] + " " + res[1]); 
    }
}
    //     int res[] = new int[2];

    //     HashMap <Integer,Integer> hs = new HashMap<>();
    //     for(int i=0; i<arr.length; i++){
    //         if(hs.containsKey(target - arr[i])){
    //             res[1] = i;
    //             res[0] = hs.get(target - arr[i]);
    //         }
    //         hs.put(arr[i], i);
    //     }
    //     // System.out.println(arr);
    //     return res;
    // }
    
// }

 // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j] == target){
        //             arr[0] = i; arr[1] = j;
        //         }
        //     }
        // }

        
