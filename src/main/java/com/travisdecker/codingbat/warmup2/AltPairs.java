package com.travisdecker.codingbat.warmup2;

public class AltPairs {

    public static String altPairs(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() + 1; i = i + 3){
            if(1>str.length())
                break;
            sb.append(str.charAt(i++));
            if(i+2>str.length())
                break;;
            sb.append(str.charAt(i));
        }
        return sb.toString();

    }

}
