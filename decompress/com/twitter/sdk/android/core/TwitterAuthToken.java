// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import android.os.Parcel;
import ij.a;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TwitterAuthToken extends AuthToken implements Parcelable
{
    public static final Parcelable$Creator<TwitterAuthToken> CREATOR;
    @a("secret")
    public final String secret;
    @a("token")
    public final String token;
    
    static {
        CREATOR = (Parcelable$Creator)new TwitterAuthToken$1();
    }
    
    private TwitterAuthToken(final Parcel parcel) {
        this.token = parcel.readString();
        this.secret = parcel.readString();
    }
    
    public TwitterAuthToken(final Parcel parcel, final TwitterAuthToken$1 twitterAuthToken$1) {
        this(parcel);
    }
    
    public TwitterAuthToken(final String token, final String secret) {
        this.token = token;
        this.secret = secret;
    }
    
    public TwitterAuthToken(final String token, final String secret, final long n) {
        super(n);
        this.token = token;
        this.secret = secret;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TwitterAuthToken)) {
            return false;
        }
        final TwitterAuthToken twitterAuthToken = (TwitterAuthToken)o;
        final String secret = this.secret;
        Label_0053: {
            if (secret != null) {
                if (secret.equals(twitterAuthToken.secret)) {
                    break Label_0053;
                }
            }
            else if (twitterAuthToken.secret == null) {
                break Label_0053;
            }
            return false;
        }
        final String token = this.token;
        final String token2 = twitterAuthToken.token;
        if (token != null) {
            if (token.equals(token2)) {
                return true;
            }
        }
        else if (token2 == null) {
            return true;
        }
        return false;
    }
    
    public int hashCode() {
        final String token = this.token;
        int hashCode = 0;
        int hashCode2;
        if (token != null) {
            hashCode2 = token.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String secret = this.secret;
        if (secret != null) {
            hashCode = secret.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public boolean isExpired() {
        return false;
    }
    
    public String toString() {
        final StringBuilder t = a.t("token=");
        t.append(this.token);
        t.append(",secret=");
        t.append(this.secret);
        return t.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.token);
        parcel.writeString(this.secret);
    }
}
