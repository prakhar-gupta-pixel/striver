package maths;

public class test {


//    static int count(int number ) {
//
//
//            int last_digit  = number  ;
//
//
//
//            int count = 0  ;
//
//
//
//        while ( last_digit>0 ) {
//
//            last_digit  = last_digit/10;
//        }
//    }


    static void swap(int [] arr , int a, int b) {


        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }


    static void move(int [] arr) {

        int j  = -1;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == 0 ) {
                j = i;
                break;
            }
        }

        if ( j == -1 ) {
            System.out.println("no change ");

        }


        for (int i = j+1; i < arr.length; i++) {

            if ( arr[i]!=0 ){

                swap(arr,i,j);


                j++;

            }
        }



    }


    static void main() {
        int [] arr = {1,2,0,4,0,6,7,0,9,10};
        move(arr);

        for ( int num : arr) {
            System.out.print(num + " ");
        }
    }
}
