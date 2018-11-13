package com.ssm.service.lottery.impl;

import com.ssm.mapper.LotteryInviteMapper;
import com.ssm.model.LotteryInvite;
import com.ssm.service.lottery.LotteryService;
import com.ssm.service.lottery.dto.LotteryInviteDTO;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuchen
 * @date 2018/9/25
 */
@Service
public class LotteryServiceImpl implements LotteryService {

	@Autowired
	LotteryInviteMapper lotteryInviteMapper;

	@Override
	public int insert(LotteryInviteDTO lotteryInviteDTO) {

		LotteryInvite lotteryInvite = new LotteryInvite();
		BeanUtils.copyProperties(lotteryInviteDTO, lotteryInvite);
		int rs = lotteryInviteMapper.insert(lotteryInvite);
		return rs;
	}

	@Override
	public LotteryInviteDTO selectByPrimaryKey(Long lotteryInviteId) {
		return null;
	}

	@Override
	public List<LotteryInviteDTO> selectAll() {
		return null;
	}
}
