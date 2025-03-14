package com.memory.lab_1.Service;

import com.memory.lab_1.Repository.RoleRepository;
import com.memory.lab_1.Repository.UserRepository;
import com.memory.lab_1.Role;
import com.memory.lab_1.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public User createUser(User user, Long roleId) {
        Role role = roleRepository.findById(roleId)
                .orElseThrow(() -> new RuntimeException("Role not found"));
        user.setRole(role);
        return userRepository.save(user);
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<User> updateUser(Long id, User newUser) {
        return userRepository.findById(id).map(user -> {
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            return userRepository.save(user);
        });
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}


