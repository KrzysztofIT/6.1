package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Hibernate Task List";
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskListDaoFindByListName(){
        //Given
        TaskList taskList = new TaskList(7,LISTNAME,DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1 , readTaskList.size());
        Assert.assertEquals(listName , readTaskList.get(0).getListName());

        //Cleanup
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}