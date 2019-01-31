package com.company;

/*
 * print # 1 through 100
 * for multiples of 3, print "Fizz" instead
 * for multiples of 5, print "Buzz"
 * for #s that are multiples of both, print "FizzBuzz"
 * */


public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if (i%3== 0 && i%5==0) {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0) {
                System.out.println("Fizz");
            }
            else if (i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }


        }

    }

}
