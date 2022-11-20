// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ng2.e;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/ShareProfileActionsModalModel;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "", "username", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class ShareProfileActionsModalModel implements Parcelable
{
    public static final Parcelable$Creator<ShareProfileActionsModalModel> CREATOR;
    private final String username;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public ShareProfileActionsModalModel(final String username) {
        e.f((Object)username, "username");
        this.username = username;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final String getUsername() {
        return this.username;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.username);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<ShareProfileActionsModalModel>
    {
        public final ShareProfileActionsModalModel createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new ShareProfileActionsModalModel(parcel.readString());
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final ShareProfileActionsModalModel[] newArray(final int n) {
            return new ShareProfileActionsModalModel[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}
