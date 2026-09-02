package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class maxi {


    static List<Integer> get(int [] arr , int key )

    {
        int i = 0 ;
        int j = 0 ;
        int maxi = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();


        while (j<arr.length)
        {

            if( (j-i+1)==key){

                list.add(maxi);
                ans.add(list.getFirst());

                if ( arr[i] == list.getFirst()){

                    list.remove(arr[i]);
                }
                i++;
                j++;
                maxi = Math.max(maxi,arr[j]);
                list.add(maxi);


            }


            if ((j-i+1)<key){
                maxi = Math.max(maxi, arr[j]);
                j++;
            }


        }


        return ans;

    }

    static void main() {
            int [] arr = {1,3,-1,-3,5,3,6,7};

            List<Integer> ll = get(arr,3);
            for (Integer i : ll) {
                System.out.println(i);
            }

    }
}
