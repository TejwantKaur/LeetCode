class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] list = new int[2];
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if (numbers[i] + numbers[j] == target){
                    list[0] = i+1;
                    list[1] = j+1;  
                    return list;
                }
            }
        }
        list[0] = 0;
        list[1] = 0; 
        return list;  
    }
}