// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import ak0.m;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b4\u00105J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J|\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\tH\u00c6\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010!\u001a\u00020\u001cH\u00d6\u0001J\u0019\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cH\u00d6\u0001R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b,\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b.\u0010)R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b\u0017\u00102R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b3\u00102¨\u00066" }, d2 = { "Lcom/reddit/domain/model/SubredditSelectEvent;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "requestId", "subredditName", "subredditId", "subredditType", "icon", "keyColor", "isNsfw", "allowChatPostCreation", "isChatPostFeatureEnabled", "userIsModerator", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZ)Lcom/reddit/domain/model/SubredditSelectEvent;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "getSubredditName", "getSubredditId", "getSubredditType", "getIcon", "getKeyColor", "Ljava/lang/Boolean;", "Z", "getAllowChatPostCreation", "()Z", "getUserIsModerator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZ)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditSelectEvent implements Parcelable
{
    public static final Parcelable$Creator<SubredditSelectEvent> CREATOR;
    private final boolean allowChatPostCreation;
    private final String icon;
    private final boolean isChatPostFeatureEnabled;
    private final Boolean isNsfw;
    private final String keyColor;
    private final String requestId;
    private final String subredditId;
    private final String subredditName;
    private final String subredditType;
    private final boolean userIsModerator;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubredditSelectEvent(final String requestId, final String subredditName, final String subredditId, final String subredditType, final String icon, final String keyColor, final Boolean isNsfw, final boolean allowChatPostCreation, final boolean isChatPostFeatureEnabled, final boolean userIsModerator) {
        m.y(subredditName, "subredditName", subredditId, "subredditId", subredditType, "subredditType");
        this.requestId = requestId;
        this.subredditName = subredditName;
        this.subredditId = subredditId;
        this.subredditType = subredditType;
        this.icon = icon;
        this.keyColor = keyColor;
        this.isNsfw = isNsfw;
        this.allowChatPostCreation = allowChatPostCreation;
        this.isChatPostFeatureEnabled = isChatPostFeatureEnabled;
        this.userIsModerator = userIsModerator;
    }
    
    public final String component1() {
        return this.requestId;
    }
    
    public final boolean component10() {
        return this.userIsModerator;
    }
    
    public final String component2() {
        return this.subredditName;
    }
    
    public final String component3() {
        return this.subredditId;
    }
    
    public final String component4() {
        return this.subredditType;
    }
    
    public final String component5() {
        return this.icon;
    }
    
    public final String component6() {
        return this.keyColor;
    }
    
    public final Boolean component7() {
        return this.isNsfw;
    }
    
    public final boolean component8() {
        return this.allowChatPostCreation;
    }
    
    public final boolean component9() {
        return this.isChatPostFeatureEnabled;
    }
    
    public final SubredditSelectEvent copy(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final Boolean b, final boolean b2, final boolean b3, final boolean b4) {
        f.f((Object)s2, "subredditName");
        f.f((Object)s3, "subredditId");
        f.f((Object)s4, "subredditType");
        return new SubredditSelectEvent(s, s2, s3, s4, s5, s6, b, b2, b3, b4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditSelectEvent)) {
            return false;
        }
        final SubredditSelectEvent subredditSelectEvent = (SubredditSelectEvent)o;
        return f.a((Object)this.requestId, (Object)subredditSelectEvent.requestId) && f.a((Object)this.subredditName, (Object)subredditSelectEvent.subredditName) && f.a((Object)this.subredditId, (Object)subredditSelectEvent.subredditId) && f.a((Object)this.subredditType, (Object)subredditSelectEvent.subredditType) && f.a((Object)this.icon, (Object)subredditSelectEvent.icon) && f.a((Object)this.keyColor, (Object)subredditSelectEvent.keyColor) && f.a((Object)this.isNsfw, (Object)subredditSelectEvent.isNsfw) && this.allowChatPostCreation == subredditSelectEvent.allowChatPostCreation && this.isChatPostFeatureEnabled == subredditSelectEvent.isChatPostFeatureEnabled && this.userIsModerator == subredditSelectEvent.userIsModerator;
    }
    
    public final boolean getAllowChatPostCreation() {
        return this.allowChatPostCreation;
    }
    
    public final String getIcon() {
        return this.icon;
    }
    
    public final String getKeyColor() {
        return this.keyColor;
    }
    
    public final String getRequestId() {
        return this.requestId;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    public final String getSubredditName() {
        return this.subredditName;
    }
    
    public final String getSubredditType() {
        return this.subredditType;
    }
    
    public final boolean getUserIsModerator() {
        return this.userIsModerator;
    }
    
    @Override
    public int hashCode() {
        final String requestId = this.requestId;
        int hashCode = 0;
        int hashCode2;
        if (requestId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = requestId.hashCode();
        }
        final int f = a.f(this.subredditType, a.f(this.subredditId, a.f(this.subredditName, hashCode2 * 31, 31), 31), 31);
        final String icon = this.icon;
        int hashCode3;
        if (icon == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = icon.hashCode();
        }
        final String keyColor = this.keyColor;
        int hashCode4;
        if (keyColor == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = keyColor.hashCode();
        }
        final Boolean isNsfw = this.isNsfw;
        if (isNsfw != null) {
            hashCode = isNsfw.hashCode();
        }
        final int allowChatPostCreation = this.allowChatPostCreation ? 1 : 0;
        int n = 1;
        int n2 = allowChatPostCreation;
        if (allowChatPostCreation != 0) {
            n2 = 1;
        }
        int isChatPostFeatureEnabled;
        if ((isChatPostFeatureEnabled = (this.isChatPostFeatureEnabled ? 1 : 0)) != 0) {
            isChatPostFeatureEnabled = 1;
        }
        final int userIsModerator = this.userIsModerator ? 1 : 0;
        if (userIsModerator == 0) {
            n = userIsModerator;
        }
        return (((((f + hashCode3) * 31 + hashCode4) * 31 + hashCode) * 31 + n2) * 31 + isChatPostFeatureEnabled) * 31 + n;
    }
    
    public final boolean isChatPostFeatureEnabled() {
        return this.isChatPostFeatureEnabled;
    }
    
    public final Boolean isNsfw() {
        return this.isNsfw;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditSelectEvent(requestId=");
        k.append(this.requestId);
        k.append(", subredditName=");
        k.append(this.subredditName);
        k.append(", subredditId=");
        k.append(this.subredditId);
        k.append(", subredditType=");
        k.append(this.subredditType);
        k.append(", icon=");
        k.append(this.icon);
        k.append(", keyColor=");
        k.append(this.keyColor);
        k.append(", isNsfw=");
        k.append(this.isNsfw);
        k.append(", allowChatPostCreation=");
        k.append(this.allowChatPostCreation);
        k.append(", isChatPostFeatureEnabled=");
        k.append(this.isChatPostFeatureEnabled);
        k.append(", userIsModerator=");
        return s0.o(k, this.userIsModerator, ')');
    }
    
    public void writeToParcel(final Parcel parcel, int booleanValue) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.requestId);
        parcel.writeString(this.subredditName);
        parcel.writeString(this.subredditId);
        parcel.writeString(this.subredditType);
        parcel.writeString(this.icon);
        parcel.writeString(this.keyColor);
        final Boolean isNsfw = this.isNsfw;
        if (isNsfw == null) {
            booleanValue = 0;
        }
        else {
            parcel.writeInt(1);
            booleanValue = (((boolean)isNsfw) ? 1 : 0);
        }
        parcel.writeInt(booleanValue);
        parcel.writeInt((int)(this.allowChatPostCreation ? 1 : 0));
        parcel.writeInt((int)(this.isChatPostFeatureEnabled ? 1 : 0));
        parcel.writeInt((int)(this.userIsModerator ? 1 : 0));
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubredditSelectEvent>
    {
        public final SubredditSelectEvent createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final String string5 = parcel.readString();
            final String string6 = parcel.readString();
            Boolean value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = (parcel.readInt() != 0);
            }
            return new SubredditSelectEvent(string, string2, string3, string4, string5, string6, value, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }
        
        public final SubredditSelectEvent[] newArray(final int n) {
            return new SubredditSelectEvent[n];
        }
    }
}
