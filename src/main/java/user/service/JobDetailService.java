package user.service;

import user.dto.JobDetailDto;
import user.entity.JobDetail;

public interface JobDetailService {
    String saveJobDetail(JobDetailDto jobDetailDto);
}
