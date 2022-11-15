package pers.ervinse.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.ervinse.domain.User;
import pers.ervinse.service.UserService;

/**
 * 用户
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 根据账号和密码登录
     * @param user 包含用户名和密码的对象
     * @return 登录成功返回true,否则返回false
     */
    @PostMapping("/login")
    public boolean login(@RequestBody User user){
        log.info("login :" + user);
        return userService.login(user);

    }

    /**
     * 根据账号和密码登录
     * @param user 包含用户名和密码的对象
     * @return 登录成功返回true,否则返回false
     */
    @PostMapping("/register")
    public boolean register(@RequestBody User user){
        log.info("register :" + user);
        return userService.register(user);
    }


    /**
     * 获取描述
     * @param name
     * @return
     */
    @GetMapping("/getDescription/{name}")
    public String getDescription(@PathVariable String name){
        log.info("getDescription :" + name);

        return userService.getDescription(name);
    }


}
