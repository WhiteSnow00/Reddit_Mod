// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class MediaRecommendReason
{
    @c(LIZ = "city")
    public String city;
    @c(LIZ = "friend_name")
    public String friendName;
    @c(LIZ = "reason")
    public String reason;
    @c(LIZ = "type")
    public int type;
    
    static {
        Covode.recordClassIndex(4947);
    }
    
    public String getCity() {
        return this.city;
    }
    
    public String getFriendName() {
        return this.friendName;
    }
    
    public String getReason() {
        return this.reason;
    }
    
    public int getType() {
        return this.type;
    }
    
    public void setCity(final String city) {
        this.city = city;
    }
    
    public void setFriendName(final String friendName) {
        this.friendName = friendName;
    }
    
    public void setReason(final String reason) {
        this.reason = reason;
    }
    
    public void setType(final int type) {
        this.type = type;
    }
}
