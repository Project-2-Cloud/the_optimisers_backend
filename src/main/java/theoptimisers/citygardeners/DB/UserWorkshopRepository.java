package theoptimisers.citygardeners.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import theoptimisers.citygardeners.Model.UserWorkshop;

public interface UserWorkshopRepository extends JpaRepository<UserWorkshop, Long> {
}
