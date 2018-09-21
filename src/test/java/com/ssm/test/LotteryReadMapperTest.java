package com.ssm.test;


import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liuchen
 * @date 2018/7/20
 */

@ContextConfiguration(locations = "classpath*:*.xml")
//@MapperScan("com.xinshang.service.lottery")
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class LotteryReadMapperTest {



}
