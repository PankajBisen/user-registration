package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.constant.UrlConstant;
import user.dto.JobDetailDto;
import user.service.JobDetailService;

@RestController
@RequestMapping(UrlConstant.JOB_DETAIL)
public class JobDetailController {
    @Autowired
    JobDetailService jobDetailService;

    @PostMapping(UrlConstant.SAVE_JOB_DETAILS)
    public ResponseEntity<String> save (@RequestBody JobDetailDto jobDetailDto){
        String saveJobDetail = jobDetailService.saveJobDetail(jobDetailDto);
        return new ResponseEntity<>(saveJobDetail, HttpStatus.OK);
    }
}
