package Array.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class majority {
    static int get (int [] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int  num : nums){

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        return Collections.max(map.values());
    }
}
