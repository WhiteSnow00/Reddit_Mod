// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import android.os.Parcel;
import ah2.f;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\f\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%¨\u0006(" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditRatingSurvey;", "Landroid/os/Parcelable;", "", "component1", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyQuestion;", "component2", "", "component3", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyResponse;", "component4", "version", "rootQuestion", "isEligible", "response", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyQuestion;", "getRootQuestion", "()Lcom/reddit/domain/model/tagging/SubredditRatingSurveyQuestion;", "Z", "()Z", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyResponse;", "getResponse", "()Lcom/reddit/domain/model/tagging/SubredditRatingSurveyResponse;", "<init>", "(Ljava/lang/String;Lcom/reddit/domain/model/tagging/SubredditRatingSurveyQuestion;ZLcom/reddit/domain/model/tagging/SubredditRatingSurveyResponse;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditRatingSurvey implements Parcelable
{
    public static final Parcelable$Creator<SubredditRatingSurvey> CREATOR;
    private final boolean isEligible;
    private final SubredditRatingSurveyResponse response;
    private final SubredditRatingSurveyQuestion rootQuestion;
    private final String version;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubredditRatingSurvey(final String version, final SubredditRatingSurveyQuestion rootQuestion, final boolean isEligible, final SubredditRatingSurveyResponse response) {
        f.f((Object)version, "version");
        f.f((Object)rootQuestion, "rootQuestion");
        this.version = version;
        this.rootQuestion = rootQuestion;
        this.isEligible = isEligible;
        this.response = response;
    }
    
    public final String component1() {
        return this.version;
    }
    
    public final SubredditRatingSurveyQuestion component2() {
        return this.rootQuestion;
    }
    
    public final boolean component3() {
        return this.isEligible;
    }
    
    public final SubredditRatingSurveyResponse component4() {
        return this.response;
    }
    
    public final SubredditRatingSurvey copy(final String s, final SubredditRatingSurveyQuestion subredditRatingSurveyQuestion, final boolean b, final SubredditRatingSurveyResponse subredditRatingSurveyResponse) {
        f.f((Object)s, "version");
        f.f((Object)subredditRatingSurveyQuestion, "rootQuestion");
        return new SubredditRatingSurvey(s, subredditRatingSurveyQuestion, b, subredditRatingSurveyResponse);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditRatingSurvey)) {
            return false;
        }
        final SubredditRatingSurvey subredditRatingSurvey = (SubredditRatingSurvey)o;
        return f.a((Object)this.version, (Object)subredditRatingSurvey.version) && f.a((Object)this.rootQuestion, (Object)subredditRatingSurvey.rootQuestion) && this.isEligible == subredditRatingSurvey.isEligible && f.a((Object)this.response, (Object)subredditRatingSurvey.response);
    }
    
    public final SubredditRatingSurveyResponse getResponse() {
        return this.response;
    }
    
    public final SubredditRatingSurveyQuestion getRootQuestion() {
        return this.rootQuestion;
    }
    
    public final String getVersion() {
        return this.version;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.version.hashCode();
        final int hashCode2 = this.rootQuestion.hashCode();
        int isEligible;
        if ((isEligible = (this.isEligible ? 1 : 0)) != 0) {
            isEligible = 1;
        }
        final SubredditRatingSurveyResponse response = this.response;
        int hashCode3;
        if (response == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = response.hashCode();
        }
        return ((hashCode2 + hashCode * 31) * 31 + isEligible) * 31 + hashCode3;
    }
    
    public final boolean isEligible() {
        return this.isEligible;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditRatingSurvey(version=");
        k.append(this.version);
        k.append(", rootQuestion=");
        k.append(this.rootQuestion);
        k.append(", isEligible=");
        k.append(this.isEligible);
        k.append(", response=");
        k.append(this.response);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.version);
        this.rootQuestion.writeToParcel(parcel, n);
        parcel.writeInt((int)(this.isEligible ? 1 : 0));
        final SubredditRatingSurveyResponse response = this.response;
        if (response == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            response.writeToParcel(parcel, n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubredditRatingSurvey>
    {
        public final SubredditRatingSurvey createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final SubredditRatingSurveyQuestion subredditRatingSurveyQuestion = (SubredditRatingSurveyQuestion)SubredditRatingSurveyQuestion.CREATOR.createFromParcel(parcel);
            final boolean b = parcel.readInt() != 0;
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = SubredditRatingSurveyResponse.CREATOR.createFromParcel(parcel);
            }
            return new SubredditRatingSurvey(string, subredditRatingSurveyQuestion, b, (SubredditRatingSurveyResponse)fromParcel);
        }
        
        public final SubredditRatingSurvey[] newArray(final int n) {
            return new SubredditRatingSurvey[n];
        }
    }
}
