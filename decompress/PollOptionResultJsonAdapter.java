// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.meta.model;

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

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/meta/model/PollOptionResultJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/PollOptionResult;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigInteger;", "bigIntegerAdapter", "", "floatAdapter", "", "stringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class PollOptionResultJsonAdapter extends JsonAdapter<PollOptionResult>
{
    private final JsonAdapter<BigInteger> bigIntegerAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Float> floatAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public PollOptionResultJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "userSelected", "votes", "votesPercent", "votesPercentText", "votesText" });
        final Class<Boolean> type = Boolean.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)type, (Set)instance, "userSelected");
        this.bigIntegerAdapter = (JsonAdapter<BigInteger>)y.c((Type)BigInteger.class, (Set)instance, "votes");
        this.floatAdapter = (JsonAdapter<Float>)y.c((Type)Float.TYPE, (Set)instance, "votesPercent");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "votesPercentText");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Serializable s2;
        Serializable s = s2 = null;
        Serializable s4;
        Serializable s3 = s4 = s2;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f != 4) {
                                    continue;
                                }
                                s4 = (String)this.stringAdapter.fromJson(jsonReader);
                                if (s4 != null) {
                                    continue;
                                }
                                throw a.n("votesText", "votesText", jsonReader);
                            }
                            else {
                                s3 = (String)this.stringAdapter.fromJson(jsonReader);
                                if (s3 != null) {
                                    continue;
                                }
                                throw a.n("votesPercentText", "votesPercentText", jsonReader);
                            }
                        }
                        else {
                            s = (Float)this.floatAdapter.fromJson(jsonReader);
                            if (s != null) {
                                continue;
                            }
                            throw a.n("votesPercent", "votesPercent", jsonReader);
                        }
                    }
                    else {
                        s2 = (BigInteger)this.bigIntegerAdapter.fromJson(jsonReader);
                        if (s2 != null) {
                            continue;
                        }
                        throw a.n("votes", "votes", jsonReader);
                    }
                }
                else {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("userSelected", "userSelected", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (b == null) {
            throw a.h("userSelected", "userSelected", jsonReader);
        }
        final boolean booleanValue = b;
        if (s2 == null) {
            throw a.h("votes", "votes", jsonReader);
        }
        if (s == null) {
            throw a.h("votesPercent", "votesPercent", jsonReader);
        }
        final float floatValue = (float)s;
        if (s3 == null) {
            throw a.h("votesPercentText", "votesPercentText", jsonReader);
        }
        if (s4 != null) {
            return new PollOptionResult(booleanValue, (BigInteger)s2, floatValue, (String)s3, (String)s4);
        }
        throw a.h("votesText", "votesText", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final PollOptionResult pollOptionResult = (PollOptionResult)o;
        f.f((Object)x, "writer");
        if (pollOptionResult != null) {
            x.h();
            x.w("userSelected");
            a.v(pollOptionResult.f, (JsonAdapter)this.booleanAdapter, x, "votes");
            this.bigIntegerAdapter.toJson(x, (Object)pollOptionResult.g);
            x.w("votesPercent");
            this.floatAdapter.toJson(x, (Object)pollOptionResult.h);
            x.w("votesPercentText");
            this.stringAdapter.toJson(x, (Object)pollOptionResult.i);
            x.w("votesText");
            this.stringAdapter.toJson(x, (Object)pollOptionResult.j);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(PollOptionResult)";
    }
}
