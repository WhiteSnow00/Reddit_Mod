// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.model;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.math.BigInteger;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r" }, d2 = { "Lcom/reddit/vault/model/DistributionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/model/Distribution;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Ljava/math/BigInteger;", "bigIntegerAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class DistributionJsonAdapter extends JsonAdapter<Distribution>
{
    public static final int $stable = 8;
    private final JsonAdapter<BigInteger> bigIntegerAdapter;
    private final JsonReader$b options;
    
    public DistributionJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "totalAvailable" });
        this.bigIntegerAdapter = (JsonAdapter<BigInteger>)y.c((Type)BigInteger.class, (Set)EmptySet.INSTANCE, "totalAvailable");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        BigInteger bigInteger = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    continue;
                }
                bigInteger = (BigInteger)this.bigIntegerAdapter.fromJson(jsonReader);
                if (bigInteger != null) {
                    continue;
                }
                throw a.n("totalAvailable", "totalAvailable", jsonReader);
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (bigInteger != null) {
            return new Distribution(bigInteger);
        }
        throw a.h("totalAvailable", "totalAvailable", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final Distribution distribution = (Distribution)o;
        e.f((Object)x, "writer");
        if (distribution != null) {
            x.h();
            x.u("totalAvailable");
            this.bigIntegerAdapter.toJson(x, (Object)distribution.a);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(Distribution)";
    }
}
