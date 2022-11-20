// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import p1.h;
import ng2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdAccessTokenData;", "", "valid_until", "", "sb_access_token", "", "(JLjava/lang/String;)V", "getSb_access_token", "()Ljava/lang/String;", "getValid_until", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SendBirdAccessTokenData
{
    private final String sb_access_token;
    private final long valid_until;
    
    public SendBirdAccessTokenData(final long valid_until, final String sb_access_token) {
        e.f((Object)sb_access_token, "sb_access_token");
        this.valid_until = valid_until;
        this.sb_access_token = sb_access_token;
    }
    
    public static SendBirdAccessTokenData copy$default(final SendBirdAccessTokenData sendBirdAccessTokenData, long valid_until, String sb_access_token, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            valid_until = sendBirdAccessTokenData.valid_until;
        }
        if ((n & 0x2) != 0x0) {
            sb_access_token = sendBirdAccessTokenData.sb_access_token;
        }
        return sendBirdAccessTokenData.copy(valid_until, sb_access_token);
    }
    
    public final long component1() {
        return this.valid_until;
    }
    
    public final String component2() {
        return this.sb_access_token;
    }
    
    public final SendBirdAccessTokenData copy(final long n, final String s) {
        e.f((Object)s, "sb_access_token");
        return new SendBirdAccessTokenData(n, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SendBirdAccessTokenData)) {
            return false;
        }
        final SendBirdAccessTokenData sendBirdAccessTokenData = (SendBirdAccessTokenData)o;
        return this.valid_until == sendBirdAccessTokenData.valid_until && e.a((Object)this.sb_access_token, (Object)sendBirdAccessTokenData.sb_access_token);
    }
    
    public final String getSb_access_token() {
        return this.sb_access_token;
    }
    
    public final long getValid_until() {
        return this.valid_until;
    }
    
    @Override
    public int hashCode() {
        return this.sb_access_token.hashCode() + Long.hashCode(this.valid_until) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("SendBirdAccessTokenData(valid_until=");
        t.append(this.valid_until);
        t.append(", sb_access_token=");
        return h.c(t, this.sb_access_token, ')');
    }
}
