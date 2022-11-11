// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import com.twitter.sdk.android.core.TwitterAuthToken;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class OAuthResponse implements Parcelable
{
    public static final Parcelable$Creator<OAuthResponse> CREATOR;
    public final TwitterAuthToken authToken;
    public final long userId;
    public final String userName;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<OAuthResponse>() {
            public OAuthResponse createFromParcel(final Parcel parcel) {
                return new OAuthResponse(parcel, null);
            }
            
            public OAuthResponse[] newArray(final int n) {
                return new OAuthResponse[n];
            }
        };
    }
    
    private OAuthResponse(final Parcel parcel) {
        this.authToken = (TwitterAuthToken)parcel.readParcelable(TwitterAuthToken.class.getClassLoader());
        this.userName = parcel.readString();
        this.userId = parcel.readLong();
    }
    
    public OAuthResponse(final TwitterAuthToken authToken, final String userName, final long userId) {
        this.authToken = authToken;
        this.userName = userName;
        this.userId = userId;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("authToken=");
        r.append(this.authToken);
        r.append(",userName=");
        r.append(this.userName);
        r.append(",userId=");
        r.append(this.userId);
        return r.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.authToken, n);
        parcel.writeString(this.userName);
        parcel.writeLong(this.userId);
    }
}
