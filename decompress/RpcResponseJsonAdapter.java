// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.ethereum.rpc;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import kotlin.collections.EmptySet;
import sg2.e;
import java.lang.reflect.Type;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u0012" }, d2 = { "Lcom/reddit/vault/ethereum/rpc/RpcResponseJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/ethereum/rpc/RpcResponse;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableTNullableAnyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/ethereum/rpc/RpcError;", "nullableRpcErrorAdapter", "Lcom/squareup/moshi/y;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/y;[Ljava/lang/reflect/Type;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class RpcResponseJsonAdapter<T> extends JsonAdapter<RpcResponse<T>>
{
    public static final int $stable = 8;
    private final JsonAdapter<RpcError> nullableRpcErrorAdapter;
    private final JsonAdapter<T> nullableTNullableAnyAdapter;
    private final JsonReader$b options;
    
    public RpcResponseJsonAdapter(final y y, final Type[] array) {
        e.f((Object)y, "moshi");
        e.f((Object)array, "types");
        if (array.length == 1) {
            this.options = JsonReader$b.a(new String[] { "result", "error" });
            final Type type = array[0];
            final EmptySet instance = EmptySet.INSTANCE;
            this.nullableTNullableAnyAdapter = (JsonAdapter<T>)y.c(type, (Set)instance, "result");
            this.nullableRpcErrorAdapter = (JsonAdapter<RpcError>)y.c((Type)RpcError.class, (Set)instance, "error");
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("TypeVariable mismatch: Expecting ");
        sb.append(1);
        sb.append(" type for generic type variables [");
        sb.append("T");
        sb.append("], but received ");
        sb.append(array.length);
        final String string = sb.toString();
        e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalArgumentException(string.toString());
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Object fromJson = null;
        RpcError rpcError = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    rpcError = (RpcError)this.nullableRpcErrorAdapter.fromJson(jsonReader);
                }
                else {
                    fromJson = this.nullableTNullableAnyAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        return new RpcResponse(fromJson, rpcError);
    }
    
    public final void toJson(final x x, final Object o) {
        final RpcResponse rpcResponse = (RpcResponse)o;
        e.f((Object)x, "writer");
        if (rpcResponse != null) {
            x.h();
            x.u("result");
            this.nullableTNullableAnyAdapter.toJson(x, rpcResponse.a);
            x.u("error");
            this.nullableRpcErrorAdapter.toJson(x, (Object)rpcResponse.b);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(RpcResponse)";
    }
}
