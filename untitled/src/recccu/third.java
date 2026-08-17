package recccu;

public class third {
    static int fact(int n ) {


        if ( n == 1)
            return 1;
        return n * fact(n - 1);


    }

    static void main() {
        System.out.println(fact(3));
    }
}
