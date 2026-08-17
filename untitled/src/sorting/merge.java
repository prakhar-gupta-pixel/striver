package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class merge {


    static void merge (int [] arr, int low,int mid, int high) {

    List<Integer> list = new ArrayList<Integer>();
    int left = low;
    int right = mid+1;

    while (left <= mid && right <= high) {
        if (arr[left] < arr[right]) {
            list.add(arr[left]);
            left++;
        }
        else   {
            list.add(arr[right]);
            right++;
        }

    }

    while ( left <= mid) {
        list.add(arr[left]);
        left++;
    }
    while (right <= high) {
        list.add(arr[right]);
        right++;
    }
    for (int i = 0  ; i < list.size() ; i++) {

        arr[i+low] = list.get(i);
    }


    }
    static void ms(int [] arr  , int low , int high) {


        if( low== high)
            return ;

        int mid = low + (high - low)/2;



        ms(arr , low , mid);
        ms(arr , mid + 1 , high);
        merge(arr,low,mid,high);
        }


    static void main() {

        Scanner sc = new Scanner(System.in);

        int [] ar  = new int [10];
        for  (int i = 0; i < 10; i++) {

            System.out.print("Enter number "+(i+1)+" : ");
            ar[i] = sc.nextInt();
        }

        ms(ar,0,ar.length-1);

        // printing

        for ( int i = 0; i < 10; i++) {
            System.out.print(ar[i]);
        }
    }
    }
