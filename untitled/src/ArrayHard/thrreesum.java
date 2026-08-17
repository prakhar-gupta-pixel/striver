package ArrayHard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class thrreesum {


    static ArrayList<ArrayList<Integer>> get(int [] arr) {
        int n = arr.length;



        HashSet<ArrayList<Integer>> set = new HashSet<>();



        for ( int i = 0 ; i< n; i++){
            int sum = 0;
//
//            sum+=arr[i];

            for ( int j = i+1 ; j< n; j++){


//                sum+=arr[j];

                for ( int k = j+1 ;k< n;k++){

                    sum+=arr[k];


                    if(arr[i]+arr[j]+arr[k]==0)
                    {

                        ArrayList<Integer> list = new ArrayList<>();
                        Collections.addAll(list,arr[i],arr[j],arr[k]);


                        Collections.sort(list);
                        set.add(list);
//                        finallist.add(list);
                    }

//                    sum=0;
                }
            }

        }


        ArrayList<ArrayList<Integer>> finallist = new ArrayList<>(set);


        return finallist;
    }


    static void main() {
        int [] arr = {-1,0,1,2,-1,-4};

        ArrayList<ArrayList<Integer>> anslist = get(arr);


        System.out.println(anslist);

    }
}
