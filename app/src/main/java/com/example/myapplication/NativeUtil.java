package com.example.myapplication;

public class NativeUtil {
    //test native method
    public static native String sayHello();
    static {
        System.loadLibrary("mySayHelloJni");
    }


    public static void main(String args[]) {
    }

//public native void print(String content);
}
