package theoptimisers.citygardeners.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "USER_CONTACT_POINT")
public class UserContactPoint {
    @Id
    @NotNull(message = "user id can not be empty")
    @Column(name = "user_id")
    private Long userId;

    @Id
    @NotNull(message = "contact point id can not be empty")
    @Column(name = "contact_point_id")
    private Long contactPointId;

    public UserContactPoint(Long userId, Long contactPointId) {
        this.userId = userId;
        this.contactPointId = contactPointId;
    }
    public UserContactPoint(){}

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getContactPointId() {
        return contactPointId;
    }

    public void setContactPointId(Long contactPointId) {
        this.contactPointId = contactPointId;
    }
}
