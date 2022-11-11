// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import android.os.Parcel;
import al0.f0;
import sg2.e;
import android.support.v4.media.a;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0002H\u00c6\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006&" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "component4", "component5", "rating", "weight", "name", "description", "iconUrl", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getRating", "()Ljava/lang/String;", "I", "getWeight", "()I", "getName", "getDescription", "getIconUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditRatingSurveyRatingTag implements Parcelable
{
    public static final Parcelable$Creator<SubredditRatingSurveyRatingTag> CREATOR;
    private final String description;
    private final String iconUrl;
    private final String name;
    private final String rating;
    private final int weight;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubredditRatingSurveyRatingTag(final String rating, final int weight, final String name, final String description, final String iconUrl) {
        a.t(rating, "rating", name, "name", description, "description", iconUrl, "iconUrl");
        this.rating = rating;
        this.weight = weight;
        this.name = name;
        this.description = description;
        this.iconUrl = iconUrl;
    }
    
    public final String component1() {
        return this.rating;
    }
    
    public final int component2() {
        return this.weight;
    }
    
    public final String component3() {
        return this.name;
    }
    
    public final String component4() {
        return this.description;
    }
    
    public final String component5() {
        return this.iconUrl;
    }
    
    public final SubredditRatingSurveyRatingTag copy(final String s, final int n, final String s2, final String s3, final String s4) {
        e.f((Object)s, "rating");
        e.f((Object)s2, "name");
        e.f((Object)s3, "description");
        e.f((Object)s4, "iconUrl");
        return new SubredditRatingSurveyRatingTag(s, n, s2, s3, s4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditRatingSurveyRatingTag)) {
            return false;
        }
        final SubredditRatingSurveyRatingTag subredditRatingSurveyRatingTag = (SubredditRatingSurveyRatingTag)o;
        return e.a((Object)this.rating, (Object)subredditRatingSurveyRatingTag.rating) && this.weight == subredditRatingSurveyRatingTag.weight && e.a((Object)this.name, (Object)subredditRatingSurveyRatingTag.name) && e.a((Object)this.description, (Object)subredditRatingSurveyRatingTag.description) && e.a((Object)this.iconUrl, (Object)subredditRatingSurveyRatingTag.iconUrl);
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getRating() {
        return this.rating;
    }
    
    public final int getWeight() {
        return this.weight;
    }
    
    @Override
    public int hashCode() {
        return this.iconUrl.hashCode() + b.c(this.description, b.c(this.name, a.c(this.weight, this.rating.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubredditRatingSurveyRatingTag(rating=");
        r.append(this.rating);
        r.append(", weight=");
        r.append(this.weight);
        r.append(", name=");
        r.append(this.name);
        r.append(", description=");
        r.append(this.description);
        r.append(", iconUrl=");
        return f0.n(r, this.iconUrl, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.rating);
        parcel.writeInt(this.weight);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.iconUrl);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubredditRatingSurveyRatingTag>
    {
        public final SubredditRatingSurveyRatingTag createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new SubredditRatingSurveyRatingTag(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        public final SubredditRatingSurveyRatingTag[] newArray(final int n) {
            return new SubredditRatingSurveyRatingTag[n];
        }
    }
}
