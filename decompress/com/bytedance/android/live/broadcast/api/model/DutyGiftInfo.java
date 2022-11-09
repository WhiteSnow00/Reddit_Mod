// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.a.c;

public class DutyGiftInfo
{
    @c(LIZ = "duty_id")
    public long mDutyId;
    @c(LIZ = "speedy_gift_id")
    public long mGiftId;
    @c(LIZ = "contribute_most")
    public User mMvpUser;
    @c(LIZ = "score")
    public long mScore;
    @c(LIZ = "stage_count")
    public long mStageCount;
    @c(LIZ = "status")
    public int mStatus;
    public int mSuccess;
    @c(LIZ = "target_score")
    public long mTargetScore;
    
    static {
        Covode.recordClassIndex(5077);
    }
    
    public long getDutyId() {
        return this.mDutyId;
    }
    
    public long getGiftId() {
        return this.mGiftId;
    }
    
    public User getMvpUser() {
        return this.mMvpUser;
    }
    
    public long getScore() {
        return this.mScore;
    }
    
    public long getStageCount() {
        return this.mStageCount;
    }
    
    public int getStatus() {
        return this.mStatus;
    }
    
    public long getTargetScore() {
        return this.mTargetScore;
    }
    
    public boolean isFinished() {
        return this.mStatus == 4;
    }
    
    public boolean isPlaying() {
        return this.mStatus == 3;
    }
    
    public boolean isStarted() {
        return this.mStatus == 2;
    }
    
    public int isSuccess() {
        return this.mSuccess;
    }
    
    public void setDutyId(final long mDutyId) {
        this.mDutyId = mDutyId;
    }
    
    public void setGiftId(final long mGiftId) {
        this.mGiftId = mGiftId;
    }
    
    public void setMvpUser(final User mMvpUser) {
        this.mMvpUser = mMvpUser;
    }
    
    public void setScore(final long mScore) {
        this.mScore = mScore;
    }
    
    public void setStageCount(final long mStageCount) {
        this.mStageCount = mStageCount;
    }
    
    public void setStatus(final int mStatus) {
        this.mStatus = mStatus;
    }
    
    public void setSuccess(final int mSuccess) {
        this.mSuccess = mSuccess;
    }
    
    public void setTargetScore(final long mTargetScore) {
        this.mTargetScore = mTargetScore;
    }
}
