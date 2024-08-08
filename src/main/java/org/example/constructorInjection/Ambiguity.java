package org.example.constructorInjection;

public class Ambiguity {

    Ambiguity(int a, int b){
        System.out.println("Inside int constructor");
    }

    Ambiguity(double a, double b){
        System.out.println("Inside double constructor");
    }

    Ambiguity(String a, String b){
        System.out.println("Inside String constructor");
    }

}
