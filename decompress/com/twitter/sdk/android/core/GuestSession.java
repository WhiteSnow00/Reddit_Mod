// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import android.text.TextUtils;
import hj.i;
import hj.h;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;

public class GuestSession extends Session<GuestAuthToken>
{
    public static final long LOGGED_OUT_USER_ID = 0L;
    
    public GuestSession(final GuestAuthToken guestAuthToken) {
        super((AuthToken)guestAuthToken, 0L);
    }
    
    public static class Serializer implements SerializationStrategy<GuestSession>
    {
        private final h gson;
        
        public Serializer() {
            final i i = new i();
            i.b((Object)new AuthTokenAdapter(), (Class)GuestAuthToken.class);
            this.gson = i.a();
        }
        
        public GuestSession deserialize(final String s) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                try {
                    return (GuestSession)this.gson.b((Class)GuestSession.class, s);
                }
                catch (final Exception ex) {
                    final Logger logger = Twitter.getLogger();
                    final StringBuilder t = a.t("Failed to deserialize session ");
                    t.append(ex.getMessage());
                    logger.d("Twitter", t.toString());
                }
            }
            return null;
        }
        
        public /* bridge */ Object deserialize(final String s) {
            return this.deserialize(s);
        }
        
        public String serialize(final GuestSession guestSession) {
            if (guestSession != null && guestSession.getAuthToken() != null) {
                try {
                    return this.gson.h((Object)guestSession);
                }
                catch (final Exception ex) {
                    final Logger logger = Twitter.getLogger();
                    final StringBuilder t = a.t("Failed to serialize session ");
                    t.append(ex.getMessage());
                    logger.d("Twitter", t.toString());
                }
            }
            return "";
        }
        
        public /* bridge */ String serialize(final Object o) {
            return this.serialize((GuestSession)o);
        }
    }
}
