package theoptimisers.citygardeners.Model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "SALE")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Long id;

    @NotNull(message = "for sale id can not be empty")
    @Column(name = "for_sale_id")
    private Long forSaleId;

    @NotNull(message = "buyer id can not be empty")
    @Column(name = "buyer_id")
    private Long buyerId;

    @NotNull(message= "ammount can not be empty")
    @Positive(message= "ammount has to be positive")
    @Column(name = "ammount")
    private Integer ammount;

    public Sale(Long id, Long forSaleId, Long buyerId, @Positive Integer ammount) {
        this.id = id;
        this.forSaleId = forSaleId;
        this.buyerId = buyerId;
        this.ammount = ammount;
    }
    public Sale(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getForSaleId() {
        return forSaleId;
    }

    public void setForSaleId(Long forSaleId) {
        this.forSaleId = forSaleId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }
}
