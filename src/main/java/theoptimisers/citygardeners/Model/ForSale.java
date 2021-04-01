package theoptimisers.citygardeners.Model;

import com.sun.istack.NotNull;
import org.aspectj.bridge.Message;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "FOR_SALE")
public class ForSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "for_sale_id")
    private Long id;

    @NotNull
    @Column(name = "vegetable_id")
    private Long vegetableId;

    @NotNull
    @Column(name = "gardener_id")
    private Long gardenerId;

    @NotNull
    @Positive
    @Column(name = "ammount")
    private Integer ammount;

}
