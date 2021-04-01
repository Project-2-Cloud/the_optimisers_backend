package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.WorkshopRepository;

@Service
public class WorkshopService {
    @Autowired
    WorkshopRepository workshopRepository;

}
