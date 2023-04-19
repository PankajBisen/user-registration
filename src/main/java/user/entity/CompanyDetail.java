package user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "company_details")
public class CompanyDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long companyId;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "joining_date")
    private LocalDate joiningDate;
    @Column(name = "exit_date")
    private LocalDate exitDate;
    @Column(name = "achievements")
    private String achievements;
    @Column(name = "CTC")
    private String CTC;
}
