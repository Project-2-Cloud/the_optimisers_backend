package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.UserRepository;
import theoptimisers.citygardeners.Model.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) { userRepository.save(user); }
}
