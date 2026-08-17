package Array.easy.lect1;

public class slargetst {

//    static int  slargest(int [] arr) {
//
//
//
//        int largest  = arr[0];
//
//        int slargest  = -1;
//
//
//        for ( int i = 1; i < arr.length; i++ ) {
//            if ( arr[i]> largest ){
//                slargest = largest;
//                largest = arr[i];
//
//
//            }
//
//            else if( arr[i]< largest  && arr[i] > slargest ) {
//                slargest = arr[i];
//
//            }
//
//        }
//        return slargest;
//    }
//
//    static int  smallest(int [] arr) {
//        int smallest   = arr[0];
//        int ssmallest  = Integer.MAX_VALUE;
//        for ( int i = 1; i < arr.length; i++ ) {
//            if ( arr[i] < ssmallest ){
//                ssmallest = smallest;
//                smallest = arr[i];
//            }
//
//            else if( arr[i] < ssmallest && arr[i] > smallest ) {
//                smallest = arr[i];
//            }
//        }
//        return smallest;
//
//
//
//
//
//    }


    static int slargest (int[] arr) {

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }



        int second_largest  = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > second_largest  &&  arr[i] < largest) {
                second_largest = arr[i];
            }
        }



        return second_largest;
    }


    static void main() {
        int[] arr = {2,6,9,3,1,6,0};
        System.out.println(slargest(arr));
    }
}
