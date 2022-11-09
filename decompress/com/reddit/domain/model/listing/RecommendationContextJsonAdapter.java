// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.listing;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.model.RichTextResponse;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!" }, d2 = { "Lcom/reddit/domain/model/listing/RecommendationContextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/listing/RecommendationContext;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/model/RichTextResponse;", "nullableRichTextResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/listing/RecommendationType;", "recommendationTypeAdapter", "nullableStringAdapter", "", "booleanAdapter", "Lcom/reddit/domain/model/listing/RecommendedDiscoverTopic;", "nullableRecommendedDiscoverTopicAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RecommendationContextJsonAdapter extends JsonAdapter<RecommendationContext>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<RecommendationContext> constructorRef;
    private final JsonAdapter<RecommendedDiscoverTopic> nullableRecommendedDiscoverTopicAdapter;
    private final JsonAdapter<RichTextResponse> nullableRichTextResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<RecommendationType> recommendationTypeAdapter;
    
    public RecommendationContextJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "richtext", "recommendation_type", "source", "source_subreddit_id", "source_subreddit_name", "topic_id", "recommendations_enabled", "source_topic_name", "html", "discover_topic", "is_context_hidden" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableRichTextResponseAdapter = (JsonAdapter<RichTextResponse>)y.c((Type)RichTextResponse.class, (Set)instance, "richtext");
        this.recommendationTypeAdapter = (JsonAdapter<RecommendationType>)y.c((Type)RecommendationType.class, (Set)instance, "type");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "source");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "recommendationPreferenceEnabled");
        this.nullableRecommendedDiscoverTopicAdapter = (JsonAdapter<RecommendedDiscoverTopic>)y.c((Type)RecommendedDiscoverTopic.class, (Set)instance, "discoverTopic");
    }
    
    public RecommendationContext fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        int n = -1;
        RichTextResponse richTextResponse = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        Boolean b = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 10: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        n &= 0xFFFFFBFF;
                        continue;
                    }
                    throw a.n("isContextHidden", "is_context_hidden", jsonReader);
                }
                case 9: {
                    o8 = this.nullableRecommendedDiscoverTopicAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFDFF;
                    continue;
                }
                case 8: {
                    o7 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFEFF;
                    continue;
                }
                case 7: {
                    o6 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFF7F;
                    continue;
                }
                case 6: {
                    false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (false != null) {
                        n &= 0xFFFFFFBF;
                        continue;
                    }
                    throw a.n("recommendationPreferenceEnabled", "recommendations_enabled", jsonReader);
                }
                case 5: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFF7;
                    continue;
                }
                case 2: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o = this.recommendationTypeAdapter.fromJson(jsonReader);
                    if (o != null) {
                        n &= 0xFFFFFFFD;
                        continue;
                    }
                    throw a.n("type", "recommendation_type", jsonReader);
                }
                case 0: {
                    richTextResponse = (RichTextResponse)this.nullableRichTextResponseAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFE;
                    continue;
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -2048) {
            f.d(o, "null cannot be cast to non-null type com.reddit.domain.model.listing.RecommendationType");
            return new RecommendationContext(richTextResponse, (RecommendationType)o, (String)o2, (String)o3, (String)o4, (String)o5, false, (String)o6, (String)o7, (RecommendedDiscoverTopic)o8, b);
        }
        Constructor<RecommendationContext> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            final Class<Boolean> type = Boolean.TYPE;
            constructorRef = RecommendationContext.class.getDeclaredConstructor(RichTextResponse.class, RecommendationType.class, String.class, String.class, String.class, String.class, type, String.class, String.class, RecommendedDiscoverTopic.class, type, Integer.TYPE, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "RecommendationContext::c\u2026his.constructorRef = it }");
        }
        final RecommendationContext instance = constructorRef.newInstance(richTextResponse, o, o2, o3, o4, o5, false, o6, o7, o8, b, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final RecommendationContext recommendationContext) {
        f.f((Object)x, "writer");
        if (recommendationContext != null) {
            x.h();
            x.w("richtext");
            this.nullableRichTextResponseAdapter.toJson(x, (Object)recommendationContext.getRichtext());
            x.w("recommendation_type");
            this.recommendationTypeAdapter.toJson(x, (Object)recommendationContext.getType());
            x.w("source");
            this.nullableStringAdapter.toJson(x, (Object)recommendationContext.getSource());
            x.w("source_subreddit_id");
            this.nullableStringAdapter.toJson(x, (Object)recommendationContext.getSourceSubredditId());
            x.w("source_subreddit_name");
            this.nullableStringAdapter.toJson(x, (Object)recommendationContext.getSourceSubredditName());
            x.w("topic_id");
            this.nullableStringAdapter.toJson(x, (Object)recommendationContext.getTopicId());
            x.w("recommendations_enabled");
            this.booleanAdapter.toJson(x, (Object)recommendationContext.getRecommendationPreferenceEnabled());
            x.w("source_topic_name");
            this.nullableStringAdapter.toJson(x, (Object)recommendationContext.getSourceTopicName());
            x.w("html");
            this.nullableStringAdapter.toJson(x, (Object)recommendationContext.getHtml());
            x.w("discover_topic");
            this.nullableRecommendedDiscoverTopicAdapter.toJson(x, (Object)recommendationContext.getDiscoverTopic());
            x.w("is_context_hidden");
            this.booleanAdapter.toJson(x, (Object)recommendationContext.isContextHidden());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(RecommendationContext)";
    }
}
