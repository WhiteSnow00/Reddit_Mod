// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import al0.f0;
import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import sg2.e;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b/\u00100J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003JV\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0017H\u00d6\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b\u0011\u0010(R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.¨\u00061" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyResponse;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "()Ljava/lang/Boolean;", "component4", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;", "component5", "", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingReason;", "component6", "id", "version", "isFromMod", "isPending", "rating", "ratingReasons", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;Ljava/util/List;)Lcom/reddit/domain/model/tagging/SubredditRatingSurveyResponse;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getVersion", "Ljava/lang/Boolean;", "Z", "()Z", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;", "getRating", "()Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;", "Ljava/util/List;", "getRatingReasons", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;Ljava/util/List;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditRatingSurveyResponse implements Parcelable
{
    public static final Parcelable$Creator<SubredditRatingSurveyResponse> CREATOR;
    private final String id;
    private final Boolean isFromMod;
    private final boolean isPending;
    private final SubredditRatingSurveyRatingTag rating;
    private final List<SubredditRatingSurveyRatingReason> ratingReasons;
    private final String version;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubredditRatingSurveyResponse(final String id, final String version, final Boolean isFromMod, final boolean isPending, final SubredditRatingSurveyRatingTag rating, final List<SubredditRatingSurveyRatingReason> ratingReasons) {
        e.f((Object)version, "version");
        e.f((Object)rating, "rating");
        e.f((Object)ratingReasons, "ratingReasons");
        this.id = id;
        this.version = version;
        this.isFromMod = isFromMod;
        this.isPending = isPending;
        this.rating = rating;
        this.ratingReasons = ratingReasons;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.version;
    }
    
    public final Boolean component3() {
        return this.isFromMod;
    }
    
    public final boolean component4() {
        return this.isPending;
    }
    
    public final SubredditRatingSurveyRatingTag component5() {
        return this.rating;
    }
    
    public final List<SubredditRatingSurveyRatingReason> component6() {
        return this.ratingReasons;
    }
    
    public final SubredditRatingSurveyResponse copy(final String s, final String s2, final Boolean b, final boolean b2, final SubredditRatingSurveyRatingTag subredditRatingSurveyRatingTag, final List<SubredditRatingSurveyRatingReason> list) {
        e.f((Object)s2, "version");
        e.f((Object)subredditRatingSurveyRatingTag, "rating");
        e.f((Object)list, "ratingReasons");
        return new SubredditRatingSurveyResponse(s, s2, b, b2, subredditRatingSurveyRatingTag, list);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditRatingSurveyResponse)) {
            return false;
        }
        final SubredditRatingSurveyResponse subredditRatingSurveyResponse = (SubredditRatingSurveyResponse)o;
        return e.a((Object)this.id, (Object)subredditRatingSurveyResponse.id) && e.a((Object)this.version, (Object)subredditRatingSurveyResponse.version) && e.a((Object)this.isFromMod, (Object)subredditRatingSurveyResponse.isFromMod) && this.isPending == subredditRatingSurveyResponse.isPending && e.a((Object)this.rating, (Object)subredditRatingSurveyResponse.rating) && e.a((Object)this.ratingReasons, (Object)subredditRatingSurveyResponse.ratingReasons);
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final SubredditRatingSurveyRatingTag getRating() {
        return this.rating;
    }
    
    public final List<SubredditRatingSurveyRatingReason> getRatingReasons() {
        return this.ratingReasons;
    }
    
    public final String getVersion() {
        return this.version;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        final int n = 0;
        int hashCode;
        if (id == null) {
            hashCode = 0;
        }
        else {
            hashCode = id.hashCode();
        }
        final int c = b.c(this.version, hashCode * 31, 31);
        final Boolean isFromMod = this.isFromMod;
        int hashCode2;
        if (isFromMod == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = isFromMod.hashCode();
        }
        int isPending;
        if ((isPending = (this.isPending ? 1 : 0)) != 0) {
            isPending = 1;
        }
        return this.ratingReasons.hashCode() + (this.rating.hashCode() + ((c + hashCode2) * 31 + isPending) * 31) * 31;
    }
    
    public final Boolean isFromMod() {
        return this.isFromMod;
    }
    
    public final boolean isPending() {
        return this.isPending;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubredditRatingSurveyResponse(id=");
        r.append(this.id);
        r.append(", version=");
        r.append(this.version);
        r.append(", isFromMod=");
        r.append(this.isFromMod);
        r.append(", isPending=");
        r.append(this.isPending);
        r.append(", rating=");
        r.append(this.rating);
        r.append(", ratingReasons=");
        return d.o(r, (List)this.ratingReasons, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.version);
        final Boolean isFromMod = this.isFromMod;
        int booleanValue;
        if (isFromMod == null) {
            booleanValue = 0;
        }
        else {
            parcel.writeInt(1);
            booleanValue = (((boolean)isFromMod) ? 1 : 0);
        }
        parcel.writeInt(booleanValue);
        parcel.writeInt((int)(this.isPending ? 1 : 0));
        this.rating.writeToParcel(parcel, n);
        final Iterator s = al0.a.s((List)this.ratingReasons, parcel);
        while (s.hasNext()) {
            ((SubredditRatingSurveyRatingReason)s.next()).writeToParcel(parcel, n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubredditRatingSurveyResponse>
    {
        public final SubredditRatingSurveyResponse createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final int int1 = parcel.readInt();
            int i = 0;
            Boolean value;
            if (int1 == 0) {
                value = null;
            }
            else {
                value = (parcel.readInt() != 0);
            }
            final boolean b = parcel.readInt() != 0;
            final SubredditRatingSurveyRatingTag subredditRatingSurveyRatingTag = (SubredditRatingSurveyRatingTag)SubredditRatingSurveyRatingTag.CREATOR.createFromParcel(parcel);
            int int2;
            ArrayList list;
            for (int2 = parcel.readInt(), list = new ArrayList(int2); i != int2; i = f0.b((Parcelable$Creator)SubredditRatingSurveyRatingReason.CREATOR, parcel, list, i, 1)) {}
            return new SubredditRatingSurveyResponse(string, string2, value, b, subredditRatingSurveyRatingTag, (List<SubredditRatingSurveyRatingReason>)list);
        }
        
        public final SubredditRatingSurveyResponse[] newArray(final int n) {
            return new SubredditRatingSurveyResponse[n];
        }
    }
}
