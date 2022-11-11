// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.model;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import java.util.Map;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R,\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013" }, d2 = { "Lcom/reddit/vault/model/CryptoContractsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/model/CryptoContractsResponse;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "", "", "Lcom/reddit/vault/model/CryptoContractData;", "mapOfStringListOfCryptoContractDataAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class CryptoContractsResponseJsonAdapter extends JsonAdapter<CryptoContractsResponse>
{
    public static final int $stable = 8;
    private volatile Constructor<CryptoContractsResponse> constructorRef;
    private final JsonAdapter<Map<String, List<CryptoContractData>>> mapOfStringListOfCryptoContractDataAdapter;
    private final JsonReader$b options;
    
    public CryptoContractsResponseJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "contacts" });
        this.mapOfStringListOfCryptoContractDataAdapter = (JsonAdapter<Map<String, List<CryptoContractData>>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, (Type)a0.d((Class)List.class, new Type[] { CryptoContractData.class }) }), (Set)EmptySet.INSTANCE, "contracts");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Object o = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    continue;
                }
                o = this.mapOfStringListOfCryptoContractDataAdapter.fromJson(jsonReader);
                if (o == null) {
                    throw a.n("contracts", "contacts", jsonReader);
                }
                n &= 0xFFFFFFFE;
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        CryptoContractsResponse cryptoContractsResponse;
        if (n == -2) {
            e.d(o, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.collections.List<com.reddit.vault.model.CryptoContractData>>");
            cryptoContractsResponse = new CryptoContractsResponse((Map)o);
        }
        else {
            Constructor<CryptoContractsResponse> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = CryptoContractsResponse.class.getDeclaredConstructor(Map.class, Integer.TYPE, a.c);
                e.e((Object)(this.constructorRef = constructorRef), "CryptoContractsResponse:\u2026his.constructorRef = it }");
            }
            final CryptoContractsResponse instance = constructorRef.newInstance(o, n, null);
            e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            cryptoContractsResponse = instance;
        }
        return cryptoContractsResponse;
    }
    
    public final void toJson(final x x, final Object o) {
        final CryptoContractsResponse cryptoContractsResponse = (CryptoContractsResponse)o;
        e.f((Object)x, "writer");
        if (cryptoContractsResponse != null) {
            x.h();
            x.u("contacts");
            this.mapOfStringListOfCryptoContractDataAdapter.toJson(x, (Object)cryptoContractsResponse.a);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(CryptoContractsResponse)";
    }
}
