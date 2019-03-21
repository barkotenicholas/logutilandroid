package com.example.logutil2;

import android.util.Log;

public class LogDebug {

    public static int Plus(int a, int  b){
        return  a+b;
    }
    public static int Minus(int a, int  b){
        return  a-b;
    }
    public static int Times(int a, int  b){
        return  a-b;
    }
    public static float Divide(int a, int  b){
        if(b == 0){
            throw  new IllegalArgumentException("cannot divide by zero");
        }
        else {
            return a/b;
        }
    }

}
