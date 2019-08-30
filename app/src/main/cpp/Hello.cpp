//
// Created by huangziping on 19-8-26.
//
#include<jni.h>
extern "C"
JNIEXPORT jstring JNICALL
//Java_包名下划线_c++类名_c++类方法名(JNiEnv * env, jclass type)
Java_com_example_myapplication_NativeUtil_sayHello(JNIEnv *env, jclass type) {
    return env->NewStringUTF("hello")
}

