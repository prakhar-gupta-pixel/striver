package recccu;

public class first {
    static void print(int i, int n) {


        if (i > n)
            return;
        else
            print(i + 1, n);

        System.out.println(i);

    }

    static void main() {
        print(1, 2);
    }
}
