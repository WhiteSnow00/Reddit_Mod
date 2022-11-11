// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import al0.f0;
import sg2.e;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0002H\u00c6\u0003JA\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b%\u0010\u001f¨\u0006(" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyQuestion;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer;", "component3", "component4", "component5", "id", "questionMarkdown", "answerOptions", "analyticsNoun", "analyticsPageType", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getQuestionMarkdown", "Ljava/util/List;", "getAnswerOptions", "()Ljava/util/List;", "getAnalyticsNoun", "getAnalyticsPageType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditRatingSurveyQuestion implements Parcelable
{
    public static final Parcelable$Creator<SubredditRatingSurveyQuestion> CREATOR;
    private final String analyticsNoun;
    private final String analyticsPageType;
    private final List<SubredditRatingSurveyAnswer> answerOptions;
    private final String id;
    private final String questionMarkdown;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubredditRatingSurveyQuestion(final String id, final String questionMarkdown, final List<? extends SubredditRatingSurveyAnswer> answerOptions, final String analyticsNoun, final String analyticsPageType) {
        e.f((Object)id, "id");
        e.f((Object)questionMarkdown, "questionMarkdown");
        e.f((Object)answerOptions, "answerOptions");
        e.f((Object)analyticsNoun, "analyticsNoun");
        e.f((Object)analyticsPageType, "analyticsPageType");
        this.id = id;
        this.questionMarkdown = questionMarkdown;
        this.answerOptions = (List<SubredditRatingSurveyAnswer>)answerOptions;
        this.analyticsNoun = analyticsNoun;
        this.analyticsPageType = analyticsPageType;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.questionMarkdown;
    }
    
    public final List<SubredditRatingSurveyAnswer> component3() {
        return this.answerOptions;
    }
    
    public final String component4() {
        return this.analyticsNoun;
    }
    
    public final String component5() {
        return this.analyticsPageType;
    }
    
    public final SubredditRatingSurveyQuestion copy(final String s, final String s2, final List<? extends SubredditRatingSurveyAnswer> list, final String s3, final String s4) {
        e.f((Object)s, "id");
        e.f((Object)s2, "questionMarkdown");
        e.f((Object)list, "answerOptions");
        e.f((Object)s3, "analyticsNoun");
        e.f((Object)s4, "analyticsPageType");
        return new SubredditRatingSurveyQuestion(s, s2, list, s3, s4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditRatingSurveyQuestion)) {
            return false;
        }
        final SubredditRatingSurveyQuestion subredditRatingSurveyQuestion = (SubredditRatingSurveyQuestion)o;
        return e.a((Object)this.id, (Object)subredditRatingSurveyQuestion.id) && e.a((Object)this.questionMarkdown, (Object)subredditRatingSurveyQuestion.questionMarkdown) && e.a((Object)this.answerOptions, (Object)subredditRatingSurveyQuestion.answerOptions) && e.a((Object)this.analyticsNoun, (Object)subredditRatingSurveyQuestion.analyticsNoun) && e.a((Object)this.analyticsPageType, (Object)subredditRatingSurveyQuestion.analyticsPageType);
    }
    
    public final String getAnalyticsNoun() {
        return this.analyticsNoun;
    }
    
    public final String getAnalyticsPageType() {
        return this.analyticsPageType;
    }
    
    public final List<SubredditRatingSurveyAnswer> getAnswerOptions() {
        return this.answerOptions;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getQuestionMarkdown() {
        return this.questionMarkdown;
    }
    
    @Override
    public int hashCode() {
        return this.analyticsPageType.hashCode() + b.c(this.analyticsNoun, aw.b.c((List)this.answerOptions, b.c(this.questionMarkdown, this.id.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubredditRatingSurveyQuestion(id=");
        r.append(this.id);
        r.append(", questionMarkdown=");
        r.append(this.questionMarkdown);
        r.append(", answerOptions=");
        r.append(this.answerOptions);
        r.append(", analyticsNoun=");
        r.append(this.analyticsNoun);
        r.append(", analyticsPageType=");
        return f0.n(r, this.analyticsPageType, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.questionMarkdown);
        final Iterator s = al0.a.s((List)this.answerOptions, parcel);
        while (s.hasNext()) {
            parcel.writeParcelable((Parcelable)s.next(), n);
        }
        parcel.writeString(this.analyticsNoun);
        parcel.writeString(this.analyticsPageType);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubredditRatingSurveyQuestion>
    {
        public final SubredditRatingSurveyQuestion createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = wu.a.a((Class)SubredditRatingSurveyQuestion.class, parcel, list, i, 1)) {}
            return new SubredditRatingSurveyQuestion(string, string2, (List<? extends SubredditRatingSurveyAnswer>)list, parcel.readString(), parcel.readString());
        }
        
        public final SubredditRatingSurveyQuestion[] newArray(final int n) {
            return new SubredditRatingSurveyQuestion[n];
        }
    }
}
