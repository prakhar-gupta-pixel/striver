package recccu;

public class fourth {
    static void reverse(int i,int [] arr ,int n  ) {


        if ( i >= n/2)
            return ;

        //swap i and n-i-1

    int temp = arr[i];
    arr[i] = arr[n-i-1];
    arr[n-i-1] = temp;

    reverse( i+1, arr, n );

    }

    static void main() {

        int []  arr = {2,5,7,9};

        reverse(0, arr,arr.length);

        for ( int i : arr){
            System.out.print(i+" ");
        }
    }
}
