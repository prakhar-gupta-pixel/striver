package maths;

public class div {
    static void print_div(int n) {

        int count  = 0;
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
//                System.out.println(i);
                count++;


                if ((n / i != i)) {
//                    System.out.println(n / i);
                    count++;

                }
            }
        }
        if  (count == 2) {
            System.out.println("prime");
        }

        else {
            System.out.println("not prime");
        }
    }

    static void main() {
        print_div(29);
    }
}
