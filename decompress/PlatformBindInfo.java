// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class PlatformBindInfo
{
    @c(LIZ = "allow_sync")
    public boolean allowSync;
    @c(LIZ = "bind_user_name")
    public String bindUserName;
    @c(LIZ = "platform")
    public String platform;
    @c(LIZ = "publish_sync_tips_cnt")
    public int publishSyncTipsCnt;
    @c(LIZ = "tigger_full_sync")
    public boolean tiggerFullSync;
    
    static {
        Covode.recordClassIndex(4969);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final PlatformBindInfo platformBindInfo = (PlatformBindInfo)o;
            if (this.allowSync != platformBindInfo.allowSync) {
                return false;
            }
            if (this.tiggerFullSync != platformBindInfo.tiggerFullSync) {
                return false;
            }
            if (this.publishSyncTipsCnt != platformBindInfo.publishSyncTipsCnt) {
                return false;
            }
            final String platform = this.platform;
            Label_0100: {
                if (platform != null) {
                    if (platform.equals(platformBindInfo.platform)) {
                        break Label_0100;
                    }
                }
                else if (platformBindInfo.platform == null) {
                    break Label_0100;
                }
                return false;
            }
            final String bindUserName = this.bindUserName;
            final String bindUserName2 = platformBindInfo.bindUserName;
            if (bindUserName != null) {
                return bindUserName.equals(bindUserName2);
            }
            if (bindUserName2 == null) {
                return true;
            }
        }
        return false;
    }
    
    public String getBindUserName() {
        return this.bindUserName;
    }
    
    public String getPlatform() {
        return this.platform;
    }
    
    public int getPublishSyncTipsCnt() {
        return this.publishSyncTipsCnt;
    }
    
    @Override
    public int hashCode() {
        final String platform = this.platform;
        int hashCode = 0;
        int hashCode2;
        if (platform != null) {
            hashCode2 = platform.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int allowSync = this.allowSync ? 1 : 0;
        final int tiggerFullSync = this.tiggerFullSync ? 1 : 0;
        final String bindUserName = this.bindUserName;
        if (bindUserName != null) {
            hashCode = bindUserName.hashCode();
        }
        return (((hashCode2 * 31 + allowSync) * 31 + tiggerFullSync) * 31 + hashCode) * 31 + this.publishSyncTipsCnt;
    }
    
    public boolean isAllowSync() {
        return this.allowSync;
    }
    
    public boolean isTiggerFullSync() {
        return this.tiggerFullSync;
    }
    
    public void setAllowSync(final boolean allowSync) {
        this.allowSync = allowSync;
    }
    
    public void setBindUserName(final String bindUserName) {
        this.bindUserName = bindUserName;
    }
    
    public void setPlatform(final String platform) {
        this.platform = platform;
    }
    
    public void setPublishSyncTipsCnt(final int publishSyncTipsCnt) {
        this.publishSyncTipsCnt = publishSyncTipsCnt;
    }
    
    public void setTiggerFullSync(final boolean tiggerFullSync) {
        this.tiggerFullSync = tiggerFullSync;
    }
}
