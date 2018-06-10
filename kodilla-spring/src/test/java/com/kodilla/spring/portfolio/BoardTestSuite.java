package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {

    @Test
    public void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        /*ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");*/

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        Board board = context.getBean(Board.class);
        //board.getDoneList();
        /*board.toDoList.tasks.add("first task in toDoList");
        board.inProgressList.tasks.add("first task in inProgressList");
        board.doneList.tasks.add("first task in doneList");*/
        //Then
    }
}
