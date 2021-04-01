package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.ContactPointRepository;

@Service
public class ContactPointService {
    @Autowired
    ContactPointRepository repository;

}
