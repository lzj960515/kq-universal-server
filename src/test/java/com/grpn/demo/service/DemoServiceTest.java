package com.grpn.demo.service;

import com.grpn.demo.domain.Demo;
import com.kqinfo.universal.test.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@Rollback
@Transactional
public class DemoServiceTest extends BaseTest {

    @Resource
    private DemoService demoService;


    @Test
    public void createTest(){
        Demo demo = new Demo();
        demo.setName("xx");
        demoService.create(demo);

        Demo result = demoService.get(demo.getId());
        Assertions.assertNotNull(result);
    }

}