package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {


    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public List<TaskDto> getTask() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTasks")
    public void deleteTask() {
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateTasks")
    public TaskDto updateTask() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTasks")
    public void createTask() {
    }
}