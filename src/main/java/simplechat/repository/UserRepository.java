package simplechat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import simplechat.model.User;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    public User findByUsername(String username);
}
