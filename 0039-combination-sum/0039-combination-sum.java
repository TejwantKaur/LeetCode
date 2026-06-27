class Solution {
  static void rec(int arr[], int idx, int target, List<Integer> indexes, List<List<Integer>> result){
    if(target == 0){
      result.add(new ArrayList<>(indexes));
      return;
    }
    if(target < 0 || idx == arr.length) return;

    indexes.add(arr[idx]);
    rec(arr, idx, target-arr[idx], indexes, result); // same idx
    indexes.remove(indexes.size()-1); // remove currently added elem

    rec(arr, idx+1, target, indexes, result); // next idx
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> indexes = new ArrayList<>();
    
    rec(candidates, 0, target, indexes, result);

    return result;
  }
}