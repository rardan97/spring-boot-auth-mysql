package com.blackcode.spring_boot_auth_mysql.service;

import com.blackcode.spring_boot_auth_mysql.model.User;
import com.blackcode.spring_boot_auth_mysql.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private BCryptPasswordEncoder encodeer = new BCryptPasswordEncoder(12);
    public void save(User user) {
        user.setPassword(encodeer.encode(user.getPassword()));
        userRepository.save(user);
    }
}
