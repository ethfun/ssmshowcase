package com.ssm.service.lottery;

import com.ssm.service.lottery.dto.LotteryInviteDTO;
import java.util.List;

/**
 * @author liuchen
 * @date 2018/9/25
 */
public interface LotteryService {

	int insert(LotteryInviteDTO lotteryInviteDTO);

	LotteryInviteDTO selectByPrimaryKey(Long lotteryInviteId);

	List<LotteryInviteDTO> selectAll();
}
