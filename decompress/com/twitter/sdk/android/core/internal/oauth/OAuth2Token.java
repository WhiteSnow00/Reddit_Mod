// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import ij.a;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.twitter.sdk.android.core.AuthToken;

public class OAuth2Token extends AuthToken implements Parcelable
{
    public static final Parcelable$Creator<OAuth2Token> CREATOR;
    public static final String TOKEN_TYPE_BEARER = "bearer";
    @a("access_token")
    private final String accessToken;
    @a("token_type")
    private final String tokenType;
    
    static {
        CREATOR = (Parcelable$Creator)new OAuth2Token$1();
    }
    
    private OAuth2Token(final Parcel parcel) {
        this.tokenType = parcel.readString();
        this.accessToken = parcel.readString();
    }
    
    public OAuth2Token(final Parcel parcel, final OAuth2Token$1 oAuth2Token$1) {
        this(parcel);
    }
    
    public OAuth2Token(final String tokenType, final String accessToken) {
        this.tokenType = tokenType;
        this.accessToken = accessToken;
    }
    
    public OAuth2Token(final String tokenType, final String accessToken, final long n) {
        super(n);
        this.tokenType = tokenType;
        this.accessToken = accessToken;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final OAuth2Token oAuth2Token = (OAuth2Token)o;
            final String accessToken = this.accessToken;
            Label_0062: {
                if (accessToken != null) {
                    if (accessToken.equals(oAuth2Token.accessToken)) {
                        break Label_0062;
                    }
                }
                else if (oAuth2Token.accessToken == null) {
                    break Label_0062;
                }
                return false;
            }
            final String tokenType = this.tokenType;
            final String tokenType2 = oAuth2Token.tokenType;
            if (tokenType != null) {
                if (tokenType.equals(tokenType2)) {
                    return true;
                }
            }
            else if (tokenType2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public String getAccessToken() {
        return this.accessToken;
    }
    
    public String getTokenType() {
        return this.tokenType;
    }
    
    public int hashCode() {
        final String tokenType = this.tokenType;
        int hashCode = 0;
        int hashCode2;
        if (tokenType != null) {
            hashCode2 = tokenType.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String accessToken = this.accessToken;
        if (accessToken != null) {
            hashCode = accessToken.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public boolean isExpired() {
        return false;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.tokenType);
        parcel.writeString(this.accessToken);
    }
}
