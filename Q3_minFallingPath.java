public class minFallingPath {
    static int mat2[][];
    public static int minimumPath(int[][] a){
        mat2 = new int [a.length][a[0].length];

        for (int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                min(a,i,j);
            }
        }
        int res = Integer.MAX_VALUE;

        // int l = ;
        for(int ab: mat2[mat2.length-1]){
            if(res>ab){
                res = ab;
            }
        }
        return res;
    }
    public static void min(int[][] a, int i, int j){
        mat2[i][j] = a[i][j];

        if(i==0){
            return;
        }
        else if(i>0 && j==0){
            mat2[i][j] += Math.min(mat2[i-1][j],mat2[i-1][j+1]);
        }
        else if(i>0 && j==a[0].length-1){
            mat2[i][j] += Math.min(mat2[i-1][j], mat2[i-1][j-1]);
        }
        else{
            mat2[i][j] += Math.min(Math.min(mat2[i-1][j], mat2[i-1][j-1]),mat2[i-1][j+1]); 
        }
    }
    public static void main(String args[]){
        int [][] a = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minimumPath(a));

    }
}
