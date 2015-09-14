package com.skuranov.tasks;

import java.util.Random;

/**
 * Created by zivert on 14.09.2015.
 */
public class FirstTask {
    public static void main(String[] args)
    {
        int[] masSource = new int[100];
        Random random = new Random();
        for (int i = 0; i<masSource.length;i++){
            masSource[i] = random.nextInt(10000);
        }
        bubbleSort(masSource);
        int min1, min2, max1, max2, tempInt=1;
        min1 = masSource[0];
        max1 = masSource[masSource.length-1];
        while (true){
            if (tempInt == masSource.length-1){
                min2 = -1;
                tempInt = 1;
                break;
            }
            if (masSource[tempInt]>masSource[0]){
                min2 = masSource[tempInt];
                tempInt = 1;
                break;
            }
            else {
                tempInt++;
            }
        }

        while (true){
            if (tempInt == masSource.length-1){
                max2 = -1;
                break;
            }
            if (masSource[masSource.length-1]>masSource[masSource.length - (tempInt+1)]){
                max2 = masSource[masSource.length - (tempInt+1)];
                break;
            }
            else {
                tempInt++;
            }
        }

        System.out.println("Max numbers: " + max1 + "; " + max2);
        System.out.println("Min numbers: " + min1 + "; " + min2);
    }
    public static void bubbleSort(int[] arr){
        int min;
        for (int i = 0; i <arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
    }
}





