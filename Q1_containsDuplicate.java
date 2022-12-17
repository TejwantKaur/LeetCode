import java.util.HashSet;
public class containsDuplicate {
    public static boolean cd(int[] arr){
        HashSet <Integer> h = new HashSet<>();
        for(int n: arr){
            if(h.contains(n)){
                return true;
            } else{
                h.add(n);
            }
        } return false;
    }
    public static void main(String args[]){
        int arr[] = {1,3,5,7,4};
        System.out.println(cd(arr));
    }   
}
