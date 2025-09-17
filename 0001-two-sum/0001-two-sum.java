class Solution {
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
        for (int j=nums2.length-1; j>0; j--){
            if(nums2[j] == b){
                res[1] = j;
                break;
            }
        }
        return res;
    }
}

        // HashMap<Integer,Integer> hs = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     if(hs.containsKey(target - nums[i])){
        //         arr[0] = i; 
        //         arr[1] = hs.get(target - nums[i]);
        //     }
        //     hs.put(nums[i] , i);
        // }
        // return arr;

        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j] == target){
        //             arr[0] = i; arr[1] = j;
        //         }
        //     }
        // }   
//     }
// }