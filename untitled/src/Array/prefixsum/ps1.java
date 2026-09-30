package Array.prefixsum;

import java.util.HashMap;

public class ps1 {
    static int longestSubarray(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                prefixSum -= 1;
            } else {
                prefixSum += 1;
            }

            if (map.containsKey(prefixSum)) {

                int len = i - map.get(prefixSum);

                maxLen = Math.max(maxLen, len);

            } else {

                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }

    static void main() {
        int[] arr = {0,1,0,1};
        System.out.println(longestSubarray(arr));
    }
}
