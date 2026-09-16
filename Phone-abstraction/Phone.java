package com.marius;

interface Phone{
    String phoneNumber="";

    public abstract void call();
    public static void getMyNumber(){
        System.out.println(phoneNumber);
    };
}