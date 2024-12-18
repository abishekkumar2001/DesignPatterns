package com.principles.design.service;

import com.principles.design.entity.Computer;
import com.principles.design.repo.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {

    @Autowired
    private ComputerRepository computerRepository;

    public Computer addComputer(Computer computer) {
        Computer computerDetails = Computer.builder()
                .CPU(computer.getCPU())
                .RAM(computer.getRAM())
                .storage(computer.getStorage())
                .GPU(computer.getGPU())
                .build();
        return computerRepository.save(computerDetails);
    }

    public List<Computer> getAllComputers() {
        return computerRepository.findAll();
    }
}
