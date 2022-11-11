// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.premium.datasource.remote;

import al0.b;
import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000f" }, d2 = { "Lcom/reddit/data/premium/datasource/remote/CancellationOfferDescriptionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/premium/datasource/remote/CancellationOfferDescription;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CancellationOfferDescriptionJsonAdapter extends JsonAdapter<CancellationOfferDescription>
{
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public CancellationOfferDescriptionJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "bonus_coins", "description" });
        final Class<Integer> type = Integer.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)type, (Set)instance, "bonusCoins");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "description");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Integer n = null;
        String s = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("description", "description", jsonReader);
                }
                else {
                    n = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw a.n("bonusCoins", "bonus_coins", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (n == null) {
            throw a.h("bonusCoins", "bonus_coins", jsonReader);
        }
        final int intValue = n;
        if (s != null) {
            return new CancellationOfferDescription(intValue, s);
        }
        throw a.h("description", "description", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final CancellationOfferDescription cancellationOfferDescription = (CancellationOfferDescription)o;
        e.f((Object)x, "writer");
        if (cancellationOfferDescription != null) {
            x.h();
            x.u("bonus_coins");
            b.n(cancellationOfferDescription.a, (JsonAdapter)this.intAdapter, x, "description");
            this.stringAdapter.toJson(x, (Object)cancellationOfferDescription.b);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(CancellationOfferDescription)";
    }
}
