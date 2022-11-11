// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.ethereum.rpc;

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
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013" }, d2 = { "Lcom/reddit/vault/ethereum/rpc/RpcCallJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/ethereum/rpc/RpcCall;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Ljava/math/BigInteger;", "nullableBigIntegerAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class RpcCallJsonAdapter extends JsonAdapter<RpcCall>
{
    public static final int $stable = 8;
    private volatile Constructor<RpcCall> constructorRef;
    private final JsonAdapter<BigInteger> nullableBigIntegerAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public RpcCallJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "to", "from", "gas", "gasPrice", "maxFeePerGas", "maxPriorityFeePerGas", "value", "data" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "to");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "from");
        this.nullableBigIntegerAdapter = (JsonAdapter<BigInteger>)y.c((Type)BigInteger.class, (Set)instance, "gas");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 7: {
                    o7 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFF7F;
                    continue;
                }
                case 6: {
                    o6 = this.nullableBigIntegerAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o5 = this.nullableBigIntegerAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o4 = this.nullableBigIntegerAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o3 = this.nullableBigIntegerAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFF7;
                    continue;
                }
                case 2: {
                    o2 = this.nullableBigIntegerAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFD;
                    continue;
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("to", "to", jsonReader);
                }
                case -1: {
                    jsonReader.H();
                    jsonReader.F1();
                    continue;
                }
            }
        }
        jsonReader.r();
        RpcCall rpcCall;
        if (n == -255) {
            if (s == null) {
                throw a.h("to", "to", jsonReader);
            }
            rpcCall = new RpcCall(s, (String)o, (BigInteger)o2, (BigInteger)o3, (BigInteger)o4, (BigInteger)o5, (BigInteger)o6, (String)o7);
        }
        else {
            Constructor<RpcCall> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = RpcCall.class.getDeclaredConstructor(String.class, String.class, BigInteger.class, BigInteger.class, BigInteger.class, BigInteger.class, BigInteger.class, String.class, Integer.TYPE, a.c);
                e.e((Object)(this.constructorRef = constructorRef), "RpcCall::class.java.getD\u2026his.constructorRef = it }");
            }
            if (s == null) {
                throw a.h("to", "to", jsonReader);
            }
            final RpcCall instance = constructorRef.newInstance(s, o, o2, o3, o4, o5, o6, o7, n, null);
            e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            rpcCall = instance;
        }
        return rpcCall;
    }
    
    public final void toJson(final x x, final Object o) {
        final RpcCall rpcCall = (RpcCall)o;
        e.f((Object)x, "writer");
        if (rpcCall != null) {
            x.h();
            x.u("to");
            this.stringAdapter.toJson(x, (Object)rpcCall.a);
            x.u("from");
            this.nullableStringAdapter.toJson(x, (Object)rpcCall.b);
            x.u("gas");
            this.nullableBigIntegerAdapter.toJson(x, (Object)rpcCall.c);
            x.u("gasPrice");
            this.nullableBigIntegerAdapter.toJson(x, (Object)rpcCall.d);
            x.u("maxFeePerGas");
            this.nullableBigIntegerAdapter.toJson(x, (Object)rpcCall.e);
            x.u("maxPriorityFeePerGas");
            this.nullableBigIntegerAdapter.toJson(x, (Object)rpcCall.f);
            x.u("value");
            this.nullableBigIntegerAdapter.toJson(x, (Object)rpcCall.g);
            x.u("data");
            this.nullableStringAdapter.toJson(x, (Object)rpcCall.h);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(RpcCall)";
    }
}
