package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class firstnegative {


    static List<Integer> get(int [] arr, int k )  {


        int n = arr.length;
        int i = 0 ;
        int j = 0 ;

        List<Integer> list = new ArrayList<>();

        List<Integer> ans  = new ArrayList<>();








            while(j<n){

                if (arr[j]<0){

                    list.add(arr[j]);
                }

                if (j-i+1<k){
                    j++;

                }
                else if (j-i+1==k){

                    if(list.isEmpty()){

                        ans.add(0);

                    }
                    else{
                        ans.add(list.getFirst());
                    }

                    if (arr[i] < 0) {
                        list.removeFirst();
                    }

                    i++;
                    j++;

                }

            }

            return ans;

    }

    static void main() {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};

        int k = 3;

        List<Integer> ans = get(arr, k);

        System.out.println(ans);


    }
}
