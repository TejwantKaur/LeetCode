class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int maxTimeInGroup = neededTime[0];

        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                // same color → remove the one with smaller time
                totalTime += Math.min(neededTime[i], maxTimeInGroup);
                // keep the balloon with the larger time for next comparisons
                maxTimeInGroup = Math.max(neededTime[i], maxTimeInGroup);
            } else {
                // new color group starts
                maxTimeInGroup = neededTime[i];
            }
        }

        return totalTime;
    }
}






// class Solution {
//     public int minCost(String colors, int[] neededTime) {

//         int ans=0;
//         for(int i=1; i<colors.length(); i++){
//             char prev = colors.charAt(i-1);
//             char ch = colors.charAt(i);
            
//             int prevTime=neededTime[i-1];
//             if(ch==prev){
//                 ans+=Math.min(prevTime,neededTime[i]);
//             }
//         }
//         return ans;
//     }
// }