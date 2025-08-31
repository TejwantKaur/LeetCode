class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] list = new int[2];

        int st=0, end=numbers.length-1;

        while(true){
            if (numbers[st]+numbers[end] == target){
                list[0] = st+1;
                list[1] = end+1;
                return list;
            }
            if(numbers[st]+numbers[end] > target){
                end--;
            } else{
                st++;
            }
        }

    }
}