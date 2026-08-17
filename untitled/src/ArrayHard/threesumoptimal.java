package ArrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class threesumoptimal {


    static ArrayList<ArrayList<Integer >> get(int [] arr) {


         Arrays.sort(arr);

         int n = arr.length;

         ArrayList<ArrayList<Integer>> Anslist = new ArrayList<>();


         int k  = n-1;

         for ( int i =0 ; i<n ;i++ ) {


             if (i>0&& arr[i]==arr[i-1]) continue;

             int j =i+1;
             while (j<k)
             {
                 int sum =  arr[i]+arr[j] + arr[k];


                 if (sum<0){
                     j++;
                 }

                 else if (sum>0){
                     k--;
                 }


                 else {

                     ArrayList<Integer> list = new ArrayList<>();

                     Collections.addAll(list,arr[i],arr[j],arr[k]);


                     Anslist.add(list);
                     j++;
                     k--;

                     while( arr[j]==arr[j-1])j++;
                     while( arr[k]==arr[k-1])k--;

                 }
             }

         }




         return Anslist;

    }


    static void main() {
        int [] arr = {-1,0,1,2,-1,-4};

        System.out.println(get(arr));
            }
}
