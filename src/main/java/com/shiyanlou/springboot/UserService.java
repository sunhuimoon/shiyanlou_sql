package com.shiyanlou.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    /**
     * 添加事务管理
     * @Transactional(rollbackFor = Exception.class)
     * 加上这个在有异常的情况下，不在数据库里做任何操作
     * noRollbackFor。Class 对象数组，继承自 Throwable ，不会导致事务回滚的异常类数组 (可选)
     */
//    @Transactional(rollbackFor = Exception.class)
    public User save(User user) {
//        保存实体类
        userRepository.save(user);
        //人为抛出异常
        //加上下面的语句后，密码是ST里面的springboot，而不是123456
        int shiyanlou = 1 / 0;
        //修改密码
        //有这个在ServerTest里设置的密码都部生效，除非把这个注释掉
        user.setPassword("123456");
        //重新保存，更新记录
        return userRepository.save(user);
    }


}