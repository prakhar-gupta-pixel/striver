package Array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {
//    static int[] get(int[] arr,int target) {
//
//        int n = arr.length;
//        int j  = n-1;
//        int sum  = 0 ;
//
//        int i  =0;
//        while ( i< j ){
//
//            sum = arr[i]+arr[j];
//            if ( sum== target ){
//                break;
//            }
//            else  if (sum>target){
//                j--;
//            }
//            else if (sum<target){
//                i++;
//            }
//
//        }
//
//
//        int [] ans = {i+1,j+1};
//        return ans;
//    }
//
//
//    static void main() {
//        int [] arr  = {2,7,11,15};
//
//        System.out.println(Arrays.toString(get(arr, 9)));
//
//
//    }


    static int[]  get (int [] arr, int target ) {


        Map<Integer, Integer> map = new HashMap<>();

//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i], i);
//        }
//        for  (int i = 0; i < arr.length; i++) {
//
//            if (map.containsKey(target-arr[i])) {
//                int a =  map.get(target-arr[i]);
//                return new int[]{i + 1, a + 1};
//            }
//
//        }



        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(target -arr[i])) {
                return new int[] {map.get(target - arr[i])+1,i+1};


            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};


    }


    static void main() {
        int [] arr  = {3,6,7,9};
        System.out.println(Arrays.toString(get(arr, 12)));
    }
}


