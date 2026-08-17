package HASHING;

import java.util.Scanner;

public class hashtwo {
    static void main() {
        System.out.print("Enter the size of an array : ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] arr =  new int [size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            arr[i] = input.nextInt();
        }


        //precomputation


        int [] hash  = new int [13];
        for  (int i = 0; i <size; i++) {
            hash[arr[i]] +=1;

        }


        System.out.println("enter no. of queries  ");
        int q =  input.nextInt();

        while(q>0){

            System.out.println("enter query ");
            int number = 0;
            number  = input.nextInt();
            System.out.println( hash[number] );





            q--;
        }
    }
}
