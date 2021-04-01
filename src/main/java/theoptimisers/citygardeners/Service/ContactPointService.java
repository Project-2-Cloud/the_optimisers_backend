package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.ContactPointRepository;
import theoptimisers.citygardeners.Model.ContactPoint;

import java.util.List;

@Service
public class ContactPointService {
    @Autowired
    ContactPointRepository contactPointRepository;

    public List<ContactPoint> getAll() { return contactPointRepository.findAll(); }

}
