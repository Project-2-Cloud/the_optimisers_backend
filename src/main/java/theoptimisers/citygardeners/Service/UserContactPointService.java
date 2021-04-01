package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.UserContactPointRepository;


@Service
public class UserContactPointService {
    @Autowired
    UserContactPointRepository userContactPointRepository;

}
