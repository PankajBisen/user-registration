package user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_detail")
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "password")
    private String password;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "country")
    private String country;
    @Column(name = "state")
    private String state;
    @Column(name = "district")
    private String district;
    @Column(name = "pin_code")
    private String pinCode;
    @Column(name = "aadhaar_card")
    private String aadhaarCard;
    @Column(name = "pan_card")
    private String panCard;
    @Column(name = "city")
    private String city;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "user_type")
    private Role role;
    @Column(name = "active")
    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "companyId", referencedColumnName = "companyId")
    private CompanyDetail companyDetails;

}
