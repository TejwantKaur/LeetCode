class Solution {
    static void rec(int[] arr, int target, int idx, List<Integer> indexes, List<List<Integer>> result){
      if(target==0) {
        result.add(new ArrayList<>(indexes));
        return;
      }

      if(target < 0 || idx == arr.length) 
        return;

      indexes.add(arr[idx]);
      // choose
      rec(arr, target-arr[idx], idx+1, indexes, result);
      indexes.remove(indexes.size()-1);

      while(idx+1 < arr.length && arr[idx+1] == arr[idx]) 
        idx++;  
      // skip
      rec(arr, target, idx+1, indexes, result);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<Integer> indexes = new ArrayList<>();
      List<List<Integer>> result = new ArrayList<>();

      Arrays.sort(candidates);
      rec(candidates, target, 0, indexes, result);
      return result;
    }
}