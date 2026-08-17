package Array;

public class lect4 {

    static int max(int a , int b ) {

        if ( a>b )
            return a;
        else
            return b;

    }
    static int get(int [] arr , int target ) {
        int sum =0 ;
        int n = arr.length;
        int max_len = -1;
        for( int i = 0 ; i< n; i++ )
        {
            for ( int j = i ; j< n ; j++)
            {
                sum += arr[j];

                if ( sum == target )
                    max_len =  max( max_len , j-i+1);




            }
            sum = 0;
        }

        return max_len;
    }


    static void main() {
        int [] arr = {1,2,3,5,1,1,1,3,1};

        System.out.println(get(arr,3));
    }
}
