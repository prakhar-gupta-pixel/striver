package Array.prefixsum;

import java.util.HashMap;

public class divisible {


    static int count(int [] arr, int key) {


        int prefix_sum = 0;
        int rem = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);
        int count  = 0;


        for ( int x : arr){

            prefix_sum += x;
            rem = prefix_sum % key ;

            if (rem<0 ){
                rem += key;
            }


            if ( map.containsKey(rem)){
                count+= map.get(rem);

            }

            map.put(rem, map.getOrDefault(rem,0)+1);
        }

        return count;



    }


    static void main() {
        int [] arr = {4,5,5};
        int key = 5;
        System.out.println(count(arr,key));
    }

}
