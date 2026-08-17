package HASHING;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class charhash {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str  =  input.nextLine();



        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        System.out.println("enter no. of queries  ");
        int q =  input.nextInt();

        while(q>0){

            System.out.println("enter query ");
            char chh ;
            chh =  input.next().charAt(0);

            System.out.println(map.getOrDefault(chh,0));

            q--;
        }
    }
}
