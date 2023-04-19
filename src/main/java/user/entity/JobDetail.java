package user.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "jobDetail")
public class JobDetail {

    private Long jobId;
    private String jobName;
    private LocalDate jobDateTime;
    private String status;
    private LocalDate nextJobDate;
    private Long backUpCount;
}
