// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import android.text.TextUtils;
import hj.h;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;
import ij.a;

public class TwitterSession extends Session<TwitterAuthToken>
{
    public static final long UNKNOWN_USER_ID = -1L;
    public static final String UNKNOWN_USER_NAME = "";
    @a("user_name")
    private final String userName;
    
    public TwitterSession(final TwitterAuthToken twitterAuthToken, final long n, final String userName) {
        super((AuthToken)twitterAuthToken, n);
        this.userName = userName;
    }
    
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final TwitterSession twitterSession = (TwitterSession)o;
        final String userName = this.userName;
        final String userName2 = twitterSession.userName;
        if (userName != null) {
            equals = userName.equals(userName2);
        }
        else if (userName2 != null) {
            equals = false;
        }
        return equals;
    }
    
    public long getUserId() {
        return this.getId();
    }
    
    public String getUserName() {
        return this.userName;
    }
    
    public int hashCode() {
        final int hashCode = super.hashCode();
        final String userName = this.userName;
        int hashCode2;
        if (userName != null) {
            hashCode2 = userName.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
    
    public static class Serializer implements SerializationStrategy<TwitterSession>
    {
        private final h gson;
        
        public Serializer() {
            this.gson = new h();
        }
        
        public TwitterSession deserialize(final String s) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                try {
                    return (TwitterSession)this.gson.b((Class)TwitterSession.class, s);
                }
                catch (final Exception ex) {
                    Twitter.getLogger().d("Twitter", ex.getMessage());
                }
            }
            return null;
        }
        
        public /* bridge */ Object deserialize(final String s) {
            return this.deserialize(s);
        }
        
        public String serialize(final TwitterSession twitterSession) {
            if (twitterSession != null && twitterSession.getAuthToken() != null) {
                try {
                    return this.gson.h((Object)twitterSession);
                }
                catch (final Exception ex) {
                    Twitter.getLogger().d("Twitter", ex.getMessage());
                }
            }
            return "";
        }
        
        public /* bridge */ String serialize(final Object o) {
            return this.serialize((TwitterSession)o);
        }
    }
}
