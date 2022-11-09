// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.meta.model;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import java.io.Serializable;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.math.BigInteger;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/meta/model/LeaderboardItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/LeaderboardItem;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigInteger;", "bigIntegerAdapter", "", "stringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class LeaderboardItemJsonAdapter extends JsonAdapter<LeaderboardItem>
{
    private final JsonAdapter<BigInteger> bigIntegerAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public LeaderboardItemJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "position", "score", "userId", "userName" });
        final Class<Integer> type = Integer.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)type, (Set)instance, "position");
        this.bigIntegerAdapter = (JsonAdapter<BigInteger>)y.c((Type)BigInteger.class, (Set)instance, "score");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "userId");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Integer n = null;
        BigInteger bigInteger = null;
        Serializable s2;
        Serializable s = s2 = bigInteger;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                continue;
                            }
                            s2 = (String)this.stringAdapter.fromJson(jsonReader);
                            if (s2 != null) {
                                continue;
                            }
                            throw a.n("userName", "userName", jsonReader);
                        }
                        else {
                            s = (String)this.stringAdapter.fromJson(jsonReader);
                            if (s != null) {
                                continue;
                            }
                            throw a.n("userId", "userId", jsonReader);
                        }
                    }
                    else {
                        bigInteger = (BigInteger)this.bigIntegerAdapter.fromJson(jsonReader);
                        if (bigInteger != null) {
                            continue;
                        }
                        throw a.n("score", "score", jsonReader);
                    }
                }
                else {
                    n = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw a.n("position", "position", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (n == null) {
            throw a.h("position", "position", jsonReader);
        }
        final int intValue = n;
        if (bigInteger == null) {
            throw a.h("score", "score", jsonReader);
        }
        if (s == null) {
            throw a.h("userId", "userId", jsonReader);
        }
        if (s2 != null) {
            return new LeaderboardItem(intValue, (String)s, (String)s2, bigInteger);
        }
        throw a.h("userName", "userName", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final LeaderboardItem leaderboardItem = (LeaderboardItem)o;
        f.f((Object)x, "writer");
        if (leaderboardItem != null) {
            x.h();
            x.w("position");
            c.n(leaderboardItem.a, this.intAdapter, x, "score");
            this.bigIntegerAdapter.toJson(x, (Object)leaderboardItem.b);
            x.w("userId");
            this.stringAdapter.toJson(x, (Object)leaderboardItem.c);
            x.w("userName");
            this.stringAdapter.toJson(x, (Object)leaderboardItem.d);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(LeaderboardItem)";
    }
}
