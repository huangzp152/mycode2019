package com.example.myapplication;

public class NativeUtil {
    //test native method
    static {
        System.loadLibrary("myJni");
    }
    public static native String sayHello();
}
