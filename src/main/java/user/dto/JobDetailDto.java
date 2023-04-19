package user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JobDetailDto {
    private Long jobId;
    private String jobName;
    private LocalDate jobDateTime;
    private String status;
    private LocalDate nextJobDate;
    private Long backUpCount;
}
