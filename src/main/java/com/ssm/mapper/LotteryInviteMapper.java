package com.ssm.mapper;

import com.ssm.model.LotteryInvite;
import java.util.List;

public interface LotteryInviteMapper {
    int deleteByPrimaryKey(Long lotteryInviteId);

    int insert(LotteryInvite record);

    LotteryInvite selectByPrimaryKey(Long lotteryInviteId);

    List<LotteryInvite> selectAll();

    int updateByPrimaryKey(LotteryInvite record);
}