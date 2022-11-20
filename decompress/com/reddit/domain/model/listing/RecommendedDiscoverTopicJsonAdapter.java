// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.listing;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.model.DiscoverTopic;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/listing/RecommendedDiscoverTopicJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/listing/RecommendedDiscoverTopic;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/model/DiscoverTopic;", "discoverTopicAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RecommendedDiscoverTopicJsonAdapter extends JsonAdapter<RecommendedDiscoverTopic>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<DiscoverTopic> discoverTopicAdapter;
    private final JsonReader$b options;
    
    public RecommendedDiscoverTopicJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "discover_topic", "is_funny" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.discoverTopicAdapter = (JsonAdapter<DiscoverTopic>)y.c((Type)DiscoverTopic.class, (Set)instance, "topic");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isFunny");
    }
    
    public RecommendedDiscoverTopic fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        DiscoverTopic discoverTopic = null;
        Boolean b = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("isFunny", "is_funny", jsonReader);
                }
                else {
                    discoverTopic = (DiscoverTopic)this.discoverTopicAdapter.fromJson(jsonReader);
                    if (discoverTopic != null) {
                        continue;
                    }
                    throw a.n("topic", "discover_topic", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (discoverTopic == null) {
            throw a.h("topic", "discover_topic", jsonReader);
        }
        if (b != null) {
            return new RecommendedDiscoverTopic(discoverTopic, (boolean)b);
        }
        throw a.h("isFunny", "is_funny", jsonReader);
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final RecommendedDiscoverTopic recommendedDiscoverTopic) {
        e.f((Object)x, "writer");
        if (recommendedDiscoverTopic != null) {
            x.h();
            x.v("discover_topic");
            this.discoverTopicAdapter.toJson(x, (Object)recommendedDiscoverTopic.getTopic());
            x.v("is_funny");
            this.booleanAdapter.toJson(x, (Object)recommendedDiscoverTopic.isFunny());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (RecommendedDiscoverTopic)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(RecommendedDiscoverTopic)";
    }
}
