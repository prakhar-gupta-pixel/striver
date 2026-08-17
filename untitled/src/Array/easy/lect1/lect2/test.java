//package Arrays.easy.lect1.lect2;
//
//public class test {
//    static int []  get (int [] arr ,int d) {
//
//        int n =   arr.length;
//        d = d%n;
//        int [] temp = new int[d];
//
//        for ( int  i = 0 ; i<d ;i++){
//            temp[i] = arr[i];
//        }
//
//        for (int i =d ; i< n ; i++){
//
//            arr[i-d] = arr[i];
//        }
//        int i = 0;
//        for ( int j= n-d; j< n ; j++){
//            arr[j] = temp[i];
//            i++;
//        }
//
//
//
//
//    }
//}
