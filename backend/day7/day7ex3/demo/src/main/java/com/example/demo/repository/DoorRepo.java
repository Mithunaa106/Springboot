
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Door;
import java.util.List;


public interface DoorRepo extends JpaRepository<Door,Integer>{
    List<Door> findByAccessType(String accessType);
}
