package user.management.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import user.management.app.model.User;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    void deleteUserById(Long id);

    Optional<User> findUserById(Long id);
}
