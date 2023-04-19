package user.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.constant.ApplicationConstant;
import user.dto.JobDetailDto;
import user.entity.JobDetail;
import user.repo.JobDetailRepo;
import user.service.JobDetailService;
@Service
public class JobDetailServiceImpl implements JobDetailService {

    @Autowired
    JobDetailRepo jobDetailRepo;
    @Override
    public String saveJobDetail(JobDetailDto jobDetailDto) {
        jobDetailRepo.save(dtoToEntityJobDetail(jobDetailDto));
        return ApplicationConstant.JOB_DETAIL_SAVED;
    }

    private JobDetail dtoToEntityJobDetail(JobDetailDto jobDetailDto){
        JobDetail jobDetail = new JobDetail();
        BeanUtils.copyProperties(jobDetailDto, jobDetail);
        return jobDetail;
    }
}
