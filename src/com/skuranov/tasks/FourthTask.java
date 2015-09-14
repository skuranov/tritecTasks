package com.skuranov.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * Created by zivert on 15.09.2015.
 */
public class FourthTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter price in USD with NDS:");
        BigDecimal usdPrice = new BigDecimal(Float.parseFloat(reader.readLine()));
        System.out.println("Enter quantity:");
        BigDecimal quantity = new BigDecimal(Integer.parseInt(reader.readLine()));
        System.out.println("Enter USD rate:");
        BigDecimal usdRate = new BigDecimal(Float.parseFloat(reader.readLine()));
        float NDS = 18;
        BigDecimal rubPriceWithoutNDS = usdPrice.multiply(usdRate).multiply(new BigDecimal(100.00)).divide
                (new BigDecimal(100.00+NDS),BigDecimal.ROUND_HALF_UP);
        BigDecimal rubSummNDS = usdPrice.multiply(usdRate).multiply(new BigDecimal(NDS)).divide
                (new BigDecimal(100.00), BigDecimal.ROUND_HALF_UP).multiply(quantity);
        BigDecimal commonRubSumm = usdPrice.multiply(quantity).multiply(usdRate);
        System.out.println("Price RUB without NDS: "+ rubPriceWithoutNDS);
        System.out.println("Summ NDS: "+ rubSummNDS);
        System.out.println("Common summ RUB: " + commonRubSumm);
    }
}
