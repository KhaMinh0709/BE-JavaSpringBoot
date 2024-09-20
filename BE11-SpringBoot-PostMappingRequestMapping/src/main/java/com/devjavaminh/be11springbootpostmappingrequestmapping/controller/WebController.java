package com.devjavaminh.be11springbootpostmappingrequestmapping.controller;

import com.devjavaminh.be11springbootpostmappingrequestmapping.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    // Xử lý yêu cầu POST để thêm công việc
    @PostMapping("/addTodo")
    public String addTodo(@ModelAttribute Todo todo) {
        // Thêm công việc vào cơ sở dữ liệu hoặc danh sách công việc
        // Trả về trang thành công
        return "success";
    }
}