public class MaxRob {
    public static int rob(int [] arr){
        int rob=0, notRob=0;
        for(int i=0; i<arr.length; i++){
            int curr = notRob+arr[i];
            notRob = Math.max(rob,notRob);
            rob = curr;
        }
        return Math.max(rob,notRob);
    }
    public static void main(String args[]){
        int [] arr = {2,1,1,2};
        System.out.println(rob(arr));
    }
}

// public static int rob(int[] num) {
//     int rob = 0; //max monney can get if rob current house
//     int notrob = 0; //max money can get if not rob current house
//     for(int i=0; i<num.length; i++) {
//         int currob=0;
//         System.out.println("currob = notrob + num[i] "+ currob + " " + notrob+ " " + num[i]);
//         currob = notrob + num[i];
//         System.out.println("currob " + currob);
//          //if rob current value, previous house must not be robbed
//         notrob = Math.max(notrob, rob); //if not rob ith house, take the max value of robbed (i-1)th house and not rob (i-1)th house
//         System.out.println("notrob = Math.max(notrob, rob) " + notrob);
//         rob = currob;
//         System.out.println("rob = currob " + rob );

//     }
//     return Math.max(rob, notrob);
// }
// public static void main(String args[]){
//     int[] a= {1,2,3,1};
//     System.out.println(rob(a));

// }

