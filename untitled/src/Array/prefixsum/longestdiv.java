//package Array.prefixsum;
//
//import java.util.HashMap;
//
//public class longestdiv {
//    static int find(int [] arr , int key ) {
//
//
//
//
//        int prefixsum = 0;
//
//        int maxlen = Integer.MIN_VALUE;
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        map.put (0,-1);
//
//        int rem = 0;
//
//
//        for(int i=0;i<arr.length;i++){
//
//            prefixsum += arr[i];
//
//            rem   = prefixsum % key ;
//
//
//            if(rem < 0)
//            {
//
//                rem += key;
//
//
//        }
//
//
//            if(map.containsKey(rem)){
//
//
//
//            }
//
//            if(!map.containsKey(rem)){
//
//
//            }
//        }
//    }}
