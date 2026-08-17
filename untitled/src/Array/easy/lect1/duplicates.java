package Array.easy.lect1;

import java.util.LinkedHashSet;
import java.util.Set;

public class duplicates {

    static int unique(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        int i = 0;
        for ( int num : set) {
            arr[i++] =  num;
        }


        return set.size();
    }

    static void main() {
        int[] arr = {2,6,9,6,3,1,6,0};
        System.out.println(unique(arr));
    }
}

