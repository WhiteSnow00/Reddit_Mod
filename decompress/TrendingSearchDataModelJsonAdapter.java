// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.search;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.data.model.Envelope;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 " }, d2 = { "Lcom/reddit/data/model/search/TrendingSearchDataModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/model/search/TrendingSearchDataModel;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lcom/reddit/data/model/Envelope;", "Lcom/reddit/data/model/search/TrendingSearchResultDataModel;", "nullableEnvelopeOfTrendingSearchResultDataModelAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data-remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class TrendingSearchDataModelJsonAdapter extends JsonAdapter<TrendingSearchDataModel>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TrendingSearchDataModel> constructorRef;
    private final JsonAdapter<Envelope<TrendingSearchResultDataModel>> nullableEnvelopeOfTrendingSearchResultDataModelAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public TrendingSearchDataModelJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "query_string", "display_string", "subreddit_occurences", "subreddit_occurrences", "results", "is_subreddit_whitelisted" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "queryText");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "backupSubredditOccurences");
        this.nullableEnvelopeOfTrendingSearchResultDataModelAdapter = (JsonAdapter<Envelope<TrendingSearchResultDataModel>>)y.c((Type)a0.d((Class)Envelope.class, new Type[] { TrendingSearchResultDataModel.class }), (Set)instance, "results");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "subredditWhiteListed");
    }
    
    public TrendingSearchDataModel fromJson(final JsonReader jsonReader) {
        final Class<Integer> clazz = Integer.class;
        final Class<String> clazz2 = String.class;
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Boolean b = null;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("subredditWhiteListed", "is_subreddit_whitelisted", jsonReader);
                }
                case 4: {
                    o4 = this.nullableEnvelopeOfTrendingSearchResultDataModelAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o3 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFF7;
                    continue;
                }
                case 2: {
                    o2 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("displayText", "display_string", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("queryText", "query_string", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -29) {
            if (s == null) {
                throw a.h("queryText", "query_string", jsonReader);
            }
            if (o == null) {
                throw a.h("displayText", "display_string", jsonReader);
            }
            if (b != null) {
                return new TrendingSearchDataModel(s, (String)o, (Integer)o2, (Integer)o3, (Envelope)o4, (boolean)b);
            }
            throw a.h("subredditWhiteListed", "is_subreddit_whitelisted", jsonReader);
        }
        else {
            final Constructor<TrendingSearchDataModel> constructorRef = this.constructorRef;
            Constructor<TrendingSearchDataModel> declaredConstructor;
            if (constructorRef == null) {
                declaredConstructor = TrendingSearchDataModel.class.getDeclaredConstructor(clazz2, clazz2, clazz, clazz, Envelope.class, Boolean.TYPE, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = declaredConstructor), "TrendingSearchDataModel:\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("queryText", "query_string", jsonReader);
            }
            if (o == null) {
                throw a.h("displayText", "display_string", jsonReader);
            }
            if (b != null) {
                final TrendingSearchDataModel instance = declaredConstructor.newInstance(s, o, o2, o3, o4, Boolean.valueOf(b), n, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("subredditWhiteListed", "is_subreddit_whitelisted", jsonReader);
        }
    }
    
    public void toJson(final x x, final TrendingSearchDataModel trendingSearchDataModel) {
        f.f((Object)x, "writer");
        if (trendingSearchDataModel != null) {
            x.h();
            x.w("query_string");
            this.stringAdapter.toJson(x, (Object)trendingSearchDataModel.getQueryText());
            x.w("display_string");
            this.stringAdapter.toJson(x, (Object)trendingSearchDataModel.getDisplayText());
            x.w("subreddit_occurences");
            this.nullableIntAdapter.toJson(x, (Object)trendingSearchDataModel.getBackupSubredditOccurences());
            x.w("subreddit_occurrences");
            this.nullableIntAdapter.toJson(x, (Object)trendingSearchDataModel.getSubredditOccurrences());
            x.w("results");
            this.nullableEnvelopeOfTrendingSearchResultDataModelAdapter.toJson(x, (Object)trendingSearchDataModel.getResults());
            x.w("is_subreddit_whitelisted");
            this.booleanAdapter.toJson(x, (Object)trendingSearchDataModel.getSubredditWhiteListed());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(TrendingSearchDataModel)";
    }
}
