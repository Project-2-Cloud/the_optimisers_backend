package theoptimisers.citygardeners.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import theoptimisers.citygardeners.Model.ContactPoint;

public interface ContactPointRepository extends JpaRepository<ContactPoint, Long> {
}
