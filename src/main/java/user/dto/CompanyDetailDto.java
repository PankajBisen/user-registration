package user.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
public class CompanyDetailDto {
    @NotNull(message = "the joiningDate  is required")
    private LocalDate joiningDate;
    @NotNull(message = "the companyName  is required")
    private String companyName;
    @NotNull(message = "the exitDate  is required")
    private LocalDate exitDate;
    @NotNull(message = "the achievements  is required")
    private String achievements;
    @NotNull(message = "the CTC  is required")
    private String CTC;
}
