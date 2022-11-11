// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.ArrayList;
import java.util.Iterator;
import al0.f0;
import android.os.Parcel;
import sg2.e;
import android.support.v4.media.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FBw\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013¢\u0006\u0004\bD\u0010EJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0006H\u00c6\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\r\u0010\fJ\t\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013H\u00c6\u0003J\u0098\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013H\u00c6\u0001¢\u0006\u0004\b!\u0010\"J\t\u0010#\u001a\u00020\u0002H\u00d6\u0001J\t\u0010%\u001a\u00020$H\u00d6\u0001J\u0013\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010)\u001a\u00020$H\u00d6\u0001J\u0019\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020$H\u00d6\u0001R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u00104\u001a\u0004\b\u0018\u00105R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u00104\u001a\u0004\b\u0019\u00105R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b\u001a\u00105R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b7\u0010\fR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\b8\u0010\fR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b9\u00101R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b:\u00101R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b<\u0010\u0012R\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b \u0010=\u001a\u0004\b>\u0010?R\u0011\u0010C\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006G" }, d2 = { "Lcom/reddit/domain/model/RelatedSubreddit;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Float;", "component8", "component9", "component10", "", "component11", "()Ljava/lang/Long;", "", "component12", "name", "id", "prefixName", "isChatPostCreationAllowed", "isChatPostFeatureEnabled", "isNsfw", "difficultyScore", "similarityScore", "iconUrl", "color", "subscribersCount", "relatedSubreddits", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/reddit/domain/model/RelatedSubreddit;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getId", "getPrefixName", "Z", "()Z", "Ljava/lang/Float;", "getDifficultyScore", "getSimilarityScore", "getIconUrl", "getColor", "Ljava/lang/Long;", "getSubscribersCount", "Ljava/util/List;", "getRelatedSubreddits", "()Ljava/util/List;", "Lcom/reddit/domain/model/RemovalRate;", "getRemovalRate", "()Lcom/reddit/domain/model/RemovalRate;", "removalRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RelatedSubreddit implements Parcelable
{
    public static final Parcelable$Creator<RelatedSubreddit> CREATOR;
    public static final Companion Companion;
    public static final double HIGH_THRESHOLD = 0.65;
    public static final double LOW_THRESHOLD = 0.91;
    private final String color;
    private final Float difficultyScore;
    private final String iconUrl;
    private final String id;
    private final boolean isChatPostCreationAllowed;
    private final boolean isChatPostFeatureEnabled;
    private final boolean isNsfw;
    private final String name;
    private final String prefixName;
    private final List<RelatedSubreddit> relatedSubreddits;
    private final Float similarityScore;
    private final Long subscribersCount;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public RelatedSubreddit(final String name, final String id, final String prefixName, final boolean isChatPostCreationAllowed, final boolean isChatPostFeatureEnabled, final boolean isNsfw, final Float difficultyScore, final Float similarityScore, final String iconUrl, final String color, final Long subscribersCount, final List<RelatedSubreddit> relatedSubreddits) {
        a.t(name, "name", id, "id", prefixName, "prefixName", iconUrl, "iconUrl");
        this.name = name;
        this.id = id;
        this.prefixName = prefixName;
        this.isChatPostCreationAllowed = isChatPostCreationAllowed;
        this.isChatPostFeatureEnabled = isChatPostFeatureEnabled;
        this.isNsfw = isNsfw;
        this.difficultyScore = difficultyScore;
        this.similarityScore = similarityScore;
        this.iconUrl = iconUrl;
        this.color = color;
        this.subscribersCount = subscribersCount;
        this.relatedSubreddits = relatedSubreddits;
    }
    
    public final String component1() {
        return this.name;
    }
    
    public final String component10() {
        return this.color;
    }
    
    public final Long component11() {
        return this.subscribersCount;
    }
    
    public final List<RelatedSubreddit> component12() {
        return this.relatedSubreddits;
    }
    
    public final String component2() {
        return this.id;
    }
    
    public final String component3() {
        return this.prefixName;
    }
    
    public final boolean component4() {
        return this.isChatPostCreationAllowed;
    }
    
    public final boolean component5() {
        return this.isChatPostFeatureEnabled;
    }
    
    public final boolean component6() {
        return this.isNsfw;
    }
    
    public final Float component7() {
        return this.difficultyScore;
    }
    
    public final Float component8() {
        return this.similarityScore;
    }
    
    public final String component9() {
        return this.iconUrl;
    }
    
    public final RelatedSubreddit copy(final String s, final String s2, final String s3, final boolean b, final boolean b2, final boolean b3, final Float n, final Float n2, final String s4, final String s5, final Long n3, final List<RelatedSubreddit> list) {
        e.f((Object)s, "name");
        e.f((Object)s2, "id");
        e.f((Object)s3, "prefixName");
        e.f((Object)s4, "iconUrl");
        return new RelatedSubreddit(s, s2, s3, b, b2, b3, n, n2, s4, s5, n3, list);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RelatedSubreddit)) {
            return false;
        }
        final RelatedSubreddit relatedSubreddit = (RelatedSubreddit)o;
        return e.a((Object)this.name, (Object)relatedSubreddit.name) && e.a((Object)this.id, (Object)relatedSubreddit.id) && e.a((Object)this.prefixName, (Object)relatedSubreddit.prefixName) && this.isChatPostCreationAllowed == relatedSubreddit.isChatPostCreationAllowed && this.isChatPostFeatureEnabled == relatedSubreddit.isChatPostFeatureEnabled && this.isNsfw == relatedSubreddit.isNsfw && e.a((Object)this.difficultyScore, (Object)relatedSubreddit.difficultyScore) && e.a((Object)this.similarityScore, (Object)relatedSubreddit.similarityScore) && e.a((Object)this.iconUrl, (Object)relatedSubreddit.iconUrl) && e.a((Object)this.color, (Object)relatedSubreddit.color) && e.a((Object)this.subscribersCount, (Object)relatedSubreddit.subscribersCount) && e.a((Object)this.relatedSubreddits, (Object)relatedSubreddit.relatedSubreddits);
    }
    
    public final String getColor() {
        return this.color;
    }
    
    public final Float getDifficultyScore() {
        return this.difficultyScore;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getPrefixName() {
        return this.prefixName;
    }
    
    public final List<RelatedSubreddit> getRelatedSubreddits() {
        return this.relatedSubreddits;
    }
    
    public final RemovalRate getRemovalRate() {
        final Float difficultyScore = this.difficultyScore;
        if (difficultyScore != null) {
            RemovalRate removalRate;
            if (difficultyScore > 0.91) {
                removalRate = RemovalRate.LOW;
            }
            else if (this.difficultyScore < 0.65) {
                removalRate = RemovalRate.HIGH;
            }
            else {
                removalRate = RemovalRate.MEDIUM;
            }
            return removalRate;
        }
        return RemovalRate.LOW;
    }
    
    public final Float getSimilarityScore() {
        return this.similarityScore;
    }
    
    public final Long getSubscribersCount() {
        return this.subscribersCount;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.prefixName, b.c(this.id, this.name.hashCode() * 31, 31), 31);
        final int isChatPostCreationAllowed = this.isChatPostCreationAllowed ? 1 : 0;
        int n = 1;
        int n2 = isChatPostCreationAllowed;
        if (isChatPostCreationAllowed != 0) {
            n2 = 1;
        }
        int isChatPostFeatureEnabled;
        if ((isChatPostFeatureEnabled = (this.isChatPostFeatureEnabled ? 1 : 0)) != 0) {
            isChatPostFeatureEnabled = 1;
        }
        final int isNsfw = this.isNsfw ? 1 : 0;
        if (isNsfw == 0) {
            n = isNsfw;
        }
        final Float difficultyScore = this.difficultyScore;
        final int n3 = 0;
        int hashCode;
        if (difficultyScore == null) {
            hashCode = 0;
        }
        else {
            hashCode = difficultyScore.hashCode();
        }
        final Float similarityScore = this.similarityScore;
        int hashCode2;
        if (similarityScore == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = similarityScore.hashCode();
        }
        final int c2 = b.c(this.iconUrl, (((((c + n2) * 31 + isChatPostFeatureEnabled) * 31 + n) * 31 + hashCode) * 31 + hashCode2) * 31, 31);
        final String color = this.color;
        int hashCode3;
        if (color == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = color.hashCode();
        }
        final Long subscribersCount = this.subscribersCount;
        int hashCode4;
        if (subscribersCount == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subscribersCount.hashCode();
        }
        final List<RelatedSubreddit> relatedSubreddits = this.relatedSubreddits;
        int hashCode5;
        if (relatedSubreddits == null) {
            hashCode5 = n3;
        }
        else {
            hashCode5 = relatedSubreddits.hashCode();
        }
        return ((c2 + hashCode3) * 31 + hashCode4) * 31 + hashCode5;
    }
    
    public final boolean isChatPostCreationAllowed() {
        return this.isChatPostCreationAllowed;
    }
    
    public final boolean isChatPostFeatureEnabled() {
        return this.isChatPostFeatureEnabled;
    }
    
    public final boolean isNsfw() {
        return this.isNsfw;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("RelatedSubreddit(name=");
        r.append(this.name);
        r.append(", id=");
        r.append(this.id);
        r.append(", prefixName=");
        r.append(this.prefixName);
        r.append(", isChatPostCreationAllowed=");
        r.append(this.isChatPostCreationAllowed);
        r.append(", isChatPostFeatureEnabled=");
        r.append(this.isChatPostFeatureEnabled);
        r.append(", isNsfw=");
        r.append(this.isNsfw);
        r.append(", difficultyScore=");
        r.append(this.difficultyScore);
        r.append(", similarityScore=");
        r.append(this.similarityScore);
        r.append(", iconUrl=");
        r.append(this.iconUrl);
        r.append(", color=");
        r.append(this.color);
        r.append(", subscribersCount=");
        r.append(this.subscribersCount);
        r.append(", relatedSubreddits=");
        return d.o(r, (List)this.relatedSubreddits, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.id);
        parcel.writeString(this.prefixName);
        parcel.writeInt((int)(this.isChatPostCreationAllowed ? 1 : 0));
        parcel.writeInt((int)(this.isChatPostFeatureEnabled ? 1 : 0));
        parcel.writeInt((int)(this.isNsfw ? 1 : 0));
        final Float difficultyScore = this.difficultyScore;
        if (difficultyScore == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeFloat((float)difficultyScore);
        }
        final Float similarityScore = this.similarityScore;
        if (similarityScore == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeFloat((float)similarityScore);
        }
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.color);
        final Long subscribersCount = this.subscribersCount;
        if (subscribersCount == null) {
            parcel.writeInt(0);
        }
        else {
            f0.w(parcel, 1, subscribersCount);
        }
        final List<RelatedSubreddit> relatedSubreddits = this.relatedSubreddits;
        if (relatedSubreddits == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator t = d.t(parcel, 1, (List)relatedSubreddits);
            while (t.hasNext()) {
                ((RelatedSubreddit)t.next()).writeToParcel(parcel, n);
            }
        }
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/RelatedSubreddit$Companion;", "", "()V", "HIGH_THRESHOLD", "", "LOW_THRESHOLD", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<RelatedSubreddit>
    {
        public final RelatedSubreddit createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final int int1 = parcel.readInt();
            int b = 0;
            final boolean b2 = int1 != 0;
            final boolean b3 = parcel.readInt() != 0;
            final boolean b4 = parcel.readInt() != 0;
            final int int2 = parcel.readInt();
            List<RelatedSubreddit> list = null;
            Float value;
            if (int2 == 0) {
                value = null;
            }
            else {
                value = parcel.readFloat();
            }
            Float value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readFloat();
            }
            final String string4 = parcel.readString();
            final String string5 = parcel.readString();
            Long value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = parcel.readLong();
            }
            if (parcel.readInt() != 0) {
                final int int3 = parcel.readInt();
                final ArrayList list2 = new ArrayList<RelatedSubreddit>(int3);
                while (true) {
                    list = (List<RelatedSubreddit>)list2;
                    if (b == int3) {
                        break;
                    }
                    b = f0.b((Parcelable$Creator)RelatedSubreddit.CREATOR, parcel, list2, b, 1);
                }
            }
            return new RelatedSubreddit(string, string2, string3, b2, b3, b4, value, value2, string4, string5, value3, list);
        }
        
        public final RelatedSubreddit[] newArray(final int n) {
            return new RelatedSubreddit[n];
        }
    }
}
