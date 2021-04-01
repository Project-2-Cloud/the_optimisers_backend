package theoptimisers.citygardeners.Model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_CONTACT_POINT")
public class UserContactPoint {
    @Id
    @NotNull
    @Column(name = "user_id")
    private Long userId;

    @Id
    @NotNull
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
