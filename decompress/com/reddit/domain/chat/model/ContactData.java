// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import al0.f0;
import al0.b;
import android.os.Parcel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bA\u0010BJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003¢\u0006\u0004\b\u0010\u0010\u0011Jj\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\fH\u00d6\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010!\u001a\u00020\fH\u00d6\u0001J\u0019\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\fH\u00d6\u0001R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010:\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b;\u0010<R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\b>\u0010\u000eR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\b@\u0010\u0011¨\u0006C" }, d2 = { "Lcom/reddit/domain/chat/model/ContactData;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "Lcom/reddit/domain/chat/model/UserStatus;", "component5", "component6", "()Ljava/lang/Boolean;", "", "component7", "()Ljava/lang/Integer;", "", "component8", "()Ljava/lang/Long;", "username", "iconUrl", "userId", "selected", "status", "isNsfw", "karma", "createdUtc", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/reddit/domain/chat/model/UserStatus;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/reddit/domain/chat/model/ContactData;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "getIconUrl", "setIconUrl", "getUserId", "setUserId", "Z", "getSelected", "()Z", "setSelected", "(Z)V", "Lcom/reddit/domain/chat/model/UserStatus;", "getStatus", "()Lcom/reddit/domain/chat/model/UserStatus;", "setStatus", "(Lcom/reddit/domain/chat/model/UserStatus;)V", "Ljava/lang/Boolean;", "setNsfw", "(Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "getKarma", "Ljava/lang/Long;", "getCreatedUtc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/reddit/domain/chat/model/UserStatus;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class ContactData implements Parcelable
{
    public static final Parcelable$Creator<ContactData> CREATOR;
    private final Long createdUtc;
    private String iconUrl;
    private Boolean isNsfw;
    private final Integer karma;
    private boolean selected;
    private UserStatus status;
    private String userId;
    private String username;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public ContactData(final String username, final String iconUrl, final String userId, final boolean selected, final UserStatus status, final Boolean isNsfw, final Integer karma, final Long createdUtc) {
        e.f((Object)username, "username");
        e.f((Object)status, "status");
        this.username = username;
        this.iconUrl = iconUrl;
        this.userId = userId;
        this.selected = selected;
        this.status = status;
        this.isNsfw = isNsfw;
        this.karma = karma;
        this.createdUtc = createdUtc;
    }
    
    public final String component1() {
        return this.username;
    }
    
    public final String component2() {
        return this.iconUrl;
    }
    
    public final String component3() {
        return this.userId;
    }
    
    public final boolean component4() {
        return this.selected;
    }
    
    public final UserStatus component5() {
        return this.status;
    }
    
    public final Boolean component6() {
        return this.isNsfw;
    }
    
    public final Integer component7() {
        return this.karma;
    }
    
    public final Long component8() {
        return this.createdUtc;
    }
    
    public final ContactData copy(final String s, final String s2, final String s3, final boolean b, final UserStatus userStatus, final Boolean b2, final Integer n, final Long n2) {
        e.f((Object)s, "username");
        e.f((Object)userStatus, "status");
        return new ContactData(s, s2, s3, b, userStatus, b2, n, n2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContactData)) {
            return false;
        }
        final ContactData contactData = (ContactData)o;
        return e.a((Object)this.username, (Object)contactData.username) && e.a((Object)this.iconUrl, (Object)contactData.iconUrl) && e.a((Object)this.userId, (Object)contactData.userId) && this.selected == contactData.selected && this.status == contactData.status && e.a((Object)this.isNsfw, (Object)contactData.isNsfw) && e.a((Object)this.karma, (Object)contactData.karma) && e.a((Object)this.createdUtc, (Object)contactData.createdUtc);
    }
    
    public final Long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final Integer getKarma() {
        return this.karma;
    }
    
    public final boolean getSelected() {
        return this.selected;
    }
    
    public final UserStatus getStatus() {
        return this.status;
    }
    
    public final String getUserId() {
        return this.userId;
    }
    
    public final String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.username.hashCode();
        final String iconUrl = this.iconUrl;
        int hashCode2 = 0;
        int hashCode3;
        if (iconUrl == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = iconUrl.hashCode();
        }
        final String userId = this.userId;
        int hashCode4;
        if (userId == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = userId.hashCode();
        }
        int selected;
        if ((selected = (this.selected ? 1 : 0)) != 0) {
            selected = 1;
        }
        final int hashCode5 = this.status.hashCode();
        final Boolean isNsfw = this.isNsfw;
        int hashCode6;
        if (isNsfw == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = isNsfw.hashCode();
        }
        final Integer karma = this.karma;
        int hashCode7;
        if (karma == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = karma.hashCode();
        }
        final Long createdUtc = this.createdUtc;
        if (createdUtc != null) {
            hashCode2 = createdUtc.hashCode();
        }
        return (((hashCode5 + (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + selected) * 31) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode2;
    }
    
    public final Boolean isNsfw() {
        return this.isNsfw;
    }
    
    public final void setIconUrl(final String iconUrl) {
        this.iconUrl = iconUrl;
    }
    
    public final void setNsfw(final Boolean isNsfw) {
        this.isNsfw = isNsfw;
    }
    
    public final void setSelected(final boolean selected) {
        this.selected = selected;
    }
    
    public final void setStatus(final UserStatus status) {
        e.f((Object)status, "<set-?>");
        this.status = status;
    }
    
    public final void setUserId(final String userId) {
        this.userId = userId;
    }
    
    public final void setUsername(final String username) {
        e.f((Object)username, "<set-?>");
        this.username = username;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("ContactData(username=");
        r.append(this.username);
        r.append(", iconUrl=");
        r.append(this.iconUrl);
        r.append(", userId=");
        r.append(this.userId);
        r.append(", selected=");
        r.append(this.selected);
        r.append(", status=");
        r.append(this.status);
        r.append(", isNsfw=");
        r.append(this.isNsfw);
        r.append(", karma=");
        r.append(this.karma);
        r.append(", createdUtc=");
        return a.l(r, this.createdUtc, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.username);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.userId);
        parcel.writeInt((int)(this.selected ? 1 : 0));
        parcel.writeString(((Enum)this.status).name());
        final Boolean isNsfw = this.isNsfw;
        if (isNsfw == null) {
            parcel.writeInt(0);
        }
        else {
            b.o(parcel, 1, isNsfw);
        }
        final Integer karma = this.karma;
        if (karma == null) {
            parcel.writeInt(0);
        }
        else {
            b.l(parcel, 1, karma);
        }
        final Long createdUtc = this.createdUtc;
        if (createdUtc == null) {
            parcel.writeInt(0);
        }
        else {
            f0.w(parcel, 1, createdUtc);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<ContactData>
    {
        public final ContactData createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final int int1 = parcel.readInt();
            boolean b = true;
            final boolean b2 = int1 != 0;
            final UserStatus value = UserStatus.valueOf(parcel.readString());
            final int int2 = parcel.readInt();
            final Long n = null;
            Boolean value2;
            if (int2 == 0) {
                value2 = null;
            }
            else {
                if (parcel.readInt() == 0) {
                    b = false;
                }
                value2 = b;
            }
            Integer value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = parcel.readInt();
            }
            Long value4;
            if (parcel.readInt() == 0) {
                value4 = n;
            }
            else {
                value4 = parcel.readLong();
            }
            return new ContactData(string, string2, string3, b2, value, value2, value3, value4);
        }
        
        public final ContactData[] newArray(final int n) {
            return new ContactData[n];
        }
    }
}
