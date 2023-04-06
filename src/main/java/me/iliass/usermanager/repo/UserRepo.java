package me.iliass.usermanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import me.iliass.usermanager.model.User;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    void deleteUserById(Long id);

    Optional<User> findUserById(Long id);
}
