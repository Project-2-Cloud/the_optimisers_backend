package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.ContactPointRepository;
import theoptimisers.citygardeners.DB.ForSaleRepository;

@Service
public class ForSaleService {
    @Autowired
    ForSaleRepository forSaleRepository;

}