package HASHING;

import java.util.Scanner;

public class charhash2 {
    static void main() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter String ");
        String str = input.nextLine();

        int [] hash = new int [256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }



        int q = input.nextInt();
        while(q>0) {
            char ch = input.next().charAt(0);
            System.out.print(hash[ch]);
            q--;
        }
    }
}
