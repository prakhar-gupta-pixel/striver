package Array;

public class lect4optimal {

    static int max(int a , int b ) {

        if ( a>b )
            return a;
        else
            return b;

    }

    static void get(int [] arr , int target ) {
        int left = 0;
        int right = 0;

        int currentsum = 0;
        int max_len = 0;



        while (right < arr.length) {

            while(currentsum > target && left <= right){
                currentsum -= arr[left];
                left++;
            }

            if ( currentsum == target){

                max_len  = max( max_len , right-left+1);

            }

            if(currentsum <target){

                right++;
                currentsum += arr[right];
            }
        }

    }
}
