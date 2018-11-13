package com.ssm.service.lottery.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class LotteryInviteDTO implements Serializable {
    private Long lotteryInviteId;

    private Long lotteryDrawId;

    private Long userId;

    private Long invitedUserId;

    private Integer isSend;

    private Integer isAssist;

    private String assistDate;

    private Integer isFirst;

    private String loginDate;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public LotteryInviteDTO(Long lotteryInviteId, Long lotteryDrawId, Long userId, Long invitedUserId, Integer isSend, Integer isAssist, String assistDate, Integer isFirst, String loginDate, Date createTime, Date updateTime) {
        this.lotteryInviteId = lotteryInviteId;
        this.lotteryDrawId = lotteryDrawId;
        this.userId = userId;
        this.invitedUserId = invitedUserId;
        this.isSend = isSend;
        this.isAssist = isAssist;
        this.assistDate = assistDate;
        this.isFirst = isFirst;
        this.loginDate = loginDate;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public LotteryInviteDTO() {
        super();
    }

    public Long getLotteryInviteId() {
        return lotteryInviteId;
    }

    public void setLotteryInviteId(Long lotteryInviteId) {
        this.lotteryInviteId = lotteryInviteId;
    }

    public Long getLotteryDrawId() {
        return lotteryDrawId;
    }

    public void setLotteryDrawId(Long lotteryDrawId) {
        this.lotteryDrawId = lotteryDrawId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getInvitedUserId() {
        return invitedUserId;
    }

    public void setInvitedUserId(Long invitedUserId) {
        this.invitedUserId = invitedUserId;
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public Integer getIsAssist() {
        return isAssist;
    }

    public void setIsAssist(Integer isAssist) {
        this.isAssist = isAssist;
    }

    public String getAssistDate() {
        return assistDate;
    }

    public void setAssistDate(String assistDate) {
        this.assistDate = assistDate == null ? null : assistDate.trim();
    }

    public Integer getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(Integer isFirst) {
        this.isFirst = isFirst;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate == null ? null : loginDate.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LotteryInviteDTO other = (LotteryInviteDTO) that;
        return (this.getLotteryInviteId() == null ? other.getLotteryInviteId() == null : this.getLotteryInviteId().equals(other.getLotteryInviteId()))
            && (this.getLotteryDrawId() == null ? other.getLotteryDrawId() == null : this.getLotteryDrawId().equals(other.getLotteryDrawId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getInvitedUserId() == null ? other.getInvitedUserId() == null : this.getInvitedUserId().equals(other.getInvitedUserId()))
            && (this.getIsSend() == null ? other.getIsSend() == null : this.getIsSend().equals(other.getIsSend()))
            && (this.getIsAssist() == null ? other.getIsAssist() == null : this.getIsAssist().equals(other.getIsAssist()))
            && (this.getAssistDate() == null ? other.getAssistDate() == null : this.getAssistDate().equals(other.getAssistDate()))
            && (this.getIsFirst() == null ? other.getIsFirst() == null : this.getIsFirst().equals(other.getIsFirst()))
            && (this.getLoginDate() == null ? other.getLoginDate() == null : this.getLoginDate().equals(other.getLoginDate()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLotteryInviteId() == null) ? 0 : getLotteryInviteId().hashCode());
        result = prime * result + ((getLotteryDrawId() == null) ? 0 : getLotteryDrawId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getInvitedUserId() == null) ? 0 : getInvitedUserId().hashCode());
        result = prime * result + ((getIsSend() == null) ? 0 : getIsSend().hashCode());
        result = prime * result + ((getIsAssist() == null) ? 0 : getIsAssist().hashCode());
        result = prime * result + ((getAssistDate() == null) ? 0 : getAssistDate().hashCode());
        result = prime * result + ((getIsFirst() == null) ? 0 : getIsFirst().hashCode());
        result = prime * result + ((getLoginDate() == null) ? 0 : getLoginDate().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lotteryInviteId=").append(lotteryInviteId);
        sb.append(", lotteryDrawId=").append(lotteryDrawId);
        sb.append(", userId=").append(userId);
        sb.append(", invitedUserId=").append(invitedUserId);
        sb.append(", isSend=").append(isSend);
        sb.append(", isAssist=").append(isAssist);
        sb.append(", assistDate=").append(assistDate);
        sb.append(", isFirst=").append(isFirst);
        sb.append(", loginDate=").append(loginDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}