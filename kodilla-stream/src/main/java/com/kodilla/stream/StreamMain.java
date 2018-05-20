package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        /*System.out.println("Welcome to module 7 - Stream");
        SaySomething saySomething = new SaySomething();
        saySomething.say();*/
/*
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

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
*/
        /*People.getList().stream()
                .forEach(System.out::println);
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));
        People.getList().stream()
                .filter(s -> s.length() >  11)
                .forEach(System.out::println);
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/
        /*BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/
        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/
        Forum forum = new Forum();
        Map<Integer , ForumUser> theResultMapOfForumUsers = forum.getUserList().stream()
                .filter( n -> n.getSex() == 'M')
                .filter( n -> Period.between( n.getDateOfBirth(), LocalDate.now()).getYears() > 20 )
                .filter(n -> n.getCountOfPosts() > 0)
                .collect(Collectors.toMap( ForumUser::getId , n-> n));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
