package Array;

import java.util.HashMap;
import java.util.Map;

public class lect4better {

    static int max(int a , int b ) {

        if ( a>b )
            return a;
        else
            return b;

    }
    static  int get (int [] arr , int target ) {

        int n =  arr.length;
        int currentsum = 0;
        int start = 0;
        int end = -1 ;
//        int count  = 0 ;
        int max_length = 0 ;

        Map<Integer,Integer> map = new HashMap<>();

        for( int i = 0 ; i<n ; i++){
            currentsum += arr[i];

            if( currentsum == target ){
                start = 0 ;
                end = i ;
                max_length = i+1;
            }

            if(map.containsKey(currentsum - target )){

                start  = map.get(currentsum - target)+1;
                end  = i ;
                max_length  = max( max_length , end - start + 1 );

            }

            if (!map.containsKey(currentsum))
            map.put(currentsum,i);

        }

        if ( end == -1 ){
            return -1;
        }
        else
            return max_length;
    }

    static void main() {

        int [] arr = { 10,15,-5,15,-10,5};
        System.out.println(get(arr, 5 ));




    }
}
