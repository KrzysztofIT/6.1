package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        /*System.out.println("Welcome to module 7 - Stream");
        SaySomething saySomething = new SaySomething();
        saySomething.say();*/

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Processor processor2 = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text 2 .");
        processor2.execute(codeToExecute);

        Processor processor3 = new Processor();
        processor3.execute(() -> System.out.println("This is an example text 3."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        ExpressionExecutor expressionExecutor2 = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor2.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor2.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor2.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor2.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor2.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor2.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor2.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor2.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //zadanie 7.1
        PoemBeautifier str1 = new PoemBeautifier();
        str1.beautify("Ala ma kota" , a -> a + "ABC");
        str1.beautify("Ala ma kota" , a -> a.toUpperCase());
        str1.beautify("Ala ma kota" , a -> a + " " +  a);
        str1.beautify("Ala ma kota" , a -> a.concat(" i psa"));

    }
}
