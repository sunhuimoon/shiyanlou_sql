package com.shiyanlou.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * ApplicationRunner接口可以让在SpringBoot启动后马上执行想要执行的方法
 */
@Component
public class ServerTest implements ApplicationRunner {

    /**
      */
    @Autowired
    public UserService userService;

    /**
     * 该方法再SpringBoot启动完成后立即执行
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) {
//        新建一个实体类
        User user = new User();
        user.setPassword("springboot");
        user.setUsername("shiyanlou");
//        调用包存实体类的service
        userService.save(user);
    }
}