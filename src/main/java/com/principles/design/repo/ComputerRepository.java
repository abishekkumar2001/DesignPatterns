package com.principles.design.repo;

import com.principles.design.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer,Integer> {

}
