// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.listing;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.RichTextResponse;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u000b\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b>\u0010?J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00c6\u0003J\u0087\u0001\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0013\u001a\u00020\u00042\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0018\u001a\u00020\u000b2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u001c\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001J\t\u0010 \u001a\u00020\u001fH\u00d6\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010$\u001a\u00020\u001fH\u00d6\u0001J\u0019\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001fH\u00d6\u0001R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b3\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b4\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b5\u00102R\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b9\u00102R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b:\u00102R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\b\u001c\u00108¨\u0006@" }, d2 = { "Lcom/reddit/domain/model/listing/RecommendationContext;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/RichTextResponse;", "component1", "Lcom/reddit/domain/model/listing/RecommendationType;", "component2", "", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "Lcom/reddit/domain/model/listing/RecommendedDiscoverTopic;", "component10", "component11", "richtext", "type", "source", "sourceSubredditId", "sourceSubredditName", "topicId", "recommendationPreferenceEnabled", "sourceTopicName", "html", "discoverTopic", "isContextHidden", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/domain/model/RichTextResponse;", "getRichtext", "()Lcom/reddit/domain/model/RichTextResponse;", "Lcom/reddit/domain/model/listing/RecommendationType;", "getType", "()Lcom/reddit/domain/model/listing/RecommendationType;", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "getSourceSubredditId", "getSourceSubredditName", "getTopicId", "Z", "getRecommendationPreferenceEnabled", "()Z", "getSourceTopicName", "getHtml", "Lcom/reddit/domain/model/listing/RecommendedDiscoverTopic;", "getDiscoverTopic", "()Lcom/reddit/domain/model/listing/RecommendedDiscoverTopic;", "<init>", "(Lcom/reddit/domain/model/RichTextResponse;Lcom/reddit/domain/model/listing/RecommendationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/listing/RecommendedDiscoverTopic;Z)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RecommendationContext implements Parcelable
{
    public static final Parcelable$Creator<RecommendationContext> CREATOR;
    private final RecommendedDiscoverTopic discoverTopic;
    private final String html;
    private final boolean isContextHidden;
    private final boolean recommendationPreferenceEnabled;
    private final RichTextResponse richtext;
    private final String source;
    private final String sourceSubredditId;
    private final String sourceSubredditName;
    private final String sourceTopicName;
    private final String topicId;
    private final RecommendationType type;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public RecommendationContext() {
        this(null, null, null, null, null, null, false, null, null, null, false, 2047, null);
    }
    
    public RecommendationContext(@n(name = "richtext") final RichTextResponse richtext, @n(name = "recommendation_type") final RecommendationType type, @n(name = "source") final String source, @n(name = "source_subreddit_id") final String sourceSubredditId, @n(name = "source_subreddit_name") final String sourceSubredditName, @n(name = "topic_id") final String topicId, @n(name = "recommendations_enabled") final boolean recommendationPreferenceEnabled, @n(name = "source_topic_name") final String sourceTopicName, @n(name = "html") final String html, @n(name = "discover_topic") final RecommendedDiscoverTopic discoverTopic, @n(name = "is_context_hidden") final boolean isContextHidden) {
        f.f((Object)type, "type");
        this.richtext = richtext;
        this.type = type;
        this.source = source;
        this.sourceSubredditId = sourceSubredditId;
        this.sourceSubredditName = sourceSubredditName;
        this.topicId = topicId;
        this.recommendationPreferenceEnabled = recommendationPreferenceEnabled;
        this.sourceTopicName = sourceTopicName;
        this.html = html;
        this.discoverTopic = discoverTopic;
        this.isContextHidden = isContextHidden;
    }
    
    public final RichTextResponse component1() {
        return this.richtext;
    }
    
    public final RecommendedDiscoverTopic component10() {
        return this.discoverTopic;
    }
    
    public final boolean component11() {
        return this.isContextHidden;
    }
    
    public final RecommendationType component2() {
        return this.type;
    }
    
    public final String component3() {
        return this.source;
    }
    
    public final String component4() {
        return this.sourceSubredditId;
    }
    
    public final String component5() {
        return this.sourceSubredditName;
    }
    
    public final String component6() {
        return this.topicId;
    }
    
    public final boolean component7() {
        return this.recommendationPreferenceEnabled;
    }
    
    public final String component8() {
        return this.sourceTopicName;
    }
    
    public final String component9() {
        return this.html;
    }
    
    public final RecommendationContext copy(@n(name = "richtext") final RichTextResponse richTextResponse, @n(name = "recommendation_type") final RecommendationType recommendationType, @n(name = "source") final String s, @n(name = "source_subreddit_id") final String s2, @n(name = "source_subreddit_name") final String s3, @n(name = "topic_id") final String s4, @n(name = "recommendations_enabled") final boolean b, @n(name = "source_topic_name") final String s5, @n(name = "html") final String s6, @n(name = "discover_topic") final RecommendedDiscoverTopic recommendedDiscoverTopic, @n(name = "is_context_hidden") final boolean b2) {
        f.f((Object)recommendationType, "type");
        return new RecommendationContext(richTextResponse, recommendationType, s, s2, s3, s4, b, s5, s6, recommendedDiscoverTopic, b2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendationContext)) {
            return false;
        }
        final RecommendationContext recommendationContext = (RecommendationContext)o;
        return f.a((Object)this.richtext, (Object)recommendationContext.richtext) && this.type == recommendationContext.type && f.a((Object)this.source, (Object)recommendationContext.source) && f.a((Object)this.sourceSubredditId, (Object)recommendationContext.sourceSubredditId) && f.a((Object)this.sourceSubredditName, (Object)recommendationContext.sourceSubredditName) && f.a((Object)this.topicId, (Object)recommendationContext.topicId) && this.recommendationPreferenceEnabled == recommendationContext.recommendationPreferenceEnabled && f.a((Object)this.sourceTopicName, (Object)recommendationContext.sourceTopicName) && f.a((Object)this.html, (Object)recommendationContext.html) && f.a((Object)this.discoverTopic, (Object)recommendationContext.discoverTopic) && this.isContextHidden == recommendationContext.isContextHidden;
    }
    
    public final RecommendedDiscoverTopic getDiscoverTopic() {
        return this.discoverTopic;
    }
    
    public final String getHtml() {
        return this.html;
    }
    
    public final boolean getRecommendationPreferenceEnabled() {
        return this.recommendationPreferenceEnabled;
    }
    
    public final RichTextResponse getRichtext() {
        return this.richtext;
    }
    
    public final String getSource() {
        return this.source;
    }
    
    public final String getSourceSubredditId() {
        return this.sourceSubredditId;
    }
    
    public final String getSourceSubredditName() {
        return this.sourceSubredditName;
    }
    
    public final String getSourceTopicName() {
        return this.sourceTopicName;
    }
    
    public final String getTopicId() {
        return this.topicId;
    }
    
    public final RecommendationType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final RichTextResponse richtext = this.richtext;
        int hashCode = 0;
        int hashCode2;
        if (richtext == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = richtext.hashCode();
        }
        final int hashCode3 = this.type.hashCode();
        final String source = this.source;
        int hashCode4;
        if (source == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = source.hashCode();
        }
        final String sourceSubredditId = this.sourceSubredditId;
        int hashCode5;
        if (sourceSubredditId == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = sourceSubredditId.hashCode();
        }
        final String sourceSubredditName = this.sourceSubredditName;
        int hashCode6;
        if (sourceSubredditName == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = sourceSubredditName.hashCode();
        }
        final String topicId = this.topicId;
        int hashCode7;
        if (topicId == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = topicId.hashCode();
        }
        final int recommendationPreferenceEnabled = this.recommendationPreferenceEnabled ? 1 : 0;
        int n = 1;
        int n2 = recommendationPreferenceEnabled;
        if (recommendationPreferenceEnabled != 0) {
            n2 = 1;
        }
        final String sourceTopicName = this.sourceTopicName;
        int hashCode8;
        if (sourceTopicName == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = sourceTopicName.hashCode();
        }
        final String html = this.html;
        int hashCode9;
        if (html == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = html.hashCode();
        }
        final RecommendedDiscoverTopic discoverTopic = this.discoverTopic;
        if (discoverTopic != null) {
            hashCode = discoverTopic.hashCode();
        }
        final int isContextHidden = this.isContextHidden ? 1 : 0;
        if (isContextHidden == 0) {
            n = isContextHidden;
        }
        return (((((((((hashCode3 + hashCode2 * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + n2) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode) * 31 + n;
    }
    
    public final boolean isContextHidden() {
        return this.isContextHidden;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("RecommendationContext(richtext=");
        k.append(this.richtext);
        k.append(", type=");
        k.append(this.type);
        k.append(", source=");
        k.append(this.source);
        k.append(", sourceSubredditId=");
        k.append(this.sourceSubredditId);
        k.append(", sourceSubredditName=");
        k.append(this.sourceSubredditName);
        k.append(", topicId=");
        k.append(this.topicId);
        k.append(", recommendationPreferenceEnabled=");
        k.append(this.recommendationPreferenceEnabled);
        k.append(", sourceTopicName=");
        k.append(this.sourceTopicName);
        k.append(", html=");
        k.append(this.html);
        k.append(", discoverTopic=");
        k.append(this.discoverTopic);
        k.append(", isContextHidden=");
        return s0.o(k, this.isContextHidden, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        final RichTextResponse richtext = this.richtext;
        if (richtext == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            richtext.writeToParcel(parcel, n);
        }
        parcel.writeString(this.type.name());
        parcel.writeString(this.source);
        parcel.writeString(this.sourceSubredditId);
        parcel.writeString(this.sourceSubredditName);
        parcel.writeString(this.topicId);
        parcel.writeInt((int)(this.recommendationPreferenceEnabled ? 1 : 0));
        parcel.writeString(this.sourceTopicName);
        parcel.writeString(this.html);
        final RecommendedDiscoverTopic discoverTopic = this.discoverTopic;
        if (discoverTopic == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            discoverTopic.writeToParcel(parcel, n);
        }
        parcel.writeInt((int)(this.isContextHidden ? 1 : 0));
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<RecommendationContext>
    {
        public final RecommendationContext createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final RecommendedDiscoverTopic recommendedDiscoverTopic = null;
            Object fromParcel;
            if (int1 == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = RichTextResponse.CREATOR.createFromParcel(parcel);
            }
            final RichTextResponse richTextResponse = (RichTextResponse)fromParcel;
            final RecommendationType value = RecommendationType.valueOf(parcel.readString());
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final boolean b = parcel.readInt() != 0;
            final String string5 = parcel.readString();
            final String string6 = parcel.readString();
            Object fromParcel2;
            if (parcel.readInt() == 0) {
                fromParcel2 = recommendedDiscoverTopic;
            }
            else {
                fromParcel2 = RecommendedDiscoverTopic.CREATOR.createFromParcel(parcel);
            }
            return new RecommendationContext(richTextResponse, value, string, string2, string3, string4, b, string5, string6, (RecommendedDiscoverTopic)fromParcel2, parcel.readInt() != 0);
        }
        
        public final RecommendationContext[] newArray(final int n) {
            return new RecommendationContext[n];
        }
    }
}
