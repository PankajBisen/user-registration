package user.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import user.entity.Role;


@Setter
@Getter
@AllArgsConstructor
public class UserDetailDto {

    @Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = "Invalid email pattern")
    @NotBlank(message = "plz enter emailId")
    private String emailId;
    @NotBlank(message = "plz enter password")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
    private String password;
    @NotBlank(message = "plz enter fullName")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[=?<>%])(?=\\S+$).{20,}$")
    private String fullName;
    @NotBlank(message = "plz enter country")
    private String country;
    @NotBlank(message = "plz enter state")
    private String state;
    @NotBlank(message = "plz enter district")
    private String district;
    @NotBlank(message = "plz enter pinCode")
    @Size(min = 6,message = "pinCode should be six digit")
    private String pinCode;
    @NotBlank(message = "plz enter aadhaarCard")
    @Pattern(regexp = "^\\d{12}$",message = "aadhaarCard should be twelve digit")
    private String aadhaarCard;
    @NotBlank(message = "plz enter panCard")
    @Pattern(regexp = "^[A-Z]{5}\\d{4}+[A-Z]{1}$",message = "plz enter valid  panCardNumber ")
    private String panCard;
    @NotBlank(message = "plz enter city")
    private String city;
    @NotBlank(message = "plz enter mobileNumber")
    @Size(max = 10,min = 10,message = "plz enter valid  mobileNumber")
    private String mobileNumber;
    @NotBlank(message = "plz enter userType")
    private Role role;
    @NotBlank(message = "plz enter companyId")
    private Long companyId;
}
