package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;
public class Studio2 {
    public static void main(String[] args) {
        String qoute = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        System.out.print(qoute);
        char[] charactersInqoute = qoute.toCharArray();

        HashMap<Character, Integer> map = new HashMap <>();

        for(int i =0; i< charactersInqoute.length; i++){
            map.put(charactersInqoute[i], 0);
        }
        for(Map.Entry<Character, Integer> keyValuePair : map.entrySet()){
            int count = 0;
            char keyChar = keyValuePair.getKey();
            for(int j=0; j< charactersInqoute.length;j++){
                if(keyChar == charactersInqoute[j]){
                    count += 1;
                    keyValuePair.setValue(count);
                }
            }System.out.println(keyValuePair.getKey() + ":" + keyValuePair.getValue());
        }
    }
}