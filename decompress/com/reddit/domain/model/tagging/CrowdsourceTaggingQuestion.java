// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import a2.b;
import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\u0011\u001a\u00020\t\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b/\u00100J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JM\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u00022\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\u0011\u001a\u00020\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.¨\u00061" }, d2 = { "Lcom/reddit/domain/model/tagging/CrowdsourceTaggingQuestion;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "Lcom/reddit/domain/model/tagging/CrowdsourceTaggingAnswer;", "component4", "Lcom/reddit/domain/model/tagging/CrowdsourceTaggingQuestionType;", "component5", "Lcom/reddit/domain/model/tagging/QuestionAnalyticsData;", "component6", "id", "subredditName", "text", "answers", "type", "analyticsData", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getSubredditName", "getText", "Ljava/util/List;", "getAnswers", "()Ljava/util/List;", "Lcom/reddit/domain/model/tagging/CrowdsourceTaggingQuestionType;", "getType", "()Lcom/reddit/domain/model/tagging/CrowdsourceTaggingQuestionType;", "Lcom/reddit/domain/model/tagging/QuestionAnalyticsData;", "getAnalyticsData", "()Lcom/reddit/domain/model/tagging/QuestionAnalyticsData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/reddit/domain/model/tagging/CrowdsourceTaggingQuestionType;Lcom/reddit/domain/model/tagging/QuestionAnalyticsData;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class CrowdsourceTaggingQuestion implements Parcelable
{
    public static final Parcelable$Creator<CrowdsourceTaggingQuestion> CREATOR;
    private final QuestionAnalyticsData analyticsData;
    private final List<CrowdsourceTaggingAnswer> answers;
    private final String id;
    private final String subredditName;
    private final String text;
    private final CrowdsourceTaggingQuestionType type;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public CrowdsourceTaggingQuestion(@n(name = "id") final String id, @n(name = "subreddit_name") final String subredditName, @n(name = "text") final String text, @n(name = "answers") final List<CrowdsourceTaggingAnswer> answers, @n(name = "type") final CrowdsourceTaggingQuestionType type, @n(name = "analytics_data") final QuestionAnalyticsData analyticsData) {
        f.f((Object)id, "id");
        f.f((Object)subredditName, "subredditName");
        f.f((Object)text, "text");
        f.f((Object)answers, "answers");
        f.f((Object)type, "type");
        this.id = id;
        this.subredditName = subredditName;
        this.text = text;
        this.answers = answers;
        this.type = type;
        this.analyticsData = analyticsData;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.subredditName;
    }
    
    public final String component3() {
        return this.text;
    }
    
    public final List<CrowdsourceTaggingAnswer> component4() {
        return this.answers;
    }
    
    public final CrowdsourceTaggingQuestionType component5() {
        return this.type;
    }
    
    public final QuestionAnalyticsData component6() {
        return this.analyticsData;
    }
    
    public final CrowdsourceTaggingQuestion copy(@n(name = "id") final String s, @n(name = "subreddit_name") final String s2, @n(name = "text") final String s3, @n(name = "answers") final List<CrowdsourceTaggingAnswer> list, @n(name = "type") final CrowdsourceTaggingQuestionType crowdsourceTaggingQuestionType, @n(name = "analytics_data") final QuestionAnalyticsData questionAnalyticsData) {
        f.f((Object)s, "id");
        f.f((Object)s2, "subredditName");
        f.f((Object)s3, "text");
        f.f((Object)list, "answers");
        f.f((Object)crowdsourceTaggingQuestionType, "type");
        return new CrowdsourceTaggingQuestion(s, s2, s3, list, crowdsourceTaggingQuestionType, questionAnalyticsData);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrowdsourceTaggingQuestion)) {
            return false;
        }
        final CrowdsourceTaggingQuestion crowdsourceTaggingQuestion = (CrowdsourceTaggingQuestion)o;
        return f.a((Object)this.id, (Object)crowdsourceTaggingQuestion.id) && f.a((Object)this.subredditName, (Object)crowdsourceTaggingQuestion.subredditName) && f.a((Object)this.text, (Object)crowdsourceTaggingQuestion.text) && f.a((Object)this.answers, (Object)crowdsourceTaggingQuestion.answers) && this.type == crowdsourceTaggingQuestion.type && f.a((Object)this.analyticsData, (Object)crowdsourceTaggingQuestion.analyticsData);
    }
    
    public final QuestionAnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }
    
    public final List<CrowdsourceTaggingAnswer> getAnswers() {
        return this.answers;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getSubredditName() {
        return this.subredditName;
    }
    
    public final String getText() {
        return this.text;
    }
    
    public final CrowdsourceTaggingQuestionType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final int a = b.a((List)this.answers, ag0.a.f(this.text, ag0.a.f(this.subredditName, this.id.hashCode() * 31, 31), 31), 31);
        final int hashCode = this.type.hashCode();
        final QuestionAnalyticsData analyticsData = this.analyticsData;
        int hashCode2;
        if (analyticsData == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = analyticsData.hashCode();
        }
        return (hashCode + a) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CrowdsourceTaggingQuestion(id=");
        k.append(this.id);
        k.append(", subredditName=");
        k.append(this.subredditName);
        k.append(", text=");
        k.append(this.text);
        k.append(", answers=");
        k.append(this.answers);
        k.append(", type=");
        k.append(this.type);
        k.append(", analyticsData=");
        k.append(this.analyticsData);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.subredditName);
        parcel.writeString(this.text);
        final Iterator n2 = b.n((List)this.answers, parcel);
        while (n2.hasNext()) {
            ((CrowdsourceTaggingAnswer)n2.next()).writeToParcel(parcel, n);
        }
        parcel.writeString(this.type.name());
        final QuestionAnalyticsData analyticsData = this.analyticsData;
        if (analyticsData == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            analyticsData.writeToParcel(parcel, n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<CrowdsourceTaggingQuestion>
    {
        public final CrowdsourceTaggingQuestion createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = a.c((Parcelable$Creator)CrowdsourceTaggingAnswer.CREATOR, parcel, list, i, 1)) {}
            final CrowdsourceTaggingQuestionType value = CrowdsourceTaggingQuestionType.valueOf(parcel.readString());
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = QuestionAnalyticsData.CREATOR.createFromParcel(parcel);
            }
            return new CrowdsourceTaggingQuestion(string, string2, string3, (List<CrowdsourceTaggingAnswer>)list, value, (QuestionAnalyticsData)fromParcel);
        }
        
        public final CrowdsourceTaggingQuestion[] newArray(final int n) {
            return new CrowdsourceTaggingQuestion[n];
        }
    }
}
