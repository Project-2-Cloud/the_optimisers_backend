package theoptimisers.citygardeners.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import theoptimisers.citygardeners.Model.Workshop;

public interface WorkshopRepository extends JpaRepository<Workshop, Long> {
}
