// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.ethereum.rpc;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import java.math.BigInteger;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0011" }, d2 = { "Lcom/reddit/vault/ethereum/rpc/EthereumFeeHistoryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/ethereum/rpc/EthereumFeeHistory;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Ljava/math/BigInteger;", "nullableBigIntegerAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "", "nullableListOfBigIntegerAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class EthereumFeeHistoryJsonAdapter extends JsonAdapter<EthereumFeeHistory>
{
    public static final int $stable = 8;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<BigInteger> nullableBigIntegerAdapter;
    private final JsonAdapter<List<BigInteger>> nullableListOfBigIntegerAdapter;
    private final JsonReader$b options;
    
    public EthereumFeeHistoryJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "oldestBlock", "gasUsedRatio", "baseFeePerGas" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableBigIntegerAdapter = (JsonAdapter<BigInteger>)y.c((Type)BigInteger.class, (Set)instance, "oldestBlock");
        this.doubleAdapter = (JsonAdapter<Double>)y.c((Type)Double.TYPE, (Set)instance, "gasUsedRatio");
        this.nullableListOfBigIntegerAdapter = (JsonAdapter<List<BigInteger>>)y.c((Type)a0.d((Class)List.class, new Type[] { BigInteger.class }), (Set)instance, "baseFeePerGas");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Double n = null;
        Object o2;
        Object o = o2 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            continue;
                        }
                        o2 = this.nullableListOfBigIntegerAdapter.fromJson(jsonReader);
                    }
                    else {
                        n = (Double)this.doubleAdapter.fromJson(jsonReader);
                        if (n != null) {
                            continue;
                        }
                        throw a.n("gasUsedRatio", "gasUsedRatio", jsonReader);
                    }
                }
                else {
                    o = this.nullableBigIntegerAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (n != null) {
            return new EthereumFeeHistory((BigInteger)o, (double)n, (List)o2);
        }
        throw a.h("gasUsedRatio", "gasUsedRatio", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final EthereumFeeHistory ethereumFeeHistory = (EthereumFeeHistory)o;
        e.f((Object)x, "writer");
        if (ethereumFeeHistory != null) {
            x.h();
            x.u("oldestBlock");
            this.nullableBigIntegerAdapter.toJson(x, (Object)ethereumFeeHistory.a);
            x.u("gasUsedRatio");
            this.doubleAdapter.toJson(x, (Object)ethereumFeeHistory.b);
            x.u("baseFeePerGas");
            this.nullableListOfBigIntegerAdapter.toJson(x, (Object)ethereumFeeHistory.c);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(EthereumFeeHistory)";
    }
}
