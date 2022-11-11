// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.AuthToken;
import hj.a;

public class GuestAuthToken extends OAuth2Token
{
    private static final long EXPIRES_IN_MS = 10800000L;
    public static final String HEADER_GUEST_TOKEN = "x-guest-token";
    @a("guest_token")
    private final String guestToken;
    
    public GuestAuthToken(final String s, final String s2, final String guestToken) {
        super(s, s2);
        this.guestToken = guestToken;
    }
    
    public GuestAuthToken(final String s, final String s2, final String guestToken, final long n) {
        super(s, s2, n);
        this.guestToken = guestToken;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final GuestAuthToken guestAuthToken = (GuestAuthToken)o;
        final String guestToken = this.guestToken;
        final String guestToken2 = guestAuthToken.guestToken;
        if (guestToken != null) {
            if (guestToken.equals(guestToken2)) {
                return true;
            }
        }
        else if (guestToken2 == null) {
            return true;
        }
        return false;
    }
    
    public String getGuestToken() {
        return this.guestToken;
    }
    
    public int hashCode() {
        final int hashCode = super.hashCode();
        final String guestToken = this.guestToken;
        int hashCode2;
        if (guestToken != null) {
            hashCode2 = guestToken.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
    
    public boolean isExpired() {
        return System.currentTimeMillis() >= ((AuthToken)this).createdAt + 10800000L;
    }
}
