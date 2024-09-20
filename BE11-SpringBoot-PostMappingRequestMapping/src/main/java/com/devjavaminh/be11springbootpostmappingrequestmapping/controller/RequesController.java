package com.devjavaminh.be11springbootpostmappingrequestmapping.controller;

import com.devjavaminh.be11springbootpostmappingrequestmapping.model.Todo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class RequesController {
    @RequestMapping(value = "/addToDo", method = RequestMethod.GET)
    public String addTodo(Model model) {

        return "add to do";
    }

    @RequestMapping(value = "/addToDo", method = RequestMethod.POST)
    public String addTodo2(Todo todo) {
        return "success";
    }
}
