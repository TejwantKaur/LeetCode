import java.util.HashMap;
import java.util.ArrayList;

public class intersectionOfArrays {
    public static int[] sol(int[]arr1, int[]arr2){
        HashMap <Integer,Integer> h = new HashMap<>();
        for(int i=0; i<arr1.length; i++){
            if(h.containsKey(arr1[i])){
                h.put(arr1[i],h.get(arr1[i])+1);
            } else{
                h.put(arr1[i], 1);
            }
        }
        ArrayList <Integer> a = new ArrayList<>();
        for(int i=0; i<arr2.length; i++){
            if(h.containsKey(arr2[i]) && h.get(arr2[i])>0){
                a.add(arr2[i]);
                h.put(arr2[i],h.get(arr2[i])-1);
            }
        }
        int res[] = new int[a.size()];
        for(int i=0; i<a.size(); i++){
            res[i] = a.get(i);
        }
        // for(int ab : a){
        //     res[ab] = a.get(ab);
        // }
        return res;
    }
    public static void main(String args[]){
        int[] arr1= {1,2,3};
        int[] arr2 = {2,2,1,3,2};

        int s[] = sol(arr1,arr2);

        for(int ab : s){
            System.out.print(ab + " ");
        }
    }
}
