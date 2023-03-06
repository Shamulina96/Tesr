package org.example;

public class Singleton2 {
    private static Singleton2 sing = new Singleton2();

    private Singleton2(){

    }
    public static Singleton2 a(){
       return sing;
    }
}
