package user.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.constant.ApplicationConstant;
import user.dto.CompanyDetailDto;
import user.entity.CompanyDetail;
import user.repo.CompanyDetailRepo;
import user.service.CompanyDetailService;

import java.util.Objects;

@Service
public class CompanyDetailServiceImpl implements CompanyDetailService {

    @Autowired
    CompanyDetailRepo companyDetailRepo;

    @Override
    public String saveCompanyDetail(CompanyDetailDto companyDetailDto) {
        CompanyDetail companyDetail = companyDetailRepo.save(dtoToEntity(companyDetailDto));
        if (!Objects.isNull(companyDetail)) {
            return ApplicationConstant.COMPANY_DETAIL_SAVED;
        }
        return ApplicationConstant.COMPANY_DETAIL_NOT_SAVED;
    }
    private CompanyDetail dtoToEntity(CompanyDetailDto companyDetailDto){
        CompanyDetail companyDetail=new CompanyDetail();
        BeanUtils.copyProperties(companyDetailDto,companyDetail);
        return companyDetail;
    }
}
