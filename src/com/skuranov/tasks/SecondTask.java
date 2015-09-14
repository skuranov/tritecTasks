package com.skuranov.tasks;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zivert on 14.09.2015.
 */
public class SecondTask {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the base number");
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int baseNumber = Integer.parseInt(reader.readLine());
        int sum=0;
        while(baseNumber != 0){
            sum = sum + (baseNumber % 10);
            baseNumber/=10;
        }
        System.out.println(sum + " ");
    }
}
