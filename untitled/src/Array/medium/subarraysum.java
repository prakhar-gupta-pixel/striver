package Array.medium;

public class subarraysum {


    static int sum(int [] arr, int k) {


        int n =  arr.length;

        int i = 0;
        int j =0 ;
        int sum = 0;
        int max = Integer.MIN_VALUE;


        while(i<n && j<n){
            sum = sum +arr[j];

            if ((j-i+1)==k){

                max = Math.max(max,sum);
                i++;
                sum = sum - arr[i-1];

            }

            j++;


        }


        return max;



    }

    static void main() {
        int [] arr = {2,5,1,8,2,9,1};

        int k = 3;
        System.out.println(sum(arr,k));
    }
}
