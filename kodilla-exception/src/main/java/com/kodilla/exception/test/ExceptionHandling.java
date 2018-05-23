package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){

        SecondChallenge sec = new SecondChallenge();
        try {
            String result = sec.probablyIWillThrowException(2.0,1.5);
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Exception occurred");
        }

    }
}
