// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import ak0.m;
import ah2.f;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer;", "Landroid/os/Parcelable;", "()V", "answerText", "", "getAnswerText", "()Ljava/lang/String;", "id", "getId", "isMutuallyExclusive", "", "()Z", "Branch", "Leaf", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer$Branch;", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer$Leaf;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class SubredditRatingSurveyAnswer implements Parcelable
{
    private SubredditRatingSurveyAnswer() {
    }
    
    public abstract String getAnswerText();
    
    public abstract String getId();
    
    public abstract boolean isMutuallyExclusive();
    
    @Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b%\u0010&J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J9\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b\r\u0010!R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$¨\u0006'" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer$Branch;", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyQuestion;", "component4", "id", "answerText", "isMutuallyExclusive", "subQuestions", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getAnswerText", "Z", "()Z", "Ljava/util/List;", "getSubQuestions", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Branch extends SubredditRatingSurveyAnswer
    {
        public static final Parcelable$Creator<Branch> CREATOR;
        private final String answerText;
        private final String id;
        private final boolean isMutuallyExclusive;
        private final List<SubredditRatingSurveyQuestion> subQuestions;
        
        static {
            CREATOR = (Parcelable$Creator)new Creator();
        }
        
        public Branch(final String id, final String answerText, final boolean isMutuallyExclusive, final List<SubredditRatingSurveyQuestion> subQuestions) {
            f.f((Object)id, "id");
            f.f((Object)answerText, "answerText");
            super(null);
            this.id = id;
            this.answerText = answerText;
            this.isMutuallyExclusive = isMutuallyExclusive;
            this.subQuestions = subQuestions;
        }
        
        public final String component1() {
            return this.getId();
        }
        
        public final String component2() {
            return this.getAnswerText();
        }
        
        public final boolean component3() {
            return this.isMutuallyExclusive();
        }
        
        public final List<SubredditRatingSurveyQuestion> component4() {
            return this.subQuestions;
        }
        
        public final Branch copy(final String s, final String s2, final boolean b, final List<SubredditRatingSurveyQuestion> list) {
            f.f((Object)s, "id");
            f.f((Object)s2, "answerText");
            return new Branch(s, s2, b, list);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Branch)) {
                return false;
            }
            final Branch branch = (Branch)o;
            return f.a((Object)this.getId(), (Object)branch.getId()) && f.a((Object)this.getAnswerText(), (Object)branch.getAnswerText()) && this.isMutuallyExclusive() == branch.isMutuallyExclusive() && f.a((Object)this.subQuestions, (Object)branch.subQuestions);
        }
        
        @Override
        public String getAnswerText() {
            return this.answerText;
        }
        
        @Override
        public String getId() {
            return this.id;
        }
        
        public final List<SubredditRatingSurveyQuestion> getSubQuestions() {
            return this.subQuestions;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.getId().hashCode();
            final int hashCode2 = this.getAnswerText().hashCode();
            int mutuallyExclusive;
            if ((mutuallyExclusive = (this.isMutuallyExclusive() ? 1 : 0)) != 0) {
                mutuallyExclusive = 1;
            }
            final List<SubredditRatingSurveyQuestion> subQuestions = this.subQuestions;
            int hashCode3;
            if (subQuestions == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = subQuestions.hashCode();
            }
            return ((hashCode2 + hashCode * 31) * 31 + mutuallyExclusive) * 31 + hashCode3;
        }
        
        @Override
        public boolean isMutuallyExclusive() {
            return this.isMutuallyExclusive;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("Branch(id=");
            k.append(this.getId());
            k.append(", answerText=");
            k.append(this.getAnswerText());
            k.append(", isMutuallyExclusive=");
            k.append(this.isMutuallyExclusive());
            k.append(", subQuestions=");
            return m.n(k, (List)this.subQuestions, ')');
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            f.f((Object)parcel, "out");
            parcel.writeString(this.id);
            parcel.writeString(this.answerText);
            parcel.writeInt((int)(this.isMutuallyExclusive ? 1 : 0));
            final List<SubredditRatingSurveyQuestion> subQuestions = this.subQuestions;
            if (subQuestions == null) {
                parcel.writeInt(0);
            }
            else {
                final Iterator o = b.o(parcel, 1, (List)subQuestions);
                while (o.hasNext()) {
                    ((SubredditRatingSurveyQuestion)o.next()).writeToParcel(parcel, n);
                }
            }
        }
        
        @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
        public static final class Creator implements Parcelable$Creator<Branch>
        {
            public final Branch createFromParcel(final Parcel parcel) {
                f.f((Object)parcel, "parcel");
                final String string = parcel.readString();
                final String string2 = parcel.readString();
                final int int1 = parcel.readInt();
                int i = 0;
                final boolean b = int1 != 0;
                List<SubredditRatingSurveyQuestion> list;
                if (parcel.readInt() == 0) {
                    list = null;
                }
                else {
                    int int2;
                    ArrayList list2;
                    for (int2 = parcel.readInt(), list2 = new ArrayList(int2); i != int2; i = a.c((Parcelable$Creator)SubredditRatingSurveyQuestion.CREATOR, parcel, list2, i, 1)) {}
                    list = (List<SubredditRatingSurveyQuestion>)list2;
                }
                return new Branch(string, string2, b, list);
            }
            
            public final Branch[] newArray(final int n) {
                return new Branch[n];
            }
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\r\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&¨\u0006)" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer$Leaf;", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "component4", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;", "component5", "id", "answerText", "isMutuallyExclusive", "contentRatingReasonText", "ratingTag", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getAnswerText", "Z", "()Z", "getContentRatingReasonText", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;", "getRatingTag", "()Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/reddit/domain/model/tagging/SubredditRatingSurveyRatingTag;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Leaf extends SubredditRatingSurveyAnswer
    {
        public static final Parcelable$Creator<Leaf> CREATOR;
        private final String answerText;
        private final String contentRatingReasonText;
        private final String id;
        private final boolean isMutuallyExclusive;
        private final SubredditRatingSurveyRatingTag ratingTag;
        
        static {
            CREATOR = (Parcelable$Creator)new Creator();
        }
        
        public Leaf(final String id, final String answerText, final boolean isMutuallyExclusive, final String contentRatingReasonText, final SubredditRatingSurveyRatingTag ratingTag) {
            f.f((Object)id, "id");
            f.f((Object)answerText, "answerText");
            f.f((Object)contentRatingReasonText, "contentRatingReasonText");
            f.f((Object)ratingTag, "ratingTag");
            super(null);
            this.id = id;
            this.answerText = answerText;
            this.isMutuallyExclusive = isMutuallyExclusive;
            this.contentRatingReasonText = contentRatingReasonText;
            this.ratingTag = ratingTag;
        }
        
        public final String component1() {
            return this.getId();
        }
        
        public final String component2() {
            return this.getAnswerText();
        }
        
        public final boolean component3() {
            return this.isMutuallyExclusive();
        }
        
        public final String component4() {
            return this.contentRatingReasonText;
        }
        
        public final SubredditRatingSurveyRatingTag component5() {
            return this.ratingTag;
        }
        
        public final Leaf copy(final String s, final String s2, final boolean b, final String s3, final SubredditRatingSurveyRatingTag subredditRatingSurveyRatingTag) {
            f.f((Object)s, "id");
            f.f((Object)s2, "answerText");
            f.f((Object)s3, "contentRatingReasonText");
            f.f((Object)subredditRatingSurveyRatingTag, "ratingTag");
            return new Leaf(s, s2, b, s3, subredditRatingSurveyRatingTag);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Leaf)) {
                return false;
            }
            final Leaf leaf = (Leaf)o;
            return f.a((Object)this.getId(), (Object)leaf.getId()) && f.a((Object)this.getAnswerText(), (Object)leaf.getAnswerText()) && this.isMutuallyExclusive() == leaf.isMutuallyExclusive() && f.a((Object)this.contentRatingReasonText, (Object)leaf.contentRatingReasonText) && f.a((Object)this.ratingTag, (Object)leaf.ratingTag);
        }
        
        @Override
        public String getAnswerText() {
            return this.answerText;
        }
        
        public final String getContentRatingReasonText() {
            return this.contentRatingReasonText;
        }
        
        @Override
        public String getId() {
            return this.id;
        }
        
        public final SubredditRatingSurveyRatingTag getRatingTag() {
            return this.ratingTag;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.getId().hashCode();
            final int hashCode2 = this.getAnswerText().hashCode();
            int mutuallyExclusive;
            if ((mutuallyExclusive = (this.isMutuallyExclusive() ? 1 : 0)) != 0) {
                mutuallyExclusive = 1;
            }
            return this.ratingTag.hashCode() + ag0.a.f(this.contentRatingReasonText, ((hashCode2 + hashCode * 31) * 31 + mutuallyExclusive) * 31, 31);
        }
        
        @Override
        public boolean isMutuallyExclusive() {
            return this.isMutuallyExclusive;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("Leaf(id=");
            k.append(this.getId());
            k.append(", answerText=");
            k.append(this.getAnswerText());
            k.append(", isMutuallyExclusive=");
            k.append(this.isMutuallyExclusive());
            k.append(", contentRatingReasonText=");
            k.append(this.contentRatingReasonText);
            k.append(", ratingTag=");
            k.append(this.ratingTag);
            k.append(')');
            return k.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            f.f((Object)parcel, "out");
            parcel.writeString(this.id);
            parcel.writeString(this.answerText);
            parcel.writeInt((int)(this.isMutuallyExclusive ? 1 : 0));
            parcel.writeString(this.contentRatingReasonText);
            this.ratingTag.writeToParcel(parcel, n);
        }
        
        @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
        public static final class Creator implements Parcelable$Creator<Leaf>
        {
            public final Leaf createFromParcel(final Parcel parcel) {
                f.f((Object)parcel, "parcel");
                return new Leaf(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (SubredditRatingSurveyRatingTag)SubredditRatingSurveyRatingTag.CREATOR.createFromParcel(parcel));
            }
            
            public final Leaf[] newArray(final int n) {
                return new Leaf[n];
            }
        }
    }
}
