package com.principles.design.controller;

import com.principles.design.entity.Computer;
import com.principles.design.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @PostMapping("/computers")
    public Computer addComputer(@RequestBody Computer computer){
        return computerService.addComputer(computer);
    }

    @GetMapping("/computers")
    public List<Computer>getAllComputers(){
        return computerService.getAllComputers();
    }

}
