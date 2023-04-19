package user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import user.constant.ApplicationConstant;
import user.dto.UserDetailDto;
import user.entity.CompanyDetail;
import user.entity.UserDetail;
import user.exception.UserException;
import user.repo.CompanyDetailRepo;
import user.repo.UserRepo;
import user.service.UserService;

import java.util.Locale;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    CompanyDetailRepo companyDetailRepo;
    @Autowired
    private MessageSource messageSource;

    @Override
    public String saveUser(UserDetailDto userDetailDto) {
        UserDetail save = userRepo.save(dtoToEntity(userDetailDto));
        if (!Objects.isNull(save)) {
            return ApplicationConstant.USER_SAVED;
        }
        return ApplicationConstant.USER_NOT_SAVED;
    }

    private UserDetail dtoToEntity(UserDetailDto userDetailDto) {
        UserDetail user = new UserDetail();
        user.setAadhaarCard(userDetailDto.getAadhaarCard());
        user.setCity(userDetailDto.getCity());
        user.setCountry(userDetailDto.getCountry());
        user.setDistrict(userDetailDto.getDistrict());
        CompanyDetail companyDetail = companyDetailRepo.findById(userDetailDto.getCompanyId())
                .orElseThrow(() -> new UserException(messageSource.getMessage(
                        "company.detail.not.found", null, Locale.getDefault()), HttpStatus.NOT_FOUND));
        user.setCompanyDetails(companyDetail);
        user.setRole(userDetailDto.getRole());
        user.setEmailId(userDetailDto.getEmailId());
        user.setFullName(userDetailDto.getFullName());
        user.setMobileNumber(userDetailDto.getMobileNumber());
        user.setPanCard(userDetailDto.getPanCard());
        user.setPassword(userDetailDto.getPassword());
        user.setPinCode(userDetailDto.getPinCode());
        user.setState(userDetailDto.getState());
        //BeanUtils.copyProperties(userDetailDto, user);
        return user;
    }
}
