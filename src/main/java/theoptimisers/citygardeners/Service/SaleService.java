package theoptimisers.citygardeners.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theoptimisers.citygardeners.DB.SaleRepository;
import theoptimisers.citygardeners.Model.Sale;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public Sale addSale(Sale sale) { return saleRepository.save(sale); }


}
