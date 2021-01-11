package com.example.test.controller;

import com.example.test.entity.UserInfo;
import com.example.test.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserInfoService userInfoService1;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

//loginIn是网页的请求
    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name, String password, HttpServletRequest request){
        UserInfo userBean = userInfoService1.loginIn(name,password);

        if(userBean!=null){
            System.out.println(userBean.showMsg());
            request.getSession().setAttribute("curUserId",name);
            request.getSession().setAttribute("curUserInfo",userBean); //存入一个对象类型(object)
            return "index_user";  //跳转到index_user.html 用户主界面
        }
        else {
            System.out.println("Bean为null");
            return "404"; //跳转到404.html
        }
    }

    @RequestMapping("/to_index_user")
    public String to_index_user() {
        return "index_user";
    }

    @RequestMapping("userLogOut")
    public String userLogOut(HttpServletRequest request) {
        request.getSession().removeAttribute("curUserId");
        return "login"; //login.html
    }
}

