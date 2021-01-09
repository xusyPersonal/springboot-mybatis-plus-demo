package com.example.springbootmybatisplusdemo.Controller;

import com.example.springbootmybatisplusdemo.entity.UserInfo;
import com.example.springbootmybatisplusdemo.mapper.UserInfoMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoMapper userInfoMapper ;
    @RequestMapping(value = "/query" , method = RequestMethod.GET)
    public String queryUserInfo(@RequestBody(required = false) UserInfo userInfo){
        List<UserInfo> list = userInfoMapper.selectByMap(null) ;
        list.forEach(System.out::println);
        return "QUERY SUCCESS" ;
    }
}
