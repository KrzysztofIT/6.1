package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator();
        if (calc.add(3,5) == 8 ){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }
        if (calc.subtract(8,2) == 6 ){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }
    }
}
