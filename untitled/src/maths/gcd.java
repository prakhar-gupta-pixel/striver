package maths;

public class gcd {
    static int gcdd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//


//    }


        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;


            else
                b = b % a;
        }

        if (a == 0)
            return b;

        else
            return a;

    }


    static void main() {
        int a = 34;
        int b = 24;
        System.out.println(gcdd(a, b));
    }

}