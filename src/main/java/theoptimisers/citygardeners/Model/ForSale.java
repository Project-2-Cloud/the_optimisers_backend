package theoptimisers.citygardeners.Model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "FOR_SALE")
public class ForSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "for_sale_id")
    private Long id;

    @NotNull(message= "vegetable id can not be empty")
    @Column(name = "vegetable_id")
    private Long vegetableId;

    @NotNull(message= "gardener id can not be empty")
    @Column(name = "gardener_id")
    private Long gardenerId;

    @NotNull(message= "ammount can not be empty")
    @Positive(message= "ammount has to be positive")
    @Column(name = "ammount")
    private Integer ammount;

    public ForSale(Long id, Long vegetableId, Long gardenerId, @Positive Integer ammount) {
        this.id = id;
        this.vegetableId = vegetableId;
        this.gardenerId = gardenerId;
        this.ammount = ammount;
    }
    public ForSale(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVegetableId() {
        return vegetableId;
    }

    public void setVegetableId(Long vegetableId) {
        this.vegetableId = vegetableId;
    }

    public Long getGardenerId() {
        return gardenerId;
    }

    public void setGardenerId(Long gardenerId) {
        this.gardenerId = gardenerId;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }
}
