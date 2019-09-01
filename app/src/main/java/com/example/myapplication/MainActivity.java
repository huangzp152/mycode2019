package com.example.myapplication;

//import android.app.Activity;
//import android.app.Activity;
//import android.os.Bundle;

//import androidx.annotation.Nullable;
//extends Activity
public class MainActivity  {

    static {
        System.loadLibrary("mySayHelloJni");
    }
    public static native String sayHello();

    public static void main(String[] args) {

    }
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        NativeUtil.sayHello();
//    }
}
