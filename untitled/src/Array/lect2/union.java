//package Arrays.lect2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class union {
//
//
//    static int [] union(int [] arr1,int [] arr2) {
//
//
//        List<Integer> list = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//
//        while(i<arr1.length && j<arr2.length){
//            if ( arr1[i]< arr2[j]){
//
//
//
//                if ( list.isEmpty() || (!list.contains(arr1[i]))){
//                    list.add(arr1[i]);
//                }
//                i++;
//            }
//
//            else if  (arr2[j]< arr1[i]){
//                if (list.isEmpty() || (!list.contains(arr2[j]))){
//                    list.add(arr2[j]);
//                }
//                j++;
//            }
//
//        }
//
//        while (i < arr1.length) {
//            if (list.isEmpty() ||  (!list.contains(arr1[i])))
//                list.add(arr1[i]);
//            i++;
//        }
//
//        while (j < arr2.length) {
//            if (list.isEmpty() ||  (!list.contains(arr1[j])))
//                list.add(arr1[j]);
//            i++;
//        }
////
//        }
//    }
//}
