package com.example.zout.vip.web.handler;


import com.example.zout.common.ThisSystemException;
import com.example.zout.vip.entity.UserEntity;
import com.example.zout.vip.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.tagext.TryCatchFinally;

/**
 * @class_name：UserFunction
 * @param: 5.用户controller层--传入账户
 * @return: 实体对象4
 * @author:Zoutao
 * @createtime:2018年3月14日
 */
@Controller
public class LoginHandler {
    @Autowired
    UserFunction fun;

    @RequestMapping(method = RequestMethod.GET, path = "/login.do")
    public String login1() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login.do")
    public String login(String account, String password, HttpSession session, Model model, HttpServletRequest request, HttpServletResponse response, int status) {
        try {
            UserEntity u = fun.login(account, password);
            //成功则放到session里面
            session.setMaxInactiveInterval(3600);
            session.setAttribute("currentUser", u);
        } catch (Exception e) {
            e.printStackTrace();
            //不成功则>内部跳转>登录。
            model.addAttribute("message", e.getMessage());
            System.out.println("登录失败");
            return "redirect:/login.do";
        }

//利用cookie实现记住密码功能
        if (status == 1) {
            Cookie cookie = new Cookie(account, password);
            cookie.setMaxAge(60 * 60 * 24);
            cookie.setPath("/");
            response.addCookie(cookie);
        } else {
            Cookie[] cookies = request.getCookies();
            for (Cookie c : cookies) {
                if (c.getName().equals(account)) {
                    c.setMaxAge(0);
                    c.setPath("/");
                    response.addCookie(c);
                }
            }
        }


        //成功则重定向到首页。
        System.out.println("登录成功");
        return "index";
    }

    @RequestMapping("/repassword")
    public String repassword() {

        return "login";
    }

    @RequestMapping("/regin.do")
    public String regin() {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/regin.do")
    public String regin(String password, String cpassword, String account, Model model, String email) {
        try {
            fun.regin(password, cpassword, account, email);

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", e.getMessage());
            System.out.println("注册失败");
            return "forward:/regin.do";
        }
        model.addAttribute("account", account);
        model.addAttribute("password", password);
        System.out.println("注册成功");
        return "login";
    }

    @RequestMapping("/index.do")
    public String index() {
        return "index";
    }

    //转接到web-inf的welcome页面，使得能访问
    @RequestMapping("/welcome.do")
    public String welcome() {
        return "welcome";
    }

    //退出登陆,消除session,>重定向>登录页
    @RequestMapping("/logout.do")
    public String logout(HttpSession session) {
        //让session失效
        session.invalidate();
        System.out.println("注销成功");
        return "redirect:/login.do";
    }

    //修改密码>使得能访问>web-inf下修改页
    //get方式》获得视图，post方式》执行请求。
    @RequestMapping(method = RequestMethod.GET, path = "/updatepassword.do")
    public String updatepasswordView() {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/updatepassword.do")
    public String updatepassword(String oldPassword, String newPassword, String newPasswordConfirm,
                                 HttpServletRequest request,HttpServletResponse response) throws Exception {
        //获得session》知道是谁在修改密码
        HttpSession session = request.getSession();
        UserEntity u = (UserEntity) session.getAttribute("currentUser");

        try {
            //调用server层的方法
            fun.updatePassword(u.getId(), oldPassword, newPassword, newPasswordConfirm);
        } catch (ThisSystemException e) {
            //把业务异常封装给用户看，系统异常不给
            request.setAttribute("message", e.getMessage());
            System.out.println("密码修改失败");
            return "login";
        }

        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals(u.getAccount())) {
                c.setMaxAge(0);
                c.setPath("/");
                response.addCookie(c);
            }
        }
        session.setAttribute("message", "修改成功，请重新登录");
        System.out.println("密码修改成功");
        return "login";
    }

    //利用session-查看个人信息,内部跳转>个人信息页
    @RequestMapping("/myinf.do")
    public String myinf(HttpServletRequest request) {
        System.out.println("查询个人信息成功");
        try {
            //UserEntity u =fun.selectMyinf(account);
            //获得已登录的session--
            HttpSession session = request.getSession();
            //判断session是否过期
            if (request.getSession(false) == null) {
                System.out.println("Session 已失效!");
            } else {
                System.out.println("Session 有效!");
            }
            //设置session的有效时间，单位秒，0/负数永不过期
            session.setMaxInactiveInterval(-1);
            //System.out.println("session的有效时长："+session.getMaxInactiveInterval()+"秒");

            //用户实体类的对象u2-使用object或者强制换换为用户实体类
            Object u2 = session.getAttribute("currentUser");
            //currentUser注入到session
            session.setAttribute("currentUser", u2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "myinf";
    }

    //vip消费管理,内部跳转>vip消费管理页--未完成
    @RequestMapping("/manage/list.do")
    public String list(String account, String Password, HttpServletRequest request) {
        System.out.println("查询列表");
        return "vip/manage/list";
    }

    //转接到web-inf的welcome页面，使得能访问
    @RequestMapping("/error.do")
    public String error() {
        return "error";
    }

}
