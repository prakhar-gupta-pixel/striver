package ArrayHard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class thrsumbetter {


    static ArrayList<ArrayList<Integer>> get(int [] arr) {
        int n = arr.length;



        HashSet<ArrayList<Integer>> Finalset = new HashSet<>();


        int target  = 0 ;

        for ( int i = 0 ; i< n; i++){



            HashSet<Integer> set = new HashSet<>();

            for ( int j = i+1 ; j< n; j++){



                if(!(set.contains(target -(arr[j]+arr[i])))){

                    set.add(arr[j]);



                }

                if(set.contains(target -(arr[j]+arr[i]))){

                    ArrayList<Integer> list = new ArrayList<>();
                    Collections.addAll(list,arr[i],arr[j],target -(arr[j]+arr[i]));

                    set.add(arr[j]);
                    Collections.sort(list);
                    Finalset.add(list);


                }
            }

        }


        ArrayList<ArrayList<Integer>> finallist = new ArrayList<>(Finalset);


        return finallist;
    }


    static void main() {
        int [] arr = {-1,0,1,2,-1,-4};

        ArrayList<ArrayList<Integer>> anslist = get(arr);


        System.out.println(anslist);

    }
}
