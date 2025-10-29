class Solution {
    public int smallestNumber(int n) {
        int num=1;

        // kioki (num-1) return kerna apa, iskrke onu compare kraange
        while(num-1 < n){ 
            num = num<<1; 
        }
        return num-1; 
    }
}