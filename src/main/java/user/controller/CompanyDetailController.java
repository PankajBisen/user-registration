package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.constant.UrlConstant;
import user.dto.CompanyDetailDto;
import user.entity.CompanyDetail;
import user.service.CompanyDetailService;

@RestController
@RequestMapping(UrlConstant.COMPANY_DETAIL)
public class CompanyDetailController {

    @Autowired
    CompanyDetailService companyDetailService;

    @PostMapping(UrlConstant.SAVE_COMPANY)
    public ResponseEntity<String> saveCompanyDetail(@RequestBody CompanyDetailDto companyDetailDto){
        String saveCompanyDetail = companyDetailService.saveCompanyDetail(companyDetailDto);
        return new ResponseEntity<>(saveCompanyDetail, HttpStatus.OK);
    }
}
