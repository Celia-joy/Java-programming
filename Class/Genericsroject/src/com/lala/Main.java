package com.lala;

class Main {
    public static void main (String[]args){
        K k = (x,y) -> x + y;
        int sum = k.display(7,9);
        System.out.println("Sum: " + sum);
    }
}