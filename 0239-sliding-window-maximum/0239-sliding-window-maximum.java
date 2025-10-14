class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        int[] res = new int[n-k+1];

        // 1st window
        for(int i=0; i<k; i++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.removeLast();
             }   
            dq.addLast(i);
        }
        int idx=0;
        for(int i=k; i<n; i++){
            res[idx++] = (nums[dq.peekFirst()]);

            // remove elems not in curr window  (i-k+1) starting index
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }

            // remove smaller elems
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
                dq.removeLast();
            dq.addLast(i);
        }
        // push remaining last element, o last wli window da maximum hoega 
        res[idx] = (nums[dq.peekFirst()]);
        return res;
    }
}