package Array.medium;

import java.util.HashMap;

public class tstgd {


    static int count(int [] arr,int key) {

        HashMap<Integer, Integer> map = new HashMap<>();

         int prefixsum =0 ;

         int maxlen = Integer.MIN_VALUE;

         map.put(0,-1);




         for (int i = 0; i < arr.length; i++) {


             prefixsum += arr[i];
             int needed = prefixsum-key;

             if (map.containsKey(needed)) {
                 maxlen = Math.max(maxlen, i-map.get(needed));

             }


             if (!map.containsKey(prefixsum)) {
                 map.put ( prefixsum, i);

             }

//             return maxlen;
         }

         return maxlen;






















//        HashMap<Integer, Integer> map = new HashMap<>();
//
//         int prefixsum =0 ;
//         int count = 0 ;
//
//         map.put(0,1);
//
//         for ( int x : arr){
//
//             prefixsum += x;
//
//             int needed = prefixsum -key ;
//
//             if (map.containsKey(needed)){
//                 count+= map.get(needed);
//
//             }
//
//             map.put(needed,map.getOrDefault(needed,0)+1);
//         }
//
//
//         return count;
    }

    public static void main(String[] args) {


            int [] arr = {1,2,3};

        System.out.println(count(arr,3));



    }
}