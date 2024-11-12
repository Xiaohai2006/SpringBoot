package cn.xiaohai.springbootdemo.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.List;

@RestController
public class HelloController {



    //@RequestMapping 可以接受  GET请求和POST请求
    //@PostMapping 只接受POST请求
    //@GetMapping 只接受GET请求




    //简单参数：请求参数名与形参属性名相同，按照对象层次结构关系即可接受嵌套实体类属性参数

    //1.原始方式获取请求参数
    //2.SpringBoot中接受简单参数

    //3.@RequestParam注解
    //方法形参名称与请求参数名称不匹配，使用@RequestParam注解完成映射
    //改注解的required的属性，默认值为true，表示请求参数必须传递，否则将抛出异常。

    @RequestMapping("/")
    public String getHello(HttpServletRequest request) {


        return "这是一个空页面";

        

    }

    //- 结论：对于简单参数来讲，请求参数名和controller方法中的形参名不一致时，无法接收到请求数据
    //
    //那么如果我们开发中，遇到了这种请求参数名和controller方法中的形参名不相同，怎么办？
    //
    //解决方案：可以使用Spring提供的@RequestParam注解完成映射
    //
    //在方法形参前面加上 @RequestParam 然后通过value属性执行请求参数名，从而完成映射。代码如下：
    @RequestMapping("/hello")
    public String hello(String name,Integer age) {

        String s = name + "\t" + age;
        System.out.println(s);
        return s;
    }
    //    **结论：不论是GET请求还是POST请求，对于简单参数来讲，只要保证==请求参数名和Controller方法中的形参名保持一致==，就可以获取到请求参数中的数据值。**



    @RequestMapping("/sdmz")
    public String sdmz(HttpRequest request, HttpResponse response) {
//        DispatcherServlet:核心控制器，负责接受页面发送的请求，跟据执行的规则（访问路径），将请求转发给后面的请求处理器(Controller),请求处理器处理玩请求之后，最终再由DispatcherServlet给浏览器响应数据。



//        请求(HttpServleRequest):获取请求数据
//         响应(HttpServleReseponse):设置响应数据
//        BS架构: Browser/Server,浏览器/服务器架构模式。客户端只需要浏览器，应用程序的逻辑和数据都储存在服务端。





        return "中国四大名著：《红楼梦》、《西游记》、《三国演义》、《水浒传》";

    }


    @RequestMapping("/array")
    public String array(String[] hhobby) {
        //遍历数组
        //增强for
        for (String s : hhobby) {
            System.out.println(s);
        }


        return "数组";


    }



    //传递集合
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby) {

            System.out.println(hobby);

        return "集合";


    }
    //传值地址: 127.0.0.1:8080/list?id=1&name=小明&age=18

    //复杂实体对象指的是，在实体类中有一个或多个属性，也是实体对象类型的。


    //请求参数名与形参属性名相同，按照对象层次结构关系即可接受嵌套实体类属性参数
    /*
    传递集合参数：请求参数名与形参集合名称相同且请求参数为多个，@RequestParam绑定参数关系

    @RequestMapping("/student")
    public String Student(@RequestParam List<String> list) {


        System.out.println(s);
        return "OK";
     }
     */

    //传递日期
    @RequestMapping("/date")
    public String date(@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") Date date) {
        System.out.println(date);
//        打印格式


        System.out.println(date.toLocaleString());

        //LocalDateTime 类日期事件类型
        //LocalDate 类日期类型
        //Date 类日期类型
        //DateTime 类日期时间类型


        return "日期";
    }
    /*
        传递日期： IP_ADDRESS:8080/date?date=2022-01-01 10:10:10 或者 2022/01/01 10:10:10 或者 2022/1/1 10:10:10
         2022-12-12
         10:10:10
         yyyy-MM-dd hh:mm:ss
         年-月-日 时:分:秒
         yyyy/MM/dd hh:mm:ss

         日期类型的参数在进行封装的时候，需要@DateTimeFormat注解指定日期格式。
         @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
         @DateTimeFormat注解的pattern属性指定日期格式。前端的日期格式必须与pattern属性指定的日期格式一致。
         后端controller方法形参的类型必须是java.util.Date类型 或LocalDateTime类型。,来封装传递的参数。

     */




    //服务端Controller方法接受JSON格式数据：
    //·传递JSON格式的参数，在Controller中会使用实体类进行封装。
    //·封装规则：JSON数据键名与形参对象属性名相同，定义实体类类型形参即可接收参数。需要使用@RequestBody注解。


    @RequestMapping ("/json")
    public String json(@RequestBody User user) {

        System.out.println(user);
        return user.toString();

    }

    //地址和参数: IP_ADDRESS:8080/json?id=1&name=小明&age=18

    //传的值 {"id":1,"name":"小明","age":18}

}










