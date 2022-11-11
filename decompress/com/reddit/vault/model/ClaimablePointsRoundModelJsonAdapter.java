// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.model;

import al0.b;
import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import x82.a;
import java.math.BigInteger;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/reddit/vault/model/ClaimablePointsRoundModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/model/ClaimablePointsRoundModel;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigInteger;", "bigIntegerAdapter", "Lx82/a;", "nullableAddressAdapter", "", "nullableStringAdapter", "", "intAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class ClaimablePointsRoundModelJsonAdapter extends JsonAdapter<ClaimablePointsRoundModel>
{
    public static final int $stable = 8;
    private final JsonAdapter<BigInteger> bigIntegerAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<a> nullableAddressAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public ClaimablePointsRoundModelJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "expiresAt", "pointsToClaim", "round", "address", "signature", "totalKarma", "userKarma" });
        final Class<Long> type = Long.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)type, (Set)instance, "expiresAt");
        this.bigIntegerAdapter = (JsonAdapter<BigInteger>)y.c((Type)BigInteger.class, (Set)instance, "pointsToClaim");
        this.nullableAddressAdapter = (JsonAdapter<a>)y.c((Type)a.class, (Set)instance, "address");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "signature");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "totalKarma");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Long n = null;
        Integer n3;
        Integer n2 = n3 = null;
        Number n5;
        Number n4 = n5 = n3;
        Object o2;
        Object o = o2 = n5;
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 6: {
                    n3 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n3 != null) {
                        continue;
                    }
                    throw id2.a.n("userKarma", "userKarma", jsonReader);
                }
                case 5: {
                    n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw id2.a.n("totalKarma", "totalKarma", jsonReader);
                }
                case 4: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    o = this.nullableAddressAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    n5 = (BigInteger)this.bigIntegerAdapter.fromJson(jsonReader);
                    if (n5 != null) {
                        continue;
                    }
                    throw id2.a.n("round", "round", jsonReader);
                }
                case 1: {
                    n4 = (BigInteger)this.bigIntegerAdapter.fromJson(jsonReader);
                    if (n4 != null) {
                        continue;
                    }
                    throw id2.a.n("pointsToClaim", "pointsToClaim", jsonReader);
                }
                case 0: {
                    n = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw id2.a.n("expiresAt", "expiresAt", jsonReader);
                }
                case -1: {
                    jsonReader.H();
                    jsonReader.F1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == null) {
            throw id2.a.h("expiresAt", "expiresAt", jsonReader);
        }
        final long longValue = n;
        if (n4 == null) {
            throw id2.a.h("pointsToClaim", "pointsToClaim", jsonReader);
        }
        if (n5 == null) {
            throw id2.a.h("round", "round", jsonReader);
        }
        if (n2 == null) {
            throw id2.a.h("totalKarma", "totalKarma", jsonReader);
        }
        final int intValue = n2;
        if (n3 != null) {
            return new ClaimablePointsRoundModel(longValue, (BigInteger)n4, (BigInteger)n5, (a)o, (String)o2, intValue, (int)n3);
        }
        throw id2.a.h("userKarma", "userKarma", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final ClaimablePointsRoundModel claimablePointsRoundModel = (ClaimablePointsRoundModel)o;
        e.f((Object)x, "writer");
        if (claimablePointsRoundModel != null) {
            x.h();
            x.u("expiresAt");
            this.longAdapter.toJson(x, (Object)claimablePointsRoundModel.a);
            x.u("pointsToClaim");
            this.bigIntegerAdapter.toJson(x, (Object)claimablePointsRoundModel.b);
            x.u("round");
            this.bigIntegerAdapter.toJson(x, (Object)claimablePointsRoundModel.c);
            x.u("address");
            this.nullableAddressAdapter.toJson(x, (Object)claimablePointsRoundModel.d);
            x.u("signature");
            this.nullableStringAdapter.toJson(x, (Object)claimablePointsRoundModel.e);
            x.u("totalKarma");
            b.n(claimablePointsRoundModel.f, (JsonAdapter)this.intAdapter, x, "userKarma");
            xv.a.b(claimablePointsRoundModel.g, (JsonAdapter)this.intAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(ClaimablePointsRoundModel)";
    }
}
