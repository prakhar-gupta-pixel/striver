//package Array.prefixsum;
//
//import java.util.HashMap;
//
//public class longestsubaaray {
//
//
//    static int longest(int [] arr , int key ) {
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0,-1);
//
//        int maxlen = Integer.MIN_VALUE;
//
//        int prefixsum = 0 ;
//
//
//
//        for(int i = 0 ;i< arr.length;i++) {
//
//            prefixsum += arr[i];
//
//            int needed = prefixsum - key;
//
//            if (map.containsKey(needed)) {
//                maxlen = Math.max(maxlen, i - map.get(map.containsKey(needed)));
//
//
//            }
//
//
//            if (!map.containsKey(prefixsum)) {
//                map.put(prefixsum, i);
//
//            }
//
//        }
//           return maxlen;
//        }
//
//    static void main() {
//
//        int [] arr = {}
//
//    }
//
//
//    }
//}
