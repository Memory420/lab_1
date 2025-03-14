package com.memory.lab_1.Repository;

import com.memory.lab_1.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
    
}

