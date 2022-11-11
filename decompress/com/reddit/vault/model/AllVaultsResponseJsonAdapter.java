// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.model;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import id2.a$b;
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

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R,\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR.\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015" }, d2 = { "Lcom/reddit/vault/model/AllVaultsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/model/AllVaultsResponse;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "", "", "Lcom/reddit/vault/model/AllVaultsAddress;", "mapOfStringListOfAllVaultsAddressAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/model/ClaimablePointsRoundModel;", "nullableMapOfStringListOfClaimablePointsRoundModelAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class AllVaultsResponseJsonAdapter extends JsonAdapter<AllVaultsResponse>
{
    public static final int $stable = 8;
    private volatile Constructor<AllVaultsResponse> constructorRef;
    private final JsonAdapter<Map<String, List<AllVaultsAddress>>> mapOfStringListOfAllVaultsAddressAdapter;
    private final JsonAdapter<Map<String, List<ClaimablePointsRoundModel>>> nullableMapOfStringListOfClaimablePointsRoundModelAdapter;
    private final JsonReader$b options;
    
    public AllVaultsResponseJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "addresses", "claimPoints" });
        final a$b d = a0.d((Class)Map.class, new Type[] { String.class, (Type)a0.d((Class)List.class, new Type[] { AllVaultsAddress.class }) });
        final EmptySet instance = EmptySet.INSTANCE;
        this.mapOfStringListOfAllVaultsAddressAdapter = (JsonAdapter<Map<String, List<AllVaultsAddress>>>)y.c((Type)d, (Set)instance, "addresses");
        this.nullableMapOfStringListOfClaimablePointsRoundModelAdapter = (JsonAdapter<Map<String, List<ClaimablePointsRoundModel>>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, (Type)a0.d((Class)List.class, new Type[] { ClaimablePointsRoundModel.class }) }), (Set)instance, "claimPoints");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Object o2;
        Object o = o2 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    o2 = this.nullableMapOfStringListOfClaimablePointsRoundModelAdapter.fromJson(jsonReader);
                }
                else {
                    o = this.mapOfStringListOfAllVaultsAddressAdapter.fromJson(jsonReader);
                    if (o == null) {
                        throw a.n("addresses", "addresses", jsonReader);
                    }
                    n &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        AllVaultsResponse allVaultsResponse;
        if (n == -2) {
            e.d(o, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.collections.List<com.reddit.vault.model.AllVaultsAddress>>");
            allVaultsResponse = new AllVaultsResponse((Map)o, (Map)o2);
        }
        else {
            Constructor<AllVaultsResponse> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = AllVaultsResponse.class.getDeclaredConstructor(Map.class, Map.class, Integer.TYPE, a.c);
                e.e((Object)(this.constructorRef = constructorRef), "AllVaultsResponse::class\u2026his.constructorRef = it }");
            }
            final AllVaultsResponse instance = constructorRef.newInstance(o, o2, n, null);
            e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            allVaultsResponse = instance;
        }
        return allVaultsResponse;
    }
    
    public final void toJson(final x x, final Object o) {
        final AllVaultsResponse allVaultsResponse = (AllVaultsResponse)o;
        e.f((Object)x, "writer");
        if (allVaultsResponse != null) {
            x.h();
            x.u("addresses");
            this.mapOfStringListOfAllVaultsAddressAdapter.toJson(x, (Object)allVaultsResponse.a);
            x.u("claimPoints");
            this.nullableMapOfStringListOfClaimablePointsRoundModelAdapter.toJson(x, (Object)allVaultsResponse.b);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(AllVaultsResponse)";
    }
}
