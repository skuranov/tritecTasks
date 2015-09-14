package com.skuranov.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by zivert on 14.09.2015.
 */
public class ThirdTask {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the position of character:");
        int charPos = Integer.parseInt(reader.readLine());
        char maxChar = maxCharRet(charPos);
        String s = strRet(maxChar);
        System.out.println("Position of character is : " + s.substring(charPos-1,charPos));
    }


    static char maxCharRet(int numChar){
        char maxChar = 'a';
        int tmpNumChar=1;
        while (numChar>tmpNumChar){
            tmpNumChar=tmpNumChar*2+1;
            maxChar++;
        }
        return maxChar;
    }
    static String strRet (char maxChar){
        char curChar = 'a';
        String outStr = "a";
        while(true){
            if (maxChar==curChar){
                break;}
            else {
                outStr = outStr + outStr + (++curChar);
            }
        }
        return outStr;
    }

}
