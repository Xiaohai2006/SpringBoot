package cn.xiaohai.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
public class HelloController {




    @RequestMapping("/")
    public String getHello(HttpServletRequest request) {



        // 获取访问者的 IP 地址
        // 获取客户端 IP 地址





        return "Hello Springboot" + "<br>";

        

    }

    @RequestMapping("/hello")
    public String hello() {
        String s = "Hello Springboot";
        return s;
    }
    @RequestMapping("/sdmz")
    public String sdmz(HttpRequest request, HttpResponse response) {
//        DispatcherServlet:核心控制器，负责接受页面发送的请求，跟据执行的规则（访问路径），将请求转发给后面的请求处理器(Controller),请求处理器处理玩请求之后，最终再由DispatcherServlet给浏览器响应数据。

//        请求(HttpServleRequest):获取请求数据
//         响应(HttpServleReseponse):设置响应数据
//        BS架构: Browser/Server,浏览器/服务器架构模式。客户端只需要浏览器，应用程序的逻辑和数据都储存在服务端。


        return "中国四大名著：《红楼梦》、《西游记》、《三国演义》、《水浒传》";

    }
}
