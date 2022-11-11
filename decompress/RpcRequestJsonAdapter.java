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
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015" }, d2 = { "Lcom/reddit/vault/ethereum/rpc/RpcRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/ethereum/rpc/RpcRequest;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "listOfAnyAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class RpcRequestJsonAdapter extends JsonAdapter<RpcRequest>
{
    public static final int $stable = 8;
    private volatile Constructor<RpcRequest> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<Object>> listOfAnyAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public RpcRequestJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "method", "params", "jsonrpc", "id" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "method");
        this.listOfAnyAdapter = (JsonAdapter<List<Object>>)y.c((Type)a0.d((Class)List.class, new Type[] { Object.class }), (Set)instance, "params");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "id");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        Integer value = 0;
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                continue;
                            }
                            value = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (value == null) {
                                throw a.n("id", "id", jsonReader);
                            }
                            n &= 0xFFFFFFF7;
                        }
                        else {
                            o2 = this.stringAdapter.fromJson(jsonReader);
                            if (o2 == null) {
                                throw a.n("jsonrpc", "jsonrpc", jsonReader);
                            }
                            n &= 0xFFFFFFFB;
                        }
                    }
                    else {
                        o = this.listOfAnyAdapter.fromJson(jsonReader);
                        if (o != null) {
                            continue;
                        }
                        throw a.n("params", "params", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("method", "method", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        RpcRequest rpcRequest;
        if (n == -13) {
            if (s == null) {
                throw a.h("method", "method", jsonReader);
            }
            if (o == null) {
                throw a.h("params", "params", jsonReader);
            }
            e.d(o2, "null cannot be cast to non-null type kotlin.String");
            rpcRequest = new RpcRequest(s, (String)o2, (List)o, (int)value);
        }
        else {
            Constructor<RpcRequest> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                final Class<Integer> type = Integer.TYPE;
                constructorRef = RpcRequest.class.getDeclaredConstructor(String.class, List.class, String.class, type, type, a.c);
                e.e((Object)(this.constructorRef = constructorRef), "RpcRequest::class.java.g\u2026his.constructorRef = it }");
            }
            if (s == null) {
                throw a.h("method", "method", jsonReader);
            }
            if (o == null) {
                throw a.h("params", "params", jsonReader);
            }
            final RpcRequest instance = constructorRef.newInstance(s, o, o2, value, n, null);
            e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            rpcRequest = instance;
        }
        return rpcRequest;
    }
    
    public final void toJson(final x x, final Object o) {
        final RpcRequest rpcRequest = (RpcRequest)o;
        e.f((Object)x, "writer");
        if (rpcRequest != null) {
            x.h();
            x.u("method");
            this.stringAdapter.toJson(x, (Object)rpcRequest.a);
            x.u("params");
            this.listOfAnyAdapter.toJson(x, (Object)rpcRequest.b);
            x.u("jsonrpc");
            this.stringAdapter.toJson(x, (Object)rpcRequest.c);
            x.u("id");
            xv.a.b(rpcRequest.d, (JsonAdapter)this.intAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(RpcRequest)";
    }
}
