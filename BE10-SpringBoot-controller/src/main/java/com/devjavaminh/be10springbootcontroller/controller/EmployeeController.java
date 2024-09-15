package com.devjavaminh.be10springbootcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/employees")
public class EmployeeController {

    private List<String> employees = new ArrayList<>(List.of("John", "Jane", "Bob"));

    // Lấy danh sách nhân viên (GET)
    @GetMapping
    public List<String> getAllEmployees() {
        return employees;
    }

    // Lấy thông tin nhân viên dựa vào ID (GET)
    @GetMapping("/{id}")
    public String getEmployeeById(@PathVariable int id) {
        if (id < 0 || id >= employees.size()) {
            return "Nhân viên không tồn tại";
        }
        return employees.get(id);
    }

    // Thêm nhân viên mới (POST)
    @PostMapping
    public String addEmployee(@RequestBody String employeeName) {
        employees.add(employeeName);
        return "Đã thêm nhân viên: " + employeeName;
    }

    // Cập nhật thông tin nhân viên dựa vào ID (PUT)
    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody String employeeName) {
        if (id < 0 || id >= employees.size()) {
            return "Nhân viên không tồn tại";
        }
        employees.set(id, employeeName);
        return "Đã cập nhật nhân viên ID " + id + " thành " + employeeName;
    }

    // Xóa nhân viên dựa vào ID (DELETE)
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        if (id < 0 || id >= employees.size()) {
            return "Nhân viên không tồn tại";
        }
        String removedEmployee = employees.remove(id);
        return "Đã xóa nhân viên: " + removedEmployee;
    }
}
