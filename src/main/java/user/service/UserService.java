package user.service;

import user.dto.UserDetailDto;

public interface UserService {
    String saveUser(UserDetailDto userDetailDto);
}
