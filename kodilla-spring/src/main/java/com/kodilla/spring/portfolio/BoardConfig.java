package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.IfDayIsOddCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;

public class BoardConfig {

    @Autowired
    @Qualifier("tasklist1")
    TaskList toDo;

    @Autowired
    @Qualifier("tasklist2")
    TaskList inProgress;

    @Autowired
    @Qualifier("tasklist3")
    TaskList done;

    @Bean
    public Board getBoard() {
        return new Board(toDo,inProgress,done);
    }

    @Bean(name = "tasklist1")
    @Scope("prototype")
    public TaskList getTaskList1() {
        return new TaskList();
    }

    @Bean(name = "tasklist2")
    @Scope("prototype")
    public TaskList getTaskList2() {
        return new TaskList();
    }

    @Bean(name = "tasklist3")
    @Scope("prototype")
    public TaskList getTaskList3() {
        return new TaskList();
    }
}


