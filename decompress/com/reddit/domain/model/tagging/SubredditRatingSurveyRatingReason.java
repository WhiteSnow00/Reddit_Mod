// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import android.os.Parcel;
import sg2.e;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingReason;", "Landroid/os/Parcelable;", "", "component1", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;", "component2", "contentRatingReasonText", "ratingTag", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getContentRatingReasonText", "()Ljava/lang/String;", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;", "getRatingTag", "()Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;", "<init>", "(Ljava/lang/String;Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditRatingSurveyRatingReason implements Parcelable
{
    public static final Parcelable$Creator<SubredditRatingSurveyRatingReason> CREATOR;
    private final String contentRatingReasonText;
    private final SubredditRatingSurveyRatingTag ratingTag;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubredditRatingSurveyRatingReason(final String contentRatingReasonText, final SubredditRatingSurveyRatingTag ratingTag) {
        e.f((Object)contentRatingReasonText, "contentRatingReasonText");
        e.f((Object)ratingTag, "ratingTag");
        this.contentRatingReasonText = contentRatingReasonText;
        this.ratingTag = ratingTag;
    }
    
    public final String component1() {
        return this.contentRatingReasonText;
    }
    
    public final SubredditRatingSurveyRatingTag component2() {
        return this.ratingTag;
    }
    
    public final SubredditRatingSurveyRatingReason copy(final String s, final SubredditRatingSurveyRatingTag subredditRatingSurveyRatingTag) {
        e.f((Object)s, "contentRatingReasonText");
        e.f((Object)subredditRatingSurveyRatingTag, "ratingTag");
        return new SubredditRatingSurveyRatingReason(s, subredditRatingSurveyRatingTag);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditRatingSurveyRatingReason)) {
            return false;
        }
        final SubredditRatingSurveyRatingReason subredditRatingSurveyRatingReason = (SubredditRatingSurveyRatingReason)o;
        return e.a((Object)this.contentRatingReasonText, (Object)subredditRatingSurveyRatingReason.contentRatingReasonText) && e.a((Object)this.ratingTag, (Object)subredditRatingSurveyRatingReason.ratingTag);
    }
    
    public final String getContentRatingReasonText() {
        return this.contentRatingReasonText;
    }
    
    public final SubredditRatingSurveyRatingTag getRatingTag() {
        return this.ratingTag;
    }
    
    @Override
    public int hashCode() {
        return this.ratingTag.hashCode() + this.contentRatingReasonText.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubredditRatingSurveyRatingReason(contentRatingReasonText=");
        r.append(this.contentRatingReasonText);
        r.append(", ratingTag=");
        r.append(this.ratingTag);
        r.append(')');
        return r.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.contentRatingReasonText);
        this.ratingTag.writeToParcel(parcel, n);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubredditRatingSurveyRatingReason>
    {
        public final SubredditRatingSurveyRatingReason createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new SubredditRatingSurveyRatingReason(parcel.readString(), (SubredditRatingSurveyRatingTag)SubredditRatingSurveyRatingTag.CREATOR.createFromParcel(parcel));
        }
        
        public final SubredditRatingSurveyRatingReason[] newArray(final int n) {
            return new SubredditRatingSurveyRatingReason[n];
        }
    }
}
