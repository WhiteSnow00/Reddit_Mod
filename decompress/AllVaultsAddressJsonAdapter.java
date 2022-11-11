// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.model;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import x82.a;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000f" }, d2 = { "Lcom/reddit/vault/model/AllVaultsAddressJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/model/AllVaultsAddress;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lx82/a;", "addressAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class AllVaultsAddressJsonAdapter extends JsonAdapter<AllVaultsAddress>
{
    public static final int $stable = 8;
    private final JsonAdapter<a> addressAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader$b options;
    
    public AllVaultsAddressJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "address", "createdAt" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.addressAdapter = (JsonAdapter<a>)y.c((Type)a.class, (Set)instance, "address");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdAt");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        a a = null;
        Long n = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    n = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw id2.a.n("createdAt", "createdAt", jsonReader);
                }
                else {
                    a = (a)this.addressAdapter.fromJson(jsonReader);
                    if (a != null) {
                        continue;
                    }
                    throw id2.a.n("address", "address", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (a == null) {
            throw id2.a.h("address", "address", jsonReader);
        }
        if (n != null) {
            return new AllVaultsAddress(a, (long)n);
        }
        throw id2.a.h("createdAt", "createdAt", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final AllVaultsAddress allVaultsAddress = (AllVaultsAddress)o;
        e.f((Object)x, "writer");
        if (allVaultsAddress != null) {
            x.h();
            x.u("address");
            this.addressAdapter.toJson(x, (Object)allVaultsAddress.a);
            x.u("createdAt");
            this.longAdapter.toJson(x, (Object)allVaultsAddress.b);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(AllVaultsAddress)";
    }
}
