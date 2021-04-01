package theoptimisers.citygardeners.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import theoptimisers.citygardeners.Model.UserContactPoint;

public interface UserContactPointRepository extends JpaRepository<UserContactPoint, Long> {
}
