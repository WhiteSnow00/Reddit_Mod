// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.ethereum.rpc;

import com.squareup.moshi.x;
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

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r" }, d2 = { "Lcom/reddit/vault/ethereum/rpc/EthereumBlockObjectJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/ethereum/rpc/EthereumBlockObject;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Ljava/math/BigInteger;", "nullableBigIntegerAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class EthereumBlockObjectJsonAdapter extends JsonAdapter<EthereumBlockObject>
{
    public static final int $stable = 8;
    private final JsonAdapter<BigInteger> nullableBigIntegerAdapter;
    private final JsonReader$b options;
    
    public EthereumBlockObjectJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "number", "baseFeePerGas" });
        this.nullableBigIntegerAdapter = (JsonAdapter<BigInteger>)y.c((Type)BigInteger.class, (Set)EmptySet.INSTANCE, "number");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        BigInteger bigInteger = null;
        BigInteger bigInteger2 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    bigInteger2 = (BigInteger)this.nullableBigIntegerAdapter.fromJson(jsonReader);
                }
                else {
                    bigInteger = (BigInteger)this.nullableBigIntegerAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        return new EthereumBlockObject(bigInteger, bigInteger2);
    }
    
    public final void toJson(final x x, final Object o) {
        final EthereumBlockObject ethereumBlockObject = (EthereumBlockObject)o;
        e.f((Object)x, "writer");
        if (ethereumBlockObject != null) {
            x.h();
            x.u("number");
            this.nullableBigIntegerAdapter.toJson(x, (Object)ethereumBlockObject.a);
            x.u("baseFeePerGas");
            this.nullableBigIntegerAdapter.toJson(x, (Object)ethereumBlockObject.b);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(EthereumBlockObject)";
    }
}
