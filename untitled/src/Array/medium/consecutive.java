package Array.medium;

public class consecutive {



    static int max(int a , int b ) {

        if ( a>b )
            return a;
        else
            return b;

    }



    static boolean  search (int [] arr,int target ) {

        int n =arr.length;

        for ( int i=0;i<n;i++ ){
            if ( arr[i]==target){
                return true;
            }
        }

        return false;



    }


    static int get ( int [] arr ) {


        int m = arr.length;
        int max_count = 1;


        for (int i = 0; i < m; i++) {

            int start = arr[i];
            int count = 0;


            while (search(arr, start)) {


                count++;
                start++;


            }

            max_count = Math.max(max_count, count);


        }
        return max_count;


    }

    static void main() {
        int [] arr  = {100,4,200,1,3,2};

        System.out.println(get(arr));
    }
}
