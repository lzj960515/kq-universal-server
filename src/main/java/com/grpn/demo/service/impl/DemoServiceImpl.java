package com.grpn.demo.service.impl;

import com.grpn.demo.domain.Demo;
import com.grpn.demo.mapper.DemoMapper;
import com.grpn.demo.service.DemoService;
import com.kqinfo.universal.mybatisplus.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Service
public class DemoServiceImpl extends BaseServiceImpl<DemoMapper, Demo> implements DemoService {

}
