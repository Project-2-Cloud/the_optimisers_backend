package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.WorkshopRepository;
import theoptimisers.citygardeners.Model.Workshop;

import java.util.List;

@Service
public class WorkshopService {
    @Autowired
    WorkshopRepository workshopRepository;

    public List<Workshop> getAll() { return workshopRepository.findAll(); }

    public List<Workshop> getAllFromUser(Iterable<Long> userid) { return workshopRepository.findAllById(userid); }

}
