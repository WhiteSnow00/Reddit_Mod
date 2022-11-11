// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/search/TopicJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/search/Topic;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "booleanAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class TopicJsonAdapter extends JsonAdapter<Topic>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Topic> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public TopicJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "banner_img", "description", "is_subscribed", "is_live", "follower_count", "category_id", "category_name" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "bannerImg");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "description");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isSubscribed");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "followerCount");
    }
    
    public Topic fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Integer value = 0;
        Boolean b = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 6: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        n &= 0xFFFFFFBF;
                        continue;
                    }
                    throw a.n("categoryName", "category_name", jsonReader);
                }
                case 5: {
                    o3 = this.stringAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        n &= 0xFFFFFFDF;
                        continue;
                    }
                    throw a.n("categoryId", "category_id", jsonReader);
                }
                case 4: {
                    value = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (value != null) {
                        n &= 0xFFFFFFEF;
                        continue;
                    }
                    throw a.n("followerCount", "follower_count", jsonReader);
                }
                case 3: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        n &= 0xFFFFFFF7;
                        continue;
                    }
                    throw a.n("isLive", "is_live", jsonReader);
                }
                case 2: {
                    false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (false != null) {
                        n &= 0xFFFFFFFB;
                        continue;
                    }
                    throw a.n("isSubscribed", "is_subscribed", jsonReader);
                }
                case 1: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        n &= 0xFFFFFFFD;
                        continue;
                    }
                    throw a.n("description", "description", jsonReader);
                }
                case 0: {
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
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
        if (n == -127) {
            f.d(o, "null cannot be cast to non-null type kotlin.String");
            final boolean booleanValue = false;
            final boolean booleanValue2 = b;
            final int intValue = value;
            f.d(o3, "null cannot be cast to non-null type kotlin.String");
            f.d(o2, "null cannot be cast to non-null type kotlin.String");
            return new Topic(s, (String)o, booleanValue, booleanValue2, intValue, (String)o3, (String)o2);
        }
        Constructor<Topic> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            final Class<Boolean> type = Boolean.TYPE;
            final Class<Integer> type2 = Integer.TYPE;
            constructorRef = Topic.class.getDeclaredConstructor(String.class, String.class, type, type, type2, String.class, String.class, type2, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "Topic::class.java.getDec\u2026his.constructorRef = it }");
        }
        final Topic instance = constructorRef.newInstance(s, o, false, b, value, o3, o2, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final Topic topic) {
        f.f((Object)x, "writer");
        if (topic != null) {
            x.h();
            x.w("banner_img");
            this.nullableStringAdapter.toJson(x, (Object)topic.getBannerImg());
            x.w("description");
            this.stringAdapter.toJson(x, (Object)topic.getDescription());
            x.w("is_subscribed");
            this.booleanAdapter.toJson(x, (Object)topic.isSubscribed());
            x.w("is_live");
            this.booleanAdapter.toJson(x, (Object)topic.isLive());
            x.w("follower_count");
            this.intAdapter.toJson(x, (Object)topic.getFollowerCount());
            x.w("category_id");
            this.stringAdapter.toJson(x, (Object)topic.getCategoryId());
            x.w("category_name");
            this.stringAdapter.toJson(x, (Object)topic.getCategoryName());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Topic)";
    }
}
