package theoptimisers.citygardeners.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import theoptimisers.citygardeners.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
