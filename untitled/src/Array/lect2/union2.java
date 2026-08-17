//package Array.lect2;
//
//import java.util.*;
//
//public class union2 {
//
////    static int [] union(int [] arr1,int [] arr2) {
////
////        Set<Integer> set = new HashSet<>();
////
////        for(int num : arr1){
////            set.add(num);
////        }
////
////        for (int num : arr2){
////            set.add(num);
////        }
////
////        int [] result = new int [set.size()];
////
////
////        int i = 0;
////        for (int num : set){
////            result[i++] = num ;
////        }
////
////
////        return result;
////
////    }
////
////
////    static int [] union (int [] arr1, int [] arr2) {
////
////
////        int n  =  arr1.length;
////        int m  =  arr2.length;
////
////        int i = 0 ;
////        int j = 0 ;
////
////
////        while( i < n && j < m){
////
////            if ((arr1[i]<arr2[j])&& ){}
////        }
////
////    }
//
//
//    static int [] intersection (int [] arr1, int [] arr2) {
//
//
//
//        int i =  0 ;
//        int j = 0 ;
//
//
//        List<Integer> list = new ArrayList<>();
//
//
//
//        while (i < arr1.length && j < arr2.length){
//
//
//
//
//            if (arr1[i]<arr2[j]){
//
//                i++;
//            }
//
//
//            if ( arr1[i]>arr2[j]){
//
//
//                j++;
//
//            }
//
//
//
//            if ( arr1[i]==arr2[j]){
//
//
//                list.add(arr1[i]);
//                i++;
//                j++;
//
//
//            }
//
//
//
//
//        }
//
//
//         Integer [] result = list.toArray(new Integer [0]);
//
//
//
//
//
//
//
//
//    }
//
//
//    static void main() {
//        int [] arr1 = {1,2,3,4,5};
//        int [] arr2 = {1,2,7,4,6};
//
//
//        System.out.println(Arrays.toString(union(arr1,arr2)));
//    }
//}
