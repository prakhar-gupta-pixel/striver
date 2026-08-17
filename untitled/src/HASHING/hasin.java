package HASHING;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hasin {

    static void main() {

        System.out.print("Enter the size of an array : ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] arr =  new int [size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            arr[i] = input.nextInt();
        }


        Map<Integer, Integer> map = new HashMap<>();
        for ( int num : arr ) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }




        System.out.println("enter no. of queries  ");
        int q =  input.nextInt();

        while(q>0){

                System.out.println("enter query ");
                int number = 0;
                number  = input.nextInt();

                System.out.println(map.getOrDefault(number,0));

                q--;
        }
    }
}
