package com.ssm.test;


import com.ssm.service.lottery.LotteryService;
import com.ssm.service.lottery.dto.LotteryInviteDTO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liuchen
 * @date 2018/7/20
 */

@Slf4j
//@MapperScan("com.xinshang.service.lottery")
@RunWith(SpringJUnit4ClassRunner.class)
@PropertySource(value = "classpath*:*.properties ")
@ContextConfiguration(locations = "classpath*:*.xml")
public class LotteryReadMapperTest {

	@Autowired
	LotteryService lotteryService;

	@Test
	public void testInsert(){
		LotteryInviteDTO lotteryInviteDTO = new LotteryInviteDTO();

		lotteryInviteDTO.setUserId(1L);
		lotteryInviteDTO.setInvitedUserId(2L);
		lotteryInviteDTO.setIsSend(1);
		lotteryInviteDTO.setIsAssist(1);
		lotteryInviteDTO.setIsFirst(1);
		lotteryInviteDTO.setLotteryDrawId(1L);
		lotteryInviteDTO.setAssistDate(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
		lotteryService.insert(lotteryInviteDTO);
	}

}
