package Array.medium;
import java.util.Arrays;


public class sign {
    static int [] get (int [] nums) {


        int n = nums.length;
        int[] ans = new int[n];
        int posi = 0;
        int negi = 1;


        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {
                ans[posi] = nums[i];
                posi += 2;
            }

            if (nums[i] < 0) {

                ans[negi] = nums[i];
                negi += 2;

            }


        }



        return ans;

    }






































//        int n = nums.length;
//        int [] pos = new int[n/2];
//        int [] neg = new int[n/2];
//
//
//        int j =0 ;
//        int k = 0;
//        for ( int i  = 0 ; i< n ; i++)
//        {
//            if (nums[i]>0){
//                pos[j] = nums[i];
//                j++;
//            }
//
//            if (nums[i]<0){
//                neg[k] = nums[i];
//                k++;
//            }
//        }
//
//        for ( int i =0 ; i < n/2 ; i++){
//
//            nums[2*i] = pos[i];
//            nums[2*i+1] = neg[i];
//        }
//
//        return nums;

        //}

    static void main() {
        int[] arr= {-2,4,5,-8,-9,3};

        System.out.println(Arrays.toString(get(arr)));

    }
}
