package Array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leader {


    static List<Integer> leader(int [] nums ) {

        int leader= Integer.MIN_VALUE;
        int  n = nums.length;
        int maxi =  Integer.MIN_VALUE;

        List<Integer> list = new ArrayList<>();

        for ( int i  = n -1; i>=0; i-- ) {

            if( nums[i] > maxi ){
                maxi = nums[i];
                list.add(nums[i]);




            }



        }

        Collections.reverse(list);

        return list ;



    }

    static void main() {
        int [] arr = {10,22,12,3,0,6};

        List<Integer> ans = leader(arr);
        ans = leader(arr);


        for (  int num : ans)
        {
            System.out.println(num);
        }
    }
}
