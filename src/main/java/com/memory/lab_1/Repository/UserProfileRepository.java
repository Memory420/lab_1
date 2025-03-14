package com.memory.lab_1.Repository;

import com.memory.lab_1.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}

