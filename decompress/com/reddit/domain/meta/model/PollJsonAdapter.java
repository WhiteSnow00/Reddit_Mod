// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.meta.model;

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
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\b¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/meta/model/PollJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/Poll;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/domain/meta/model/PollOption;", "listOfPollOptionAdapter", "Lcom/reddit/domain/meta/model/PollResults;", "pollResultsAdapter", "", "longAdapter", "", "booleanAdapter", "Lcom/reddit/domain/meta/model/PollType;", "pollTypeAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class PollJsonAdapter extends JsonAdapter<Poll>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<PollOption>> listOfPollOptionAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<PollResults> pollResultsAdapter;
    private final JsonAdapter<PollType> pollTypeAdapter;
    private final JsonAdapter<String> stringAdapter;
    
    public PollJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "postId", "subredditId", "options", "results", "endsAt", "pointsName", "isAlreadyVoted", "type" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.listOfPollOptionAdapter = (JsonAdapter<List<PollOption>>)y.c((Type)a0.d((Class)List.class, new Type[] { PollOption.class }), (Set)instance, "options");
        this.pollResultsAdapter = (JsonAdapter<PollResults>)y.c((Type)PollResults.class, (Set)instance, "results");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "endsAt");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isAlreadyVoted");
        this.pollTypeAdapter = (JsonAdapter<PollType>)y.c((Type)PollType.class, (Set)instance, "type");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        Object o6;
        Object o5 = o6 = o4;
        Object o8;
        Object o7 = o8 = o6;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 8: {
                    o8 = this.pollTypeAdapter.fromJson(jsonReader);
                    if (o8 != null) {
                        continue;
                    }
                    throw a.n("type", "type", jsonReader);
                }
                case 7: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("isAlreadyVoted", "isAlreadyVoted", jsonReader);
                }
                case 6: {
                    o7 = this.stringAdapter.fromJson(jsonReader);
                    if (o7 != null) {
                        continue;
                    }
                    throw a.n("pointsName", "pointsName", jsonReader);
                }
                case 5: {
                    o = this.longAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("endsAt", "endsAt", jsonReader);
                }
                case 4: {
                    o6 = this.pollResultsAdapter.fromJson(jsonReader);
                    if (o6 != null) {
                        continue;
                    }
                    throw a.n("results", "results", jsonReader);
                }
                case 3: {
                    o5 = this.listOfPollOptionAdapter.fromJson(jsonReader);
                    if (o5 != null) {
                        continue;
                    }
                    throw a.n("options_", "options", jsonReader);
                }
                case 2: {
                    o4 = this.stringAdapter.fromJson(jsonReader);
                    if (o4 != null) {
                        continue;
                    }
                    throw a.n("subredditId", "subredditId", jsonReader);
                }
                case 1: {
                    o3 = this.stringAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        continue;
                    }
                    throw a.n("postId", "postId", jsonReader);
                }
                case 0: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (o2 == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (o3 == null) {
            throw a.h("postId", "postId", jsonReader);
        }
        if (o4 == null) {
            throw a.h("subredditId", "subredditId", jsonReader);
        }
        if (o5 == null) {
            throw a.h("options_", "options", jsonReader);
        }
        if (o6 == null) {
            throw a.h("results", "results", jsonReader);
        }
        if (o == null) {
            throw a.h("endsAt", "endsAt", jsonReader);
        }
        final long longValue = (long)o;
        if (o7 == null) {
            throw a.h("pointsName", "pointsName", jsonReader);
        }
        if (b == null) {
            throw a.h("isAlreadyVoted", "isAlreadyVoted", jsonReader);
        }
        final boolean booleanValue = b;
        if (o8 != null) {
            return new Poll((String)o2, (String)o3, (String)o4, (List)o5, (PollResults)o6, longValue, (String)o7, booleanValue, (PollType)o8);
        }
        throw a.h("type", "type", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final Poll poll = (Poll)o;
        f.f((Object)x, "writer");
        if (poll != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)poll.f);
            x.w("postId");
            this.stringAdapter.toJson(x, (Object)poll.g);
            x.w("subredditId");
            this.stringAdapter.toJson(x, (Object)poll.h);
            x.w("options");
            this.listOfPollOptionAdapter.toJson(x, (Object)poll.i);
            x.w("results");
            this.pollResultsAdapter.toJson(x, (Object)poll.j);
            x.w("endsAt");
            this.longAdapter.toJson(x, (Object)poll.k);
            x.w("pointsName");
            this.stringAdapter.toJson(x, (Object)poll.l);
            x.w("isAlreadyVoted");
            a.v(poll.m, (JsonAdapter)this.booleanAdapter, x, "type");
            this.pollTypeAdapter.toJson(x, (Object)poll.n);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(Poll)";
    }
}
