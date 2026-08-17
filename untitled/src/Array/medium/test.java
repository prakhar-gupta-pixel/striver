package Array.medium;

public class test {


    static int max(int a , int b ) {

        if ( a>b )
            return a;
        else
            return b;

    }



    static int get (int [] arr ,int target ) {

        int i = 0 ;
        int j = 0 ;

        int sum = 0 ;
        int max_length = 0 ;

        while(i<arr.length){


            if ( sum < target ){
                sum+= arr[i] ;
                i++;
            }


            while(sum>target&& j<=i){

                sum  = sum - arr[j] ;
                j++;


            }



            if ( sum == target ){
                max_length = max(max_length , i-j+1 ) ;
            }




        }

        return max_length;


    }

    static void main() {
        int [] arr  = {1,2,3,1,1,1,1,3,3};

        System.out.println(get(arr,6));
    }
}
