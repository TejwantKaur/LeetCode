class Solution {

    Set<List<Integer>> set = new HashSet<>();

    private void helper(int[] candidates, int idx, int target, List<Integer> curr, List<List<Integer>> ans){
      
      if(idx == candidates.length || target<0)
        return;

      if(target == 0){
        if(!set.contains(curr)){
          set.add(new ArrayList<>(curr));
          ans.add(new ArrayList<>(curr));
        }
        return;
      }

      curr.add(candidates[idx]);
      // single
      helper(candidates, idx+1, target-candidates[idx], curr, ans);
      // multiple
      helper(candidates, idx, target-candidates[idx] , curr, ans);
      // exclude
      curr.remove(curr.size()-1);
      helper(candidates, idx+1, target, curr, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<Integer> curr = new ArrayList<>();
      List<List<Integer>> ans = new ArrayList<>();
      
      int idx = 0;
      helper(candidates, idx, target, curr, ans);  

      return ans;  
    }
}