package com.cqkqinfo.grpn.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.kqinfo.universal.test.base.BaseRestTest;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@Rollback
@Transactional
public class DemoControllerTest extends BaseRestTest {

    @Sql("/sql/add_demo.sql")
    @Test
    public void getTest() throws Exception {
        JSONObject result = super.get("/demo/get/{id}", null, null, 1);
        Assertions.assertEquals(0, result.getInteger("code"));
        Object data = result.get("data");
        Assertions.assertNotNull(data);
    }
}