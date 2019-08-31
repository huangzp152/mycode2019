package com.example.myapplication;

public class NativeUtil {
    //test native method
    static {
        System.loadLibrary("mySayHelloJni");
    }
    public static native String sayHello();
}
