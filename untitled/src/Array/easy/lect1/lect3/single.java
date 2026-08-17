package Array.easy.lect1.lect3;

public class single {

//    static int find(int[] arr) {
////        int count = 0;
//        int element = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//
//                }
//            }
//            if (count == 1) {
//                return arr[i];
//            }
//
//        }
//        return -1;
//    }
//
//    static void main() {
//        int [] arr = {1, 2, 2, 1, 5};
//        System.out.println(find(arr));
//    }
//}
static int find(int [] arr) {

    int n = arr[0];
    for (int i : arr) {
        if (arr[i] > n)
            n = arr[i];
    }
    int [] hash  = new int [n+1];
    for ( int i : arr){
        hash[arr[i]]++;
    }
    int element    = arr[0];
    for (int i: hash){
        if(hash[i]==1)
            element = i;
    }

    return element;
}

    static void main() {
        int [] arr = {2,1,3,2,3};
        System.out.println(find(arr));
    }
}