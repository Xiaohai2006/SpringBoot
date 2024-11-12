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



    /*/
    *
    * 1.发送请求：通过浏览器·1发送，输入网址发送请求
    * 浏览器发送服务器请求
    * 例如：http://127.0.0.1/mingzhu
    *
    * 2.谁来分发请求？ DisptchServlet相当于大脑
    * DisptchServlet 类分发请求，并把相应返回给客户端
    *
    * ‘3.分发给谁：分发给处理器类（也叫控制器类）名字以xxxController.java 结尾。
    * 具体处理请求的是，控制器类中的来处理我们的请求。
    *
    *
    *
    * 流程：客户端浏览器通过地址栏发送 （地址） 服务器接收到请求 有大脑
    * 分发对应的控制类来处理请求 最后由大脑返回响应
    *
     */





}
