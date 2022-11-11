// 
// Decompiled by Procyon v0.6.0
// 

package io.grpc.kotlin;

import hg2.j;
import hj2.e;
import rg2.p;
import hj2.v;
import lg2.c;
import io.grpc.MethodDescriptor;
import ye2.b;

public final class a
{
    public static Object a(final b b, final MethodDescriptor methodDescriptor, final Object o, final a a, final io.grpc.a a2, final c c) {
        if (methodDescriptor.a == MethodDescriptor.MethodType.UNARY) {
            return kotlinx.coroutines.flow.a.L(new v((p)new HelpersKt$singleOrStatusFlow$1((e)new v((p)new ClientCalls$rpcImpl$1(b, methodDescriptor, a, a2, (a)new a$a$a(o), (c)null)), "request", (Object)methodDescriptor, (c)null)), c);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected a unary RPC method, but got ");
        sb.append(methodDescriptor);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public abstract static class a<RequestT>
    {
        public abstract j a(final ye2.c p0);
    }
}
