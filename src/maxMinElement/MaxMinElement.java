package maxMinElement;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 11/03/22
 * Time: 20:01
 */


public class MaxMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nSize of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("\nElements of the array (space seperated): ");
        for(int index = 0; index < size; index++) {
            arr[index] = sc.nextInt();
        }

        System.out.print("\nEnter the value of k: ");
        int k = sc.nextInt();

        System.out.print("\nMax or Min ?: ");
        String choice = sc.next();

        for (int index0 = 0; index0 < arr.length; index0++) {
            for (int index1 = 0; index1 < arr.length-index0-1; index1++) {
                if (arr[index1] > arr[index1 + 1]) {
                    int temp = arr[index1];
                    arr[index1] = arr[index1+1];
                    arr[index1+1] = temp;
                }
            }
        }

        int targetElement;
        if(choice.equalsIgnoreCase("max")) {
            targetElement = arr[arr.length - k];
        }
        else {
            targetElement = arr[k - 1];
        }

        System.out.print("\nKth " + choice + " element in the array: ");
        System.out.println(targetElement);

    }
}
