package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.UserContactPointRepository;
import theoptimisers.citygardeners.DB.UserWorkshopRepository;

@Service
public class UserWorkshopService {
    @Autowired
    UserWorkshopRepository userWorkshopRepository;

}
