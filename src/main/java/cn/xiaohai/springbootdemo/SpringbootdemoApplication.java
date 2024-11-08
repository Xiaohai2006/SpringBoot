package cn.xiaohai.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
        System.out.println("你好，Springboot");
    }
    //http://localhost:8080/hello
    /*
    *
    * 请求本地计算机中8080端口这个程序的 资源位置/hello的数据
    *
    * http 是 协议
    * localhost 是 主机名
    *
    * 8080 是 端口
    * /hello 是 路径
    *
    * ip地址：找到网络中的计算机    网络中计算机的唯一标识
    *
    * 端口号：找到计算机中的程序
    *
    * 协议：
    *
    * */



}
