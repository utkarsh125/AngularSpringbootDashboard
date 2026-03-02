package com.vw.EmployeeProject.controller;

import com.vw.EmployeeProject.dto.EmployeeDto;
import com.vw.EmployeeProject.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmployeeDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public EmployeeDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public EmployeeDto create(@RequestBody EmployeeDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public EmployeeDto update(@PathVariable Long id,
                              @RequestBody EmployeeDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}