class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
      unordered_map<int, int> map;
      map[0] = 1;

      int pre = 0, cnt = 0;
      for (int i = 0; i < nums.size(); i++) {
        pre += nums[i];
        int key = pre-k;
        // key exists in map?
        if(map.find(key) != map.end())
          cnt += map[key];
        map[pre]++;
      }
      return cnt;
    }
};