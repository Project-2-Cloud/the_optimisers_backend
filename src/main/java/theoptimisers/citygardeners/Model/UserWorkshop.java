package theoptimisers.citygardeners.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "USER_WORKSHOP")
public class UserWorkshop {
    @Id
    @NotNull(message = "user id can not be empty")
    @Column(name = "user_id")
    private Long userId;

    @Id
    @NotNull(message = "workshop id can not be empty")
    @Column(name = "workshop_id")
    private Long workshopId;

    public UserWorkshop(Long userId, Long workshopId) {
        this.userId = userId;
        this.workshopId = workshopId;
    }
    public UserWorkshop(){}

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getWorkshopId() {
        return workshopId;
    }

    public void setWorkshopId(Long workshopId) {
        this.workshopId = workshopId;
    }
}
