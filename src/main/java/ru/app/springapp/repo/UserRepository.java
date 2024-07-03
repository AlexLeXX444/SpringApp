package ru.app.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.app.springapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
    User findByName(String name);
}
