package com.ssm.mapper;

import com.ssm.model.lotteryInvite;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface lotteryInviteMapper {

    int deleteByPrimaryKey(Long lotteryInviteId);

    int insert(lotteryInvite record);

    lotteryInvite selectByPrimaryKey(Long lotteryInviteId);

    List<lotteryInvite> selectAll();

    int updateByPrimaryKey(lotteryInvite record);
}