class Solution {
    public int compareVersion(String version1, String version2) {

        String s[] = version1.split("\\.");
        String r[] = version2.split("\\.");

        int n = Math.max(s.length, r.length);

        for(int i=0; i<n; i++){
            int num1 = i < s.length ? Integer.parseInt(s[i]) : 0;
            int num2 = i < r.length ? Integer.parseInt(r[i]) : 0;

            if (num1<num2) return -1;
            if (num1>num2) return 1;
        }
        return 0; //equal
    }
    
}