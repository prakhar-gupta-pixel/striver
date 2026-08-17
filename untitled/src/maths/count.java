package maths;

public class count {
    static boolean  count(int n ) {
        int lastdigit = 0;
//       int rev_num = 0;
        int dup = 0;


        while (n > 0) {
            lastdigit = n % 10;

            dup += lastdigit * lastdigit * lastdigit;
            n = n / 10;
        }

        if (dup == n) {
            ;
            return true;
        } else {
            return false;
        }
    }

    static void main() {
        int  n = 7789;
        System.out.println(count(n));
    }
}
