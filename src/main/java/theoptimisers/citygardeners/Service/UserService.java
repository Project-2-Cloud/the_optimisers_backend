package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
}
