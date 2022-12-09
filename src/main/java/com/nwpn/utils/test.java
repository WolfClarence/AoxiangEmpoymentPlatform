package com.nwpn.utils;

import com.nwpn.mapper.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GengXuelong
 * @version 1.0
 * @Mail 3349495429@qq.com
 * @Date 2022/11/28
 * @ClassName test
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springmvc-servlet.xml");
        AdminMapper adminMapper = context.getBean(AdminMapper.class);
        UserMapper userMapper = context.getBean(UserMapper.class);
        JobMapper jobMapper = context.getBean(JobMapper.class);
        ResumeMapper resumeMapper = context.getBean(ResumeMapper.class);
        ApplicationMapper applicationMapper = context.getBean(ApplicationMapperImpl.class);
        System.out.println(jobMapper.getJobByLikedName(""));
    }
}
