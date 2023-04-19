package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.constant.UrlConstant;
import user.dto.UserDetailDto;
import user.service.UserService;

@RestController
@RequestMapping(UrlConstant.SAVE_USER_DETAIL)
public class UserDetailController {

    @Autowired
    UserService userService;

    @PostMapping(UrlConstant.SAVE_USER)
    public ResponseEntity<String> saveUser(@RequestBody UserDetailDto userDetailDto){
        String saveUser = userService.saveUser(userDetailDto);
        return new ResponseEntity<>(saveUser, HttpStatus.OK);
    }
}
