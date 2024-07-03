package ru.app.springapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.app.springapp.entity.User;
import ru.app.springapp.repo.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUserById(long id) {
        return userRepository.findById(id);
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public List<User> getUserAll() {
        return userRepository.findAll();
    }
}
