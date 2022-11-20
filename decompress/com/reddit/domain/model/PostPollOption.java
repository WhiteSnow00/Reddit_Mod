// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bH\u00c6\u0003¢\u0006\u0004\b\u000b\u0010\nJJ\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\bH\u00c6\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010\u0007R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010\nR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b'\u0010\n¨\u0006*" }, d2 = { "Lcom/reddit/domain/model/PostPollOption;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "()Ljava/lang/Long;", "", "component4", "()Ljava/lang/Integer;", "component5", "id", "text", "voteCount", "userCoinsSet", "optionTotalCoinsSet", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/reddit/domain/model/PostPollOption;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getText", "Ljava/lang/Long;", "getVoteCount", "Ljava/lang/Integer;", "getUserCoinsSet", "getOptionTotalCoinsSet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostPollOption implements Parcelable
{
    public static final Parcelable$Creator<PostPollOption> CREATOR;
    private final String id;
    private final Integer optionTotalCoinsSet;
    private final String text;
    private final Integer userCoinsSet;
    private final Long voteCount;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public PostPollOption(final String id, final String text, @n(name = "vote_count") final Long voteCount, @n(name = "user_stake_amount") final Integer userCoinsSet, @n(name = "total_stake_amount") final Integer optionTotalCoinsSet) {
        e.f((Object)id, "id");
        this.id = id;
        this.text = text;
        this.voteCount = voteCount;
        this.userCoinsSet = userCoinsSet;
        this.optionTotalCoinsSet = optionTotalCoinsSet;
    }
    
    public PostPollOption(final String s, final String s2, final Long n, Integer n2, Integer n3, final int n4, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 0x8) != 0x0) {
            n2 = null;
        }
        if ((n4 & 0x10) != 0x0) {
            n3 = null;
        }
        this(s, s2, n, n2, n3);
    }
    
    public static PostPollOption copy$default(final PostPollOption postPollOption, String id, String text, Long voteCount, Integer userCoinsSet, Integer optionTotalCoinsSet, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            id = postPollOption.id;
        }
        if ((n & 0x2) != 0x0) {
            text = postPollOption.text;
        }
        if ((n & 0x4) != 0x0) {
            voteCount = postPollOption.voteCount;
        }
        if ((n & 0x8) != 0x0) {
            userCoinsSet = postPollOption.userCoinsSet;
        }
        if ((n & 0x10) != 0x0) {
            optionTotalCoinsSet = postPollOption.optionTotalCoinsSet;
        }
        return postPollOption.copy(id, text, voteCount, userCoinsSet, optionTotalCoinsSet);
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.text;
    }
    
    public final Long component3() {
        return this.voteCount;
    }
    
    public final Integer component4() {
        return this.userCoinsSet;
    }
    
    public final Integer component5() {
        return this.optionTotalCoinsSet;
    }
    
    public final PostPollOption copy(final String s, final String s2, @n(name = "vote_count") final Long n, @n(name = "user_stake_amount") final Integer n2, @n(name = "total_stake_amount") final Integer n3) {
        e.f((Object)s, "id");
        return new PostPollOption(s, s2, n, n2, n3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostPollOption)) {
            return false;
        }
        final PostPollOption postPollOption = (PostPollOption)o;
        return e.a((Object)this.id, (Object)postPollOption.id) && e.a((Object)this.text, (Object)postPollOption.text) && e.a((Object)this.voteCount, (Object)postPollOption.voteCount) && e.a((Object)this.userCoinsSet, (Object)postPollOption.userCoinsSet) && e.a((Object)this.optionTotalCoinsSet, (Object)postPollOption.optionTotalCoinsSet);
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final Integer getOptionTotalCoinsSet() {
        return this.optionTotalCoinsSet;
    }
    
    public final String getText() {
        return this.text;
    }
    
    public final Integer getUserCoinsSet() {
        return this.userCoinsSet;
    }
    
    public final Long getVoteCount() {
        return this.voteCount;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String text = this.text;
        int hashCode2 = 0;
        int hashCode3;
        if (text == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = text.hashCode();
        }
        final Long voteCount = this.voteCount;
        int hashCode4;
        if (voteCount == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = voteCount.hashCode();
        }
        final Integer userCoinsSet = this.userCoinsSet;
        int hashCode5;
        if (userCoinsSet == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = userCoinsSet.hashCode();
        }
        final Integer optionTotalCoinsSet = this.optionTotalCoinsSet;
        if (optionTotalCoinsSet != null) {
            hashCode2 = optionTotalCoinsSet.hashCode();
        }
        return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostPollOption(id=");
        t.append(this.id);
        t.append(", text=");
        t.append(this.text);
        t.append(", voteCount=");
        t.append(this.voteCount);
        t.append(", userCoinsSet=");
        t.append(this.userCoinsSet);
        t.append(", optionTotalCoinsSet=");
        return m5.a.h(t, this.optionTotalCoinsSet, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.text);
        final Long voteCount = this.voteCount;
        if (voteCount == null) {
            parcel.writeInt(0);
        }
        else {
            b.t(parcel, 1, voteCount);
        }
        final Integer userCoinsSet = this.userCoinsSet;
        if (userCoinsSet == null) {
            parcel.writeInt(0);
        }
        else {
            ph0.a.j(parcel, 1, userCoinsSet);
        }
        final Integer optionTotalCoinsSet = this.optionTotalCoinsSet;
        if (optionTotalCoinsSet == null) {
            parcel.writeInt(0);
        }
        else {
            ph0.a.j(parcel, 1, optionTotalCoinsSet);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<PostPollOption>
    {
        public final PostPollOption createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            Long value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = parcel.readLong();
            }
            Integer value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readInt();
            }
            Integer value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = parcel.readInt();
            }
            return new PostPollOption(string, string2, value, value2, value3);
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final PostPollOption[] newArray(final int n) {
            return new PostPollOption[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}
