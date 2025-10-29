class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return new ArrayList<>();

        List<List<Integer>> al = new ArrayList<>();
        
        // row1
        List<Integer> r1 = new ArrayList<>();
        r1.add(1);  al.add(r1); 
        if(numRows==1) return al;
        
        // row2
        List<Integer> r2 = new ArrayList<>();
        r2.add(1); r2.add(1); al.add(r2);

        for(int i=2; i<numRows; i++){
            List<Integer> prev = al.get(i-1);
            List<Integer> li = new ArrayList<>();
            li.add(1); // 1st elem of row
            
            for(int j=1; j<prev.size(); j++){
                li.add(prev.get(j)+prev.get(j-1));
            }
            li.add(1); al.add(li);
        }
        return al;
    }
}